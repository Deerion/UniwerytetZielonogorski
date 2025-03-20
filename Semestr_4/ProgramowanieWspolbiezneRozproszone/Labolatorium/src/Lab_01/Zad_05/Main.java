package Lab_01.Zad_05;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int A[][] = new int[5][5];
        int B[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                A[i][j] = random.nextInt(100);
                B[i][j] = random.nextInt(100);
            }
        }

        int C[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 5; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Macierz A:");
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Macierz B:");
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Macierz C:");
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        

    }
}
