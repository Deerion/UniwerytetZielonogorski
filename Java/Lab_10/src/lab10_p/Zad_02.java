package lab10_p;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Zad_02 implements Runnable {
    private int startId;
    private int numberOfLogs;

    Zad_02(int startId, int numberOfLogs) {
        this.startId = startId;
        this.numberOfLogs = numberOfLogs;
    }

    public void run() {
        LogWriter logWriter = new LogWriter(startId, numberOfLogs);
        logWriter.generateLogs();
    }
}

