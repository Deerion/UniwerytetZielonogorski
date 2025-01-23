package lab10_p;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class LogWriter {
    private int startId;
    private int numberOfLogs;


    LogWriter(int startId, int numberOfLogs) {
        this.startId = startId;
        this.numberOfLogs = numberOfLogs;
    }


    public void generateLogs() {
        Random random = new Random();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try (FileWriter writer = new FileWriter("logs.txt", true)) {
            for (int i = 0; i < numberOfLogs; i++) {
                int movieId = random.nextInt(100) + 1; // id filmu
                int userId = random.nextInt(1000) + 1; // id użytkownika
                int rating = random.nextInt(5) + 1; // ocena (1-5)
                String date = dateFormat.format(new Date()); // bieżąca data


                writer.write(movieId + "," + userId + "," + rating + "," + date + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
