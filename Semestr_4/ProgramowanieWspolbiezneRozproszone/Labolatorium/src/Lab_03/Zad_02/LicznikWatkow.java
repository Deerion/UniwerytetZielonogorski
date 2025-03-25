package Lab_03.Zad_02;

public class LicznikWatkow {
    private int wartoscKrytyczna;

    public synchronized int policzMnie() {
        wartoscKrytyczna += 1;

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wartoscKrytyczna--;
        return wartoscKrytyczna;
    }

}
