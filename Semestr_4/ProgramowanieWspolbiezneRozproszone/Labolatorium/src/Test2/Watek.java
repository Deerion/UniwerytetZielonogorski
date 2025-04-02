package Test2;

class Watek extends Thread {
    public void run() {
        try {
            if (this.getName().equals("W1")) {
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + " zakończony");
    }
}
