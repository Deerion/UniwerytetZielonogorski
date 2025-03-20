package Lab_01.Zad_02;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba < 2) {
            System.out.println(liczba + " Nie jest liczbą pierwszą.");
            return;
        }

        for (int i = 2; i <= Math.sqrt(liczba); i++) {
            if (liczba % i == 0) {
                System.out.println(liczba + " Nie jest liczbą pierwszą.");
                return;
            }
            else {
                System.out.println(liczba + " Jest liczbą pierwszą.");
                return;
            }
        }
    }
}


