package Lab_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Zad_03_Serwer {
    public void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(54321)) {
            System.out.println("Serwer oczekuje na połączenie...");

            Socket socket = serverSocket.accept();
            System.out.println("Połączono z klientem.");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            output.println("Wysłano komunikat do klienta");

            String clientResponse = input.readLine();
            System.out.println("Odpowiedź klienta: " + clientResponse);

            if ("Nawiązano komunikację i wysłano odpowiedź".equals(clientResponse)) {
                Thread.sleep(5000);
                output.println("Połączenie zatwierdzone");
                System.out.println("Połączenie zatwierdzone.");
            } else {
                System.out.println("Zła odpowiedź. Zamykam serwer.");
            }

            socket.close();
            System.out.println("Serwer zakończył pracę.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
