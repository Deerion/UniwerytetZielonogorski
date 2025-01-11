package lab10_p;

// Poprawione: Implementacja Runnable i synchronizacja dostępu do 'suma'
public class MojeRunable implements Runnable {
    private int suma;


    public synchronized void run() {
        if (Thread.currentThread().getName().equals("Wątek 1")) {
            for (int i = 1; i <= 1000; i++) {
                suma += i;
            }
        } else if (Thread.currentThread().getName().equals("Wątek 2")) {
            for (int i = 1; i <= 9; i++) {  // Poprawiona pętla
                suma -= i;
            }
        }
    }

    public synchronized int getSuma() {
        return suma;
    }
}

