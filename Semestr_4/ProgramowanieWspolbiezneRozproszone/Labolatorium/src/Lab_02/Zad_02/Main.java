package Lab_02.Zad_02;


public class Main {
    public static void main(String[] args) {
        Watek1 w1 = new Watek1();
        Watek2 w2 = new Watek2();


        w1.start();
        w2.start();

        // w1.run();  // Sekwencyjnie - nie równolegle

        System.out.println("Koniec programu");
    }
}
