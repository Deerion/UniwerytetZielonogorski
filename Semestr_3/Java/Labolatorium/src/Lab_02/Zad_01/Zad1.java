package Lab_02.Zad_01;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int wysokosc;
        System.out.print("Podaj Wysokosc: ");

        wysokosc = scanner.nextInt();

        for(int i=0;i<wysokosc;i++){
            for(int j=0; j < wysokosc - i;j++){
                System.out.print(" ");
            }
            for(int j=0; j < 2 * i + 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
