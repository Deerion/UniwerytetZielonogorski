package lab8_p;

import java.util.List;

public class Zad_05 {
    public static void main(String[] args) {

        Samochod samochod1 = new Samochod("Opel", "Astra", 1.6, "Sedan", "Benzyna", 2010, 20000, "2020-01-01");
        Samochod samochod2 = new Samochod("Toyota", "Yaris", 1.0, "Hatchback", "Benzyna", 2015, 30000, "2024-01-02");
        Samochod samochod3 = new Samochod("Opel", "Astra", 1.8, "Sedan", "Benzyna", 2010, 20000, "2020-01-01");
        Samochod samochod4 = new Samochod("Toyota", "Yaris", 2.0, "Hatchback", "Benzyna", 2015, 30000, "2024-01-02");


        AutoKomis autoKomis = new AutoKomis();
        autoKomis.dodajSamochod(samochod1);
        autoKomis.dodajSamochod(samochod2);
        autoKomis.dodajSamochod(samochod3);
        autoKomis.dodajSamochod(samochod4);


        List<Samochod> carList = autoKomis.getSamochody();

        System.out.println("Lista samochodów:");
        carList.forEach(samochod -> {
            System.out.println(samochod.wyswietl());
            System.out.println(samochod.czyMaGwarancje());
            System.out.println();
        });

        System.out.println("\nPosortowane pojemności silnika (rosnąco):");
        carList.stream()
                .map(Samochod::getPojemnoscSilnika)
                .sorted()
                .forEach(System.out::println);
    }
}
