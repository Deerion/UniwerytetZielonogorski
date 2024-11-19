package tmp;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        A obj = new A(1,2);
        System.out.println("X= "+(obj.getX()));
        System.out.println("Y= "+obj.getY() + "\n");

        obj.setX(5);
        obj.setY(10);

        System.out.println("X= "+(obj.getX()));
        System.out.println("Y= "+obj.getY() + "\n");

        obj.wyswietl();


    }
}
