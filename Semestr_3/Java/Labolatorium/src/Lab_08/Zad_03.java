package Lab_08;

import java.util.Scanner;

public class Zad_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj zdanie: ");
        String sentence = scanner.nextLine();

        String[] slowa = sentence.split("\\s+");

        System.out.println("Słowa w zdaniu:");
        for (String word : slowa) {
            System.out.println(word);
        }
    }
}
