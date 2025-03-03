import lab6_p.*;
import java.util.Scanner;

public class Pralka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FrontPanel frontPanel = new FrontPanel();

        System.out.print("Uruchom pralkę: (on/off)");
        String uruchom = scanner.next();
        if (uruchom.equals("on")) {
            System.out.println("Pralka uruchomiona.");
        } else if (uruchom.equals("off")) {
            System.out.println("Pralka wyłączona.");
            System.exit(0);
        } else {
            System.out.println("Nieprawidłowy wybór.");
            System.exit(0);
        }

        Programy.wyswietlProgramy();
        System.out.print("Wybierz program prania (1-6): ");
        int wybor = scanner.nextInt();

        switch (wybor) {
            case 1:
                frontPanel.uruchomProgramSzybkiePranie();
                break;
            case 2:
                frontPanel.uruchomProgramBawelna();
                break;
            case 3:
                frontPanel.uruchomProgramCodzienne();
                break;
            case 4:
                frontPanel.uruchomProgramSyntetyczne();
                break;
            case 5:
                frontPanel.uruchomProgramDelikatne();
                break;
            case 6:
                System.out.print("Wprowadź temperaturę wody (°C):");
                int temperatura = scanner.nextInt();
                while (temperatura > 90 || temperatura < 0){
                    System.out.print("Błędna temperatura, wprowadź temperaturę wody z zakresu 0-90 (°C):");
                    temperatura = scanner.nextInt();
                }

                System.out.print("Wprowadź czas prania wstępnego (Max 120 min): ");
                int czasWstepny = scanner.nextInt();
                while (czasWstepny > 120 || czasWstepny < 0){
                    System.out.print("Błędny czas wstępnego prania, wprowadź czas prania wstępnego z zakresu 0-120 (Min):");
                    czasWstepny = scanner.nextInt();
                }

                System.out.print("Wprowadź czas prania zasadniczego (Max 120 min):");
                int czasZasadniczy = scanner.nextInt();
                while (czasZasadniczy > 120 || czasZasadniczy < 0){
                    System.out.print("Błędny czas zasadniczego prania, wprowadź czas prania wstępnego z zakresu 0-120 (Min):");
                    czasZasadniczy = scanner.nextInt();
                }

                System.out.print("Czy chcesz dodatkowe płukanie? (True-Tak/False-Nie):");
                boolean dodatkowePlukanie = scanner.nextBoolean();


                System.out.print("Wprowadź prędkość wirowania (obr/min Max 1600):");
                int predkoscWirowania = scanner.nextInt();
                while (predkoscWirowania > 1600 || predkoscWirowania < 0){
                    System.out.print("Błędna prędkość wirowania, wprowadź prędkość wirowania z zakresu 0-1600 (obr/min):");
                    predkoscWirowania = scanner.nextInt();
                }

                frontPanel.uruchomWlasnyProgram(temperatura, czasWstepny, czasZasadniczy, dodatkowePlukanie, predkoscWirowania);
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");
        }

    }
}
