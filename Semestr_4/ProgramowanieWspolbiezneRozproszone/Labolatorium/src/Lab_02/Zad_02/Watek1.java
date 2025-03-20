package Lab_02.Zad_02;

public class Watek1 extends Thread {
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