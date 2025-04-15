package Lab_05.Zad_02;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Dane1 extends Thread {
    private int a;
    private Semaphore sem1Done;

    public Dane1(Semaphore sem1Done) {
        this.sem1Done = sem1Done;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość A:");
        a = scanner.nextInt();
        sem1Done.release(); // pozwala wystartować Dane2
    }

    public int getA() {
        return a;
    }
}
