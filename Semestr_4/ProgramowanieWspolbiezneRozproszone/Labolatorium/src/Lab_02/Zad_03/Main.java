package Lab_02.Zad_03;

public class Main {
    public static void main(String[] args) {
        Watek1 w1 = new Watek1();
        Watek2 w2 = new Watek2();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();

    }
}
