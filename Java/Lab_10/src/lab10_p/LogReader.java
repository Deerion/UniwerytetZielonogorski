package lab10_p;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogReader implements Runnable {
    private int threadId;

    public LogReader(int threadId) {
        this.threadId = threadId;
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader("logs.txt"))) {
            String line;
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                if (lineCount >= 10 * (threadId - 1) && lineCount < 10 * threadId) {
                    System.out.println("Wątek " + threadId + ": " + line);
                }
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
