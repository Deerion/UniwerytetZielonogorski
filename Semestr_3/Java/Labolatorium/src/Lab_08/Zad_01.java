package Lab_08;

import java.util.Scanner;

public class Zad_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Samochod samochod1 = new Samochod("Opel", "Astra", 1.6, "Sedan", "Benzyna", 2010, 20000, "2020-01-01");
        Samochod samochod2 = new Samochod("Toyota", "Yaris", 1.0, "Hatchback", "Benzyna", 2015, 30000, "2024-01-02");
        Samochod samochod3 = new Samochod("Toyota", "Yaris", 1.0, "Hatchback", "Benzyna", 2015, 30000, "2024-01-02");
        Samochod samochod4 = new Samochod("Toyota", "Yaris", 1.0, "Hatchback", "Benzyna", 2015, 30000, "2024-01-02");
        Samochod samochod5 = new Samochod("Toyota", "Yaris", 1.0, "Hatchback", "Benzyna", 2015, 30000, "2024-01-02");
        Samochod samochod6 = new Samochod("Toyota", "Yaris", 1.0, "Hatchback", "Benzyna", 2015, 30000, "2024-01-02");
        Samochod samochod7 = new Samochod("Toyota", "Yaris", 1.0, "Hatchback", "Benzyna", 2015, 30000, "2024-01-02");
        Samochod samochod8 = new Samochod("Toyota", "Yaris", 1.0, "Hatchback", "Benzyna", 2015, 30000, "2024-01-02");
        Samochod samochod9 = new Samochod("Toyota", "Yaris", 1.0, "Hatchback", "Benzyna", 2015, 30000, "2024-01-02");
        Samochod samochod10 = new Samochod("Toyota", "Yaris", 1.0, "Hatchback", "Benzyna", 2015, 30000, "2024-01-02");

        AutoKomis autoKomis = new AutoKomis();
        autoKomis.dodajSamochod(samochod1);
        autoKomis.dodajSamochod(samochod2);
        autoKomis.dodajSamochod(samochod3);
        autoKomis.dodajSamochod(samochod4);
        autoKomis.dodajSamochod(samochod5);
        autoKomis.dodajSamochod(samochod6);
        autoKomis.dodajSamochod(samochod7);
        autoKomis.dodajSamochod(samochod8);
        autoKomis.dodajSamochod(samochod9);
        autoKomis.dodajSamochod(samochod10);
        autoKomis.wyswietlSamochody();

        System.out.println();

        System.out.println("Samochód 1: " + samochod1.czyMaGwarancje());
        System.out.println("Samochód 2: " + samochod2.czyMaGwarancje());
        autoKomis.wyswietlLiczbeSamochodow();
    }
}
