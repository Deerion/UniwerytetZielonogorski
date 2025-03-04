package Lab_04.Zad_04;

import java.util.Random;
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] tab1 = new int[30];
        int[] tab2 = new int[30];

        for (int i = 0; i < 30; i++) {
            tab1[i] = r.nextInt(51) + 99;
        }

        System.arraycopy(tab1, 0, tab2, 0, tab1.length);

        int[] bubbleArray = tab1.clone();
        int[] quickArray = tab1.clone();

        // Sortowanie bąbelkowe
        bubbleSortPartial(bubbleArray, 2);
        System.out.println("Tablica po 2 przebiegach sortowania bąbelkowego:");
        for (int num : bubbleArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sortowanie szybkie - 2 przebiegi
        quickSortPartial(quickArray, 0, quickArray.length - 1, 2);
        System.out.println("Tablica po 2 przebiegach sortowania szybkiego:");
        for (int num : quickArray) {
            System.out.print(num + " ");
        }
    }

    // Metoda sortowania bąbelkowego z ograniczeniem do określonej liczby przebiegów
    public static void bubbleSortPartial(int[] arr, int maxPasses) {
        int n = arr.length;
        for (int i = 0; i < maxPasses; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optymalizacja
        }
    }

    // Metoda sortowania szybkiego z ograniczeniem do określonej liczby przebiegów
    public static void quickSortPartial(int[] arr, int low, int high, int maxDepth) {
        if (low < high && maxDepth > 0) {
            int pi = partition(arr, low, high);
            quickSortPartial(arr, low, pi - 1, maxDepth - 1);
            quickSortPartial(arr, pi + 1, high, maxDepth - 1);
        }
    }

    // Metoda partycjonowania dla sortowania szybkiego
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
