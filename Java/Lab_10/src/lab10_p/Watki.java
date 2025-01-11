package lab10_p;

public class Watki {
    public static void main(String[] args) {
        MojeRunable mojRunnable = new MojeRunable();

        Thread watek1 = new Thread(mojRunnable);
        Thread watek2 = new Thread(mojRunnable);

        watek1.setName("Wątek 1");
        watek2.setName("Wątek 2");

        watek1.start();
        watek2.start();

        try {
            watek1.join();
            watek2.join();
        } catch (InterruptedException z) {
            z.printStackTrace();
        }

        int suma = mojRunnable.getSuma();
        System.out.println("Wynik końcowy: " + suma);
    }
}
