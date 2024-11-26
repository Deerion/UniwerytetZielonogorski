import lab7_p.Kalkulator;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int [] liczby = new int[7];
        for(int i = 0; i < 7; i++) {
            liczby[i] = random.nextInt(100)+1;
        }


        Kalkulator kalk1 = new Kalkulator(liczby[0]);
        kalk1.wyswietlLiczby();
        System.out.println("Suma: " + kalk1.obliczSume());
        System.out.println("Roznica: " + kalk1.obliczRoznice());
        System.out.println("Iloczyn: " + kalk1.obliczIloczyn());
        System.out.println("Iloraz: " + kalk1.obliczIloraz()+"\n");

        // Konstruktor 4-argumentowy
        Kalkulator kalk4 = new Kalkulator(liczby[0], liczby[1], liczby[2], liczby[3]);
        kalk4.wyswietlLiczby();
        System.out.println("Suma: " + kalk4.obliczSume());
        System.out.println("Roznica: " + kalk4.obliczRoznice());
        System.out.println("Iloczyn: " + kalk4.obliczIloczyn());
        System.out.println("Iloraz: " + kalk4.obliczIloraz()+"\n");

        // Konstruktor 7-argumentowy
        Kalkulator kalk7 = new Kalkulator(liczby[0], liczby[1], liczby[2], liczby[3], liczby[4], liczby[5], liczby[6]);
        kalk7.wyswietlLiczby();
        System.out.println("Suma: " + kalk7.obliczSume());
        System.out.println("Roznica: " + kalk7.obliczRoznice());
        System.out.println("Iloczyn: " + kalk7.obliczIloczyn());
        System.out.println("Iloraz: " + kalk7.obliczIloraz()+"\n");



        // Konstruktor kopiujący
        Kalkulator kopiaKalk = new Kalkulator(kalk7);
        kopiaKalk.wyswietlLiczby();
        System.out.println("Suma: " + kopiaKalk.obliczSume());
        System.out.println("Roznica: " + kopiaKalk.obliczRoznice());
        System.out.println("Roznica: " + kopiaKalk.obliczIloczyn());
        System.out.println("Roznica: " + kopiaKalk.obliczIloraz()+"\n");

    }
}