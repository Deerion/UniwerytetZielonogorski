package lab5_p;

import java.util.ArrayList;
import lab5_p.Samochod;
import lab5_p.AutoKomis;

public class Main {
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod("Opel", "Astra", 1.6, "Sedan", "Benzyna", 2010, 20000, "2021-01-01");
        Samochod samochod2 = new Samochod("Toyota", "Yaris", 1.0, "Hatchback", "Benzyna", 2015, 30000, "2022-01-01");

        ArrayList<Samochod> samochody = new ArrayList<>();
        samochody.add(samochod1);
        samochody.add(samochod2);

        samochod1.setMarka("Opel2");
        String markaSamochodu = samochod1.getMarka();
        System.out.println("Marka samochodu: " + markaSamochodu);
        System.out.print("\n");

        for (Samochod samochod : samochody) {
            System.out.println(samochod.wyswietl());
            System.out.println(samochod.czyMaGwarancje());
            System.out.print("\n");
        }
    }
}
