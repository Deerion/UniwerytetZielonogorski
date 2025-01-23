package lab8_p;

import java.util.ArrayList;

public class AutoKomis {
    private ArrayList<Samochod> samochody;
    private int Lp;

    public AutoKomis() {
        this.samochody = new ArrayList<>();
        this.Lp = 1;
    }

    // Dodanie samochodu do listy
    public void dodajSamochod(Samochod samochod) {
        samochody.add(samochod);
        Lp++;
    }

    // Wyświetlenie wszystkich samochodów
    public void wyswietlSamochody() {
        for (Samochod samochod : samochody) {
            System.out.println(" - " + samochod.wyswietl());
        }
    }

    // Wyświetlenie liczby samochodów
    public void wyswietlLiczbeSamochodow() {
        System.out.println("Liczba samochodów w komisie: " + Lp);
    }

    // Metoda do pobrania listy samochodów
    public ArrayList<Samochod> getSamochody() {
        return samochody;
    }
}
