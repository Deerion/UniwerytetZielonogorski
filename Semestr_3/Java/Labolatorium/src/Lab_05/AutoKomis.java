package Lab_05;

import java.util.ArrayList;

public class AutoKomis {
    public ArrayList<Samochod> samochody;

    public AutoKomis() {
        this.samochody = new ArrayList<>();
    }

    public void dodajSamochod(Samochod samochod) {
        samochody.add(samochod);
    }

    public void wyswietlSamochody() {
        for (Samochod samochod : samochody) {
            System.out.println(samochod.wyswietl());
        }
    }
}
