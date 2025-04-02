package Test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Początek");

        Thread w1 = new Thread(new Watek());
        Thread w2 = new Thread(new Watek());

        w1.setName("W1");
        w2.setName("W2");

        w1.start();
        w2.start();

        try {
            w1.join();
            w2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Koniec");
    }
}
