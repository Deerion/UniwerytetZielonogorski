package Lab_02.Zad_02;

public class Watek2 extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("\t Liczba: "+ i + " Wątek_2");
        }
    }
}
