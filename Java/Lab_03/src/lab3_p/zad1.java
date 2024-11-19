package lab3_p;
import java.util.ArrayList;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj liczbe calkowita: ");
        int x = scanner.nextInt();
        boolean isPrime = true;

        if (x < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime) {
            System.out.println("Liczba jest pierwsza");
        } else {
            System.out.println("Liczba nie jest pierwsza");
        }



        ArrayList<Integer> parzyste = new ArrayList<>();
        ArrayList<Integer> nieparzyste = new ArrayList<>();
        int sumEven = 0;
        int sumOdd = 0;



        String xString = String.valueOf(x);                     // zamiana int x na string
        for (char cyfraChar : xString.toCharArray()) {          // zamiana string na tablice charow
            int cyfra = Character.getNumericValue(cyfraChar);   // zamiana char na int
            if (cyfra % 2 == 0) {
                parzyste.add(cyfra);
                sumEven += cyfra;
            } else {
                nieparzyste.add(cyfra);
                sumOdd += cyfra;
            }
        }

        // System.out.println("Liczba nieparzystych cyfr: " + nieparzyste.size());
        // System.out.println("suma cyfr nieparzystych: " + sumOdd);
        // System.out.println("Liczba parzystych cyfr: " + parzyste.size());
        // System.out.println("Suma cyfr parzystych: " + sumEven);

        if (nieparzyste.size() == 0) {
            System.out.println("Nie ma cyfr nieparzystych");
        } else {
            System.out.println("Średnia arytmetyczna cyfr nieparzystych: " + sumOdd / nieparzyste.size());
        }
        if(parzyste.size() == 0) {
            System.out.println("Nie ma cyfr parzystych");
        } else {
            System.out.println("Średnia arytmetyczna cyfr parzystych: " + sumEven / parzyste.size());
        }

        System.out.println("stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej cyfr nieparzystych: "+ sumEven / parzyste.size() +":"+  sumOdd / nieparzyste.size() );
    }
}
