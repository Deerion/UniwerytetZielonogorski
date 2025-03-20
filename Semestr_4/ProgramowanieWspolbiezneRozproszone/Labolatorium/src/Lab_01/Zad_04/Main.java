package Lab_01.Zad_04;

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] tab1 = new int[10];
        int[] tab2 = new int[10];
        int[] tab3 = new int[10];

        for(int i = 0; i < 10; i++) {
            tab1[i] = random.nextInt(100)+1;
            tab2[i] = random.nextInt(100)+1;
            tab3[i] = random.nextInt(100)+1;
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            if (tab1[i] > max1) {
                max1 = tab1[i];
            }
            if (tab2[i] > max2) {
                max2 = tab2[i];
            }
            if (tab3[i] > max3) {
                max3 = tab3[i];
            }
        }

        System.out.println("Max1: " + max1);
        System.out.println("Max2: " + max2);
        System.out.println("Max3: " + max3);

        if (max1 > max2 && max1 > max3) {
            System.out.println("Najwieksza wartosc spośród tablic to: " + max1);
        } else if (max2 > max1 && max2 > max3) {
            System.out.println("Najwieksza wartosc spośród tablic to: " + max2);
        } else {
            System.out.println("Najwieksza wartosc spośród tablic to: " + max3);
        }

    }
}
