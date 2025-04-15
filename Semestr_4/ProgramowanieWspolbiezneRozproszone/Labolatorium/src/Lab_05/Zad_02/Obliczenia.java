package Lab_05.Zad_02;

import java.util.concurrent.Semaphore;

public class Obliczenia extends Thread {
    private Semaphore sem2Done;
    private Dane1 dane1;
    private Dane2 dane2;

    public Obliczenia(Semaphore sem2Done, Dane1 dane1, Dane2 dane2) {
        this.sem2Done = sem2Done;
        this.dane1 = dane1;
        this.dane2 = dane2;
    }

    public void run() {
        try {
            sem2Done.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int suma = dane1.getA() + dane2.getB();
        System.out.println("Suma: " + suma);
    }
}
