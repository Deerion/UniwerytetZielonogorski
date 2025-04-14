public class Watek extends Thread {
    private final int start;
    private final int koniec;
    private final int numerWatku;
    private final boolean dlaDouble;

    private int lokalneMin = Integer.MAX_VALUE;
    private int lokalneMax = Integer.MIN_VALUE;
    private double lokalneMinDouble = Double.MAX_VALUE;
    private double lokalneMaxDouble = Double.MIN_VALUE;

    public Watek(int start, int koniec, int numerWatku, boolean dlaDouble) {
        this.start = start;
        this.koniec = koniec;
        this.numerWatku = numerWatku;
        this.dlaDouble = dlaDouble;
    }

    public void run() {
        if (dlaDouble) {
            for (int i = start; i < koniec; i++) {
                double val = Main.tabDouble[i];
                if (val < lokalneMinDouble) lokalneMinDouble = val;
                if (val > lokalneMaxDouble) lokalneMaxDouble = val;
            }
        } else {
            for (int i = start; i < koniec; i++) {
                int val = Main.tab[i];
                if (val < lokalneMin) lokalneMin = val;
                if (val > lokalneMax) lokalneMax = val;
            }
        }


        /* if (dlaDouble) {
            System.out.println("Wątek " + numerWątku + " (Double) przeszukiwał: Min: " + lokalneMinDouble + ", Max: " + lokalneMaxDouble);
        } else {
            System.out.println("Wątek " + numerWątku + " (Int) przeszukiwał: Min: " + lokalneMin + ", Max: " + lokalneMax);
        }
        /
         */
    }

    public int getLokalneMin() {
        return lokalneMin;
    }

    public int getLokalneMax() {
        return lokalneMax;
    }

    public double getLokalneMinDouble() {
        return lokalneMinDouble;
    }

    public double getLokalneMaxDouble() {
        return lokalneMaxDouble;
    }
}
