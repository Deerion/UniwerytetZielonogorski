package lab2_p;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double a,b,c;
        double delta;

        System.out.print("Podaj a ");
        a= scanner.nextInt();

        System.out.print("Podaj b ");
        b= scanner.nextInt();

        System.out.print("Podaj c ");
        c= scanner.nextInt();

        delta = (Math.pow(b,2)) - 4 * a * c;

        System.out.println("Delta = " + delta);

        if(delta < 0){
            System.out.println("Brak rozwiazan");
        }else if(delta == 0){
            double x = (-b / (2 * a));
            System.out.println("Jeden pierwiastek: x = " + x);
        }else if(delta > 0){
            double x1 = (-b + (Math.sqrt(delta))) / (2 * a);
            double x2 = (-b - (Math.sqrt(delta))) / (2 * a);
            System.out.println("Dwa pierwiastki: \n x1 = " + x1 + "\n x2 = " + x2);

        }
    }
}
