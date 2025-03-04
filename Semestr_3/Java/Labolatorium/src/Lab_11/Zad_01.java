package Lab_11;

import java.util.Scanner;

public class Zad_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj licznik: ");
        int licznik = scanner.nextInt();
        System.out.print("Podaj mianownik: ");
        int mianownik = scanner.nextInt();

        try {
            int wynik = licznik / mianownik;
            System.out.println("Wynik dzielenia: " + wynik);
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel cholero przez zero");
        } finally {
            System.out.println("Program zakończony.");
        }
    }
}

