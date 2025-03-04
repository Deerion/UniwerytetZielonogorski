package Lab_10;

public class MojRunnable2 implements Runnable {
    private int startId;
    private int numberOfLogs;

    MojRunnable2(int startId, int numberOfLogs) {
        this.startId = startId;
        this.numberOfLogs = numberOfLogs;
    }

    public void run() {
        LogWriter logWriter = new LogWriter(startId, numberOfLogs);
        logWriter.generateLogs();
    }
}
