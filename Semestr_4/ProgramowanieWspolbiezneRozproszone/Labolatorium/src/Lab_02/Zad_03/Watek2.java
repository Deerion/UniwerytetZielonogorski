package Lab_02.Zad_03;

public class Watek2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(" \t Liczba: "+ i + " Wątek_2");
        }
    }
}
