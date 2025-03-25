package Lab_03.Zad_01;
import java.util.Random;

public class Watek extends Thread {
    Random rand = new Random();

   public void run() {
       for (int i = 1; i <= 10; i++) {
           try {
               int opuznienie = rand.nextInt(101);
               Thread.sleep(opuznienie);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

           if(this.getName().equals("Watek-1")) {
               try {
                   Thread.sleep(200);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
         System.out.println(this.getName() +" Licznik-"+ i);
      }
   }

}
