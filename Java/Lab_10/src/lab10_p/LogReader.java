package lab10_p;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogReader implements Runnable {

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader("logs.txt"))) {
            String line;
            int linesRead = 0;
            while ((line = reader.readLine()) != null && linesRead < 10) {
                System.out.println(line);
                linesRead++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

