package Lab_03.Zad_05;
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj nieujemną liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        if (liczba < 0) {
            System.out.println("Podana liczba musi być nieujemna.");
            return;
        }
        int potega = 1;
        System.out.println("Potęgi liczby 3 mniejsze niż " + liczba + ":");

        while (potega < liczba) {
            System.out.print(potega + ", ");
            potega *= 3;
        }
    }
}
