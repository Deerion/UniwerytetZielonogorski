package Lab_05.Zad_02;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Dane2 extends Thread {
    private int b;
    private Semaphore sem1Done;
    private Semaphore sem2Done;

    public Dane2(Semaphore sem1Done, Semaphore sem2Done) {
        this.sem1Done = sem1Done;
        this.sem2Done = sem2Done;
    }

    public void run() {
        try {
            sem1Done.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość B:");
        b = scanner.nextInt();

        sem2Done.release();
    }

    public int getB() {
        return b;
    }
}
