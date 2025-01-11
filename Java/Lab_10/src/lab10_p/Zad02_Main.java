package lab10_p;

public class Zad02_Main {
    public static void main(String[] args) {

        Zad_02 generatorRunnable1 = new Zad_02(1, 50);
        Thread generatorThread1 = new Thread(generatorRunnable1);

        Zad_02 generatorRunnable2 = new Zad_02(51, 50);
        Thread generatorThread2 = new Thread(generatorRunnable2);

        generatorThread1.start();
        generatorThread2.start();

        try {
            generatorThread1.join();
            generatorThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            new Thread(new LogReader()).start();
        }
    }
}
