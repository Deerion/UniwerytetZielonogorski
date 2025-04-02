package Test;

class Watek implements Runnable {
    public void run() {
        if (Thread.currentThread().getName().equals("W1")) {
            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " zakończony");
    }
}
