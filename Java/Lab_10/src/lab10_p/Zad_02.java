package lab10_p;

public class Zad_02 {
    public static void main(String[] args) {
        MojRunnable2 generatorRunnable1 = new MojRunnable2(1, 50);
        Thread generatorThread1 = new Thread(generatorRunnable1);
        MojRunnable2 generatorRunnable2 = new MojRunnable2(51, 50);
        Thread generatorThread2 = new Thread(generatorRunnable2);
        generatorThread1.start();
        generatorThread2.start();

        try {
            generatorThread1.join();
            generatorThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //5 wątków do odczytu logów
        for (int i = 1; i <= 5; i++) {
            new Thread(new LogReader(i)).start();
        }
    }
}
