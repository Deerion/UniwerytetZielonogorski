package lab8_p;

import java.util.Scanner;

public class Zad_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj adres e-mail: ");
        String email = scanner.nextLine();

        if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            System.out.println("Adres e-mail jest poprawny.");
        } else {
            System.out.println("Adres e-mail jest niepoprawny.");
        }
    }
}
