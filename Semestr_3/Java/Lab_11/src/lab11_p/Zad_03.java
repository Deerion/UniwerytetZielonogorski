package lab11_p;

public class Zad_03 {
    public static void main(String[] args) {
        Zad_03_Serwer server = new Zad_03_Serwer();
        Zad_03_Klient client = new Zad_03_Klient();

        Thread serverThread = new Thread(server::startServer);
        Thread clientThread = new Thread(client::startClient);

        serverThread.start();
        clientThread.start();

        try {
            serverThread.join();
            clientThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
