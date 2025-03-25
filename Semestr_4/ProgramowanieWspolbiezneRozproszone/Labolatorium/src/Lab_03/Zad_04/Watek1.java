package Lab_03.Zad_04;
import java.util.Random;

public class Watek1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println(this.getName() + " Coś tam tekst");
        }
        try{
            Random rand = new Random();
            int sleepTime = rand.nextInt(1000);
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
