package Lab_05.Zad_01;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Dane extends Thread {
    private  int a = 0;
    private  int b = 0;

    private Semaphore sem;

    public Dane(Semaphore sem) {
        this.sem = sem;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wartość A:");
        a = scanner.nextInt();

        System.out.println("Podaj wartość B:");
        b = scanner.nextInt();

        sem.release();
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
