package Lab_02.Zad_04;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        System.out.println("Wcisnij 'Enter' aby zakonczyc");
        while (true) {
            System.out.print("Podaj liczbę: ");
            String liczba = scanner.nextLine();


            /*
            if (liczba.equalsIgnoreCase("")) {
                break;
            }
            */
            if (liczba.isEmpty()) {
                break;
            }
            x = Integer.parseInt(liczba);

            count++;
            sum += x;

            if(min > x){
                min = x;
            }
            // min = Math.min(min,x);

            if(max < x){
                max = x;
            }
            //max = Math.max(max,x);

        }
        double srednia = sum/count;

        System.out.println("Suma liczb to: "+ sum);
        System.out.println("Ilośc liczb to: "+ count);
        System.out.println("Średnia liczb to: "+ srednia);
        System.out.println("Największa liczba to: "+ min);
        System.out.println("Największa liczba to: "+ max);




    }
}