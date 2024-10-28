package lab3_p;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe calkowita: ");
        int x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println("Liczba " + x + " jest podzielna przez " + i);
            }
        }
    }
}
