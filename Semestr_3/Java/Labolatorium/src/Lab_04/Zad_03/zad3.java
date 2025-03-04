package Lab_04.Zad_03;
import java.util.Random;

public class zad3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] tab1 = new int[40];

        for (int i = 0; i < 11; i++) {
            tab1[i] = r.nextInt(5)+1;

        }
        for (int i = 11; i < 21; i++) {
            tab1[i] = r.nextInt(5)+6;
        }
        for (int i = 21; i < 31; i++) {
            tab1[i] = r.nextInt(44)+11;
        }
        for (int i = 31; i < 40; i++) {
            tab1[i] = r.nextInt(15)+60;
        }

        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }
    }
}
