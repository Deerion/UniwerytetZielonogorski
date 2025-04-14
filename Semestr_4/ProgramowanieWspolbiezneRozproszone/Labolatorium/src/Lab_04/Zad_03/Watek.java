package Lab_04.Zad_03;

public class Watek extends Thread {
    private final int start;
    private final int koniec;
    private final int numerWątku;

    private int lokalneMin = Integer.MAX_VALUE;
    private int lokalneMax = Integer.MIN_VALUE;

    private long czasDzialaniaMs;

    public Watek(int start, int koniec, int numerWątku) {
        this.start = start;
        this.koniec = koniec;
        this.numerWątku = numerWątku;
    }

    public void run() {
        long startTime = System.nanoTime();

        // Przeszukiwanie przydzielonego zakresu tablicy
        for (int i = start; i <= koniec; i++) {
            int val = Main.tab[i];
            if (val < lokalneMin) lokalneMin = val;
            if (val > lokalneMax) lokalneMax = val;
        }

        long endTime = System.nanoTime();
        czasDzialaniaMs = (endTime - startTime) / 1_000_000; // Czas w milisekundach

        System.out.println("Wątek " + numerWątku + " przeszukiwał: " + czasDzialaniaMs + " ms");
    }

    public int getLokalneMin() {
        return lokalneMin;
    }

    public int getLokalneMax() {
        return lokalneMax;
    }

    public long getCzasDzialaniaMs() {
        return czasDzialaniaMs;
    }
}
