package Lab_05.Zad_02;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore sem1Done = new Semaphore(0);
        Semaphore sem2Done = new Semaphore(0);

        Dane1 dane1 = new Dane1(sem1Done);
        Dane2 dane2 = new Dane2(sem1Done, sem2Done);
        Obliczenia obliczenia = new Obliczenia(sem2Done, dane1, dane2);

        dane1.start();
        dane2.start();
        obliczenia.start();
    }
}
