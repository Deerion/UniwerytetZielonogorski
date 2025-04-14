package Lab_04.Zad_03;

import java.util.Random;

public class Main {

    public static int ROZMIAR = 320_000_000;
    public static int[] tab = new int[ROZMIAR];

    // Wypełnianie tablicy losowymi danymi
    public static void wypelnijTablice() {
        Random rand = new Random();
        for (int i = 0; i < ROZMIAR; i++) {
            tab[i] = rand.nextInt();
        }
    }

    // Metoda do znajdowania min/max z wieloma wątkami
    public static void znajdzMinMax(int liczbaWatkow) {
        Watek[] watki = new Watek[liczbaWatkow];
        int wielkoscPartii = ROZMIAR / liczbaWatkow;

        // Tworzenie i uruchamianie wątków
        for (int i = 0; i < liczbaWatkow; i++) {
            int start = i * wielkoscPartii;
            int koniec = (i == liczbaWatkow - 1) ? ROZMIAR - 1 : (start + wielkoscPartii - 1);
            watki[i] = new Watek(start, koniec, i + 1);
            watki[i].start();
        }

        // Czekanie na zakończenie wszystkich wątków
        try {
            for (Watek w : watki) w.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Wyznaczanie globalnego min i max
        int globalMin = Integer.MAX_VALUE;
        int globalMax = Integer.MIN_VALUE;

        long sumaCzasow = 0;

        // Zbieranie wyników z każdego wątku
        for (int i = 0; i < watki.length; i++) {
            Watek w = watki[i];

            // Znajdowanie globalnego minimum i maksimum
            if (w.getLokalneMin() < globalMin) globalMin = w.getLokalneMin();
            if (w.getLokalneMax() > globalMax) globalMax = w.getLokalneMax();

            // Sumowanie czasów działania wątków
            sumaCzasow += w.getCzasDzialaniaMs();
        }

        // Obliczanie średniego czasu działania wątków
        long sredniCzas = sumaCzasow / liczbaWatkow;

        // Wyświetlanie wyników
        System.out.println("Globalne Min: " + globalMin + ", Globalne Max: " + globalMax);
        System.out.println("Średni czas przeszukiwania przez wątki: " + sredniCzas + " ms");
    }

    public static void main(String[] args) {
        // Wypełnianie tablicy
        wypelnijTablice();

        // Testowanie różnych ilości wątków
        for (int i = 1; i <= 8; i *= 2) {
            System.out.println("\n== " + i + " WĄTKÓW ==");
            znajdzMinMax(i);
        }
    }
}
