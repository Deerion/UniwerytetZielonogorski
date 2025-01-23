package lab10_p;

import java.text.SimpleDateFormat;
import java.util.Date;

class MojRunnable implements Runnable {
    private int id;

    MojRunnable(int id) {
        this.id = id;
    }

    public void run() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();


        System.out.println("Wątek " + id + ": wątek: " + id + " - " + dateFormat.format(date));

        try {

            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.err.println("Błąd wątków: " + e.getMessage());
        }
    }
}

public class Zad_01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            Thread thread = new Thread(new MojRunnable(i));
            thread.start();
        }
    }
}
