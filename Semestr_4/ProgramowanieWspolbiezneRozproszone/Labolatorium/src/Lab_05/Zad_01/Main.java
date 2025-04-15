package Lab_05.Zad_01;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(0);

        Dane dane = new Dane(sem);
        Obliczenia obliczenia = new Obliczenia(sem, dane);

        dane.start();
        obliczenia.start();
    }
}
