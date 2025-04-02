package Lab_04.Zad_01;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Mouse extends Thread {
    private final Cake cake;

    public Mouse(final Cake cake, final String name) {
        super(name);
        this.cake = cake;
    }
/*
    private synchronized int eat(int percent) {
        System.out.println(Thread.currentThread()
                .getName() + " jem " + percent + " torta.");
        cake.percent = Math.max(cake.percent - percent, 0);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread()
                .getName() + " zostało " + cake.percent + " torta.");
        return cake.percent;
    }
*/ //Przeniesione do klasy Cake

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (cake.eat(new Random().nextInt(40)) <= 0) {
                System.out.println("======KONIEC=======");
                break;
            }
        }
    }
}

