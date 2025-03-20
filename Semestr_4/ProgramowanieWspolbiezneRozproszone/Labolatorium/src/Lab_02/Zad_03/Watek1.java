package Lab_02.Zad_03;

public class Watek1 implements Runnable {
    public void run() {

        try {
            Thread.sleep(2000); // Opóźnienie o 2 sekundy przed rozpoczęciem pracy wątku
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 1; i <= 20; i++) {
            System.out.println("Liczba: "+ i + " Wątek_1");
        }
    }
}
