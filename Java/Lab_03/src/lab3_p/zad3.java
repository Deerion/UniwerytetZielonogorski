package lab3_p;
import java.util.Scanner;
import java.util.Random;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random los = new Random();
        int x = los.nextInt(200)+1;
        int liczba;

        do {
            System.out.print("Podaj liczbe: ");
            liczba = scanner.nextInt();

            if (liczba == x) {
                System.out.print("Gratulacje! Wylosowana liczba to: " + x);
                break;
            } else if (liczba < x) {
                System.out.print("Podana liczba jest za mała, ");

            } else if (liczba > x) {
                System.out.print("Podana liczba jest za duża, ");
            }
        }while (liczba != x);

    }
}
