package lab5_p;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Samochod samochod1 = new Samochod("Opel", "Astra", 1.6, "Sedan", "Benzyna", 2010, 20000, "2020-01-01");
        Samochod samochod2 = new Samochod("Toyota", "Yaris", 1.0, "Hatchback", "Benzyna", 2015, 30000, "2024-01-01");

       // samochod1.setMarka("Opel2");
      //  String markaSamochodu = samochod1.getMarka();

       // System.out.println("Marka samochodu: " + markaSamochodu);
        // System.out.print("\n");


        AutoKomis autoKomis = new AutoKomis();
        autoKomis.dodajSamochod(samochod1);
        autoKomis.dodajSamochod(samochod2);
        autoKomis.wyswietlSamochody();

        System.out.print("\n");
        Samochod.czyMaGwarancje(samochod2);

    }
}
