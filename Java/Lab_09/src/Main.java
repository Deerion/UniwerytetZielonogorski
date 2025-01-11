import lab9_p.Studentinstytut;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Studentinstytut student = new Studentinstytut();

        student.Ustaw_instytut("Informatyka");
        System.out.println(student.getInstytut());

        student.Ustaw_wydzial("WIEA");

        student.Ustaw_imie("Hubert");
        student.Ustaw_nazwisko("Jarosz");
        student.Ustaw_index(123456);

    }
}