package Lab_04.Zad_02;

public class DzialajacyZiemniak2 implements Runnable {
    public void run() {
        long mnozenie = 1; // Obciążenie CPU
        while (true) {
            for (int i = 0; i < 10000; i++) { // Intensywne obliczenia
                for (int j = 0; j < 1000000; j++) {
                    mnozenie *= i;
                }
            }
            System.out.println(Thread.currentThread().getName() + " skończył iterację.");
        }
    }
}
