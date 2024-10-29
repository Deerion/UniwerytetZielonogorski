package lab4_p;
import java.util.Scanner;
import java.util.Random;
import static java.util.Arrays.sort;


public class zad4 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        int [] tab1 = new int[30];

        for (int i = 0; i < 30; i++) {
            tab1[i] = r.nextInt(51)+99;
        }
        sort(tab1);

        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }
    }
}
