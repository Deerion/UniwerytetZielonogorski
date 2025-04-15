package Lab_05.Zad_01;

import java.util.concurrent.Semaphore;

public class Obliczenia extends Thread {
    private Semaphore sem;
    private Dane dane;

    public Obliczenia(Semaphore sem, Dane dane) {
        this.sem = sem;
        this.dane = dane;
    }

    public void run() {
        try {
            sem.acquire(); // czeka na dane
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int suma = dane.getA() + dane.getB(); // teraz działa
        System.out.println("Suma: " + suma);
    }
}
