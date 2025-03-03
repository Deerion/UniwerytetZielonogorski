package lab11_p;

import java.io.*;
import java.net.*;

public class Zad_03_Klient {
    public void startClient() {
        try (Socket socket = new Socket("localhost", 54321)) {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            long startTime = System.currentTimeMillis();

            while (true) {
                if (input.ready()) {
                    String serverMessage = input.readLine();
                    System.out.println("Komunikat od serwera: " + serverMessage);

                    if ("Wysłano komunikat do klienta".equals(serverMessage)) {
                        output.println("Nawiązano komunikację i wysłano odpowiedź");
                    } else if ("Połączenie zatwierdzone".equals(serverMessage)) {
                        System.out.println("Serwer zatwierdził połączenie.");
                    }
                }

                if (System.currentTimeMillis() - startTime > 120000) { // 120 sekund
                    output.println("Kończę pracę");
                    System.out.println("Klient kończy pracę.");
                    break;
                }

                Thread.sleep(100);
            }

            socket.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
