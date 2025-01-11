package lab10_p;

public class Zad01_Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            Thread thread = new Thread(new Zad_01(i));
            thread.start();
        }
    }
}

