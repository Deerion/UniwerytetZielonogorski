package Lab_04.Zad_04;

import java.util.Random;

public class Main {

    public static int ROZMIAR = 320_000_000;
    public static int[] tab = new int[ROZMIAR];
    public static double[] tabDouble = new double[ROZMIAR];

    public static void wypelnijTabliceInt() {
        Random rand = new Random();
        for (int i = 0; i < ROZMIAR; i++) {
            tab[i] = rand.nextInt();
        }
    }

    public static void wypelnijTabliceDouble() {
        Random rand = new Random();
        for (int i = 0; i < ROZMIAR; i++) {
            tabDouble[i] = rand.nextDouble();
        }
    }

    public static void znajdzMinMax(int liczbaWatkow, boolean dlaDouble) {
        Watek[] watki;
        if (dlaDouble) {
            watki = new Watek[liczbaWatkow];
        } else {
            watki = new Watek[liczbaWatkow];
        }

        int wielkoscPartii = ROZMIAR / liczbaWatkow;

        // Przechowywanie czasów pomiarów
        long[] czasyPomiarow = new long[3];
        long sumaCzasow = 0;

        for (int i = 0; i < 3; i++) {

            long start = System.nanoTime();

            // Uruchomienie wątków
            for (int j = 0; j < liczbaWatkow; j++) {
                int startIdx = j * wielkoscPartii;
                int koniecIdx = Math.min(startIdx + wielkoscPartii, ROZMIAR);

                if (dlaDouble) {
                    watki[j] = new Watek(startIdx, koniecIdx, j + 1, true); // Double
                } else {
                    watki[j] = new Watek(startIdx, koniecIdx, j + 1, false); // Int
                }

                watki[j].start();
            }

            try {
                for (int j = 0; j < watki.length; j++) {
                    watki[j].join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long end = System.nanoTime();
            long czasWykonania = (end - start) / 1_000_000;
            czasyPomiarow[i] = czasWykonania;
            sumaCzasow += czasWykonania;


            System.out.println("Czas dla " + liczbaWatkow + " wątków (pomiar " + (i + 1) + "): " + czasWykonania + " ms");
        }

        long sredniCzas = sumaCzasow / 3;
        System.out.println("Średni czas dla " + liczbaWatkow + " wątków: " + sredniCzas + " ms");
    }

    public static void main(String[] args) {

        int[] liczbaWatkow = {1, 2, 3, 4, 5, 6, 7, 8, 20, 100, 500};

        for (int i = 0; i < liczbaWatkow.length; i++) {
            int watki = liczbaWatkow[i];

            System.out.println("\n== " + watki + " WĄTKÓW (Int) ==");
            wypelnijTabliceInt();
            znajdzMinMax(watki, false);

            System.out.println("\n== " + watki + " WĄTKÓW (Double) ==");
            wypelnijTabliceDouble();
            znajdzMinMax(watki, true);
        }
    }
}
