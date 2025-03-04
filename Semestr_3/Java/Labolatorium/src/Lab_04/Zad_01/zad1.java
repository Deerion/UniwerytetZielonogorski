package Lab_04.Zad_01;

import java.util.Random;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] tab1 = new int[30];
        int[] tab2 = new int[30];

        for (int i = 0; i < 30; i++) {
            tab1[i] = r.nextInt(51)+99;
        }

        System.arraycopy(tab1, 0, tab2, 0, tab1.length);


        System.out.println("Tablica 1");
        for(int i = 0; i < tab1.length; i++){
            System.out.print(tab1[i] + " ");
        }

        System.out.println();

        System.out.println("Tablica 2");
        for(int i = 0; i < tab2.length; i++){
            System.out.print(tab2[i] + " ");
        }


        /*
        int [] tab3 = new int[10];
        int [] tab4 = new int[30];


        System.out.println(tab3.length);
        System.out.println(tab4.length);

        tab4 = tab3.clone();

        System.out.println(tab4.length);
        */


    }

}
