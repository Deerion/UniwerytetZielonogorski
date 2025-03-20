package Lab_01.Zad_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int wysokosc = 6;

        for(int i=0;i<wysokosc;i++)
        {
            for(int j=0; j < wysokosc - i;j++){
                System.out.print(" ");
            }
            for(int j=0; j < 2 * i + 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i < 6; i++)
        {
            System.out.print(" ");
        }
        System.out.println("*");

        for(int i=0; i < 6; i++)
        {
            System.out.print(" ");
        }
        System.out.println("*");

        for(int i=0; i < 6; i++)
        {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}