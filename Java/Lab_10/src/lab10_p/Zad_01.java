package lab10_p;

public class Zad_01 implements Runnable {

    private int id;
    Zad_01(int id) {
        this.id = id;
    }
    public void run() {
        System.out.println("Wątek " + id + " uruchomiony");
    }
}
