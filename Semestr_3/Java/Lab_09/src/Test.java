import lab9_p.Studentinstytut;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Studentinstytut student = new Studentinstytut();

        System.out.print("Podaj instytut: ");
        student.Ustaw_instytut(scanner.nextLine());
        System.out.println("Twój instytut to: "+student.getInstytut());

        System.out.print("Podaj wydział: ");
        student.Ustaw_wydzial(scanner.nextLine());

        System.out.print("Podaj imię: ");
        student.Ustaw_imie(scanner.nextLine());

        System.out.print("Podaj nazwisko: ");
        student.Ustaw_nazwisko(scanner.nextLine());

        System.out.print("Podaj index: ");
        student.Ustaw_index(scanner.nextInt());

    }
}