package Lab_02.Zad_01;
import java.util.Scanner;

public class SpaceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Space2D p1 = new Space2D();
        Space2D p2 = new Space2D(3,4);
        Space2D p3 = new Space2D(5,6);

        System.out.println(p1.getX());
        System.out.println(p2.getY());

        p1.setX(1);
        p1.setY(2);

        p1.wyswietl();
        System.out.println();

        System.out.println("Odleglosc miedzy p1 i p2: ");
        System.out.println(p1.odleglosc2p(p2));
        System.out.println();

        System.out.println("Odleglosc miedzy p1 i 0,0: ");
        System.out.println(p1.odleglosc2Zero());
        System.out.println();

        System.out.println("Metoda toString: ");
        System.out.println(p1.toString());
        System.out.println();

        System.out.println("Obwód trójkata: ");
        System.out.println(p1.obwodTrojkata(p2, p3));
        System.out.println();

        System.out.println("Pole trojkata: ");
        System.out.println(p1.poleTrojkata(p2, p3));

    }
}