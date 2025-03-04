package Lab_03.Zad_03;

import java.util.Random;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random los = new Random();
        int x = los.nextInt(200)+1;
        String liczbatmp;
        int liczba;

        System.out.println(x);
        do {
            System.out.print("Podaj liczbe: ");
            liczbatmp = scanner.nextLine();
            liczba = Integer.parseInt(liczbatmp);


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
