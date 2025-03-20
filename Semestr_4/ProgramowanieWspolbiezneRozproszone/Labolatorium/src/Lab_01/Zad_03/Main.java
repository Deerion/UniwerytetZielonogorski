package Lab_01.Zad_03;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int N = 9;
        int[] tablica = new int[N];

        for(int i = 0; i < N; i++) {
            tablica[i] = random.nextInt(100);
        }

        for(int i = 0; i < N; i++) {
            System.out.println(tablica[i]);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
            if (tablica[i] < min) {
                min = tablica[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        System.out.println("Trzeci największy element tablicy to: "+trzecinajwiekszy(tablica));

        double srednia = 0;
        for (int i = 0; i < N; i++) {
            srednia += tablica[i];
        }
        srednia /= N;
        System.out.println("Srednia: " + srednia);

        System.out.println("wyswietlenie tablicy na odwrót");
        for(int i=N-1; i>0;i--){
            System.out.println(tablica[i]);
        }

        System.out.println("Zamiana elementow (pierwszy staje sie ostatnim)");
        for (int i = 0; i < N/2; i++) {
            int tmp = tablica[i];
            tablica[i] = tablica[N - 1 - i];
            tablica[N - 1 - i] = tmp;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(tablica[i]);
        }


    }




    public static int trzecinajwiekszy(int[] tab2) {
        if (tab2.length < 3) {
            System.out.println("Tablica musi mieć co najmniej 3 elementy.");
        }

        int pierwszy = Integer.MIN_VALUE;
        int drugi = Integer.MIN_VALUE;
        int trzeci = Integer.MIN_VALUE;

        for (int i = 0; i < tab2.length; i++) {
            if (tab2[i] > pierwszy) {
                trzeci = drugi;
                drugi = pierwszy;
                pierwszy = tab2[i];
            } else if (tab2[i] > drugi && tab2[i] < pierwszy) {
                trzeci = drugi;
                drugi = tab2[i];
            } else if (tab2[i] > trzeci && tab2[i] < drugi) {
                trzeci = tab2[i];
            }
        }


        return trzeci;
    }
}


