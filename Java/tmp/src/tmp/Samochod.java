package tmp;

public class Samochod {
    private String marka;
    private String model;
    private double pojemnosc;

    public void ustawMarke(String marka) {
        this.marka = marka;
    }

    public void ustawModel(String model) {
        this.model = model;
    }

    public void ustawPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    // Własna metoda do wyświetlania informacji o samochodzie
    public String wyswietlInformacje() {
        return "Samochod: Marka = " + marka + ", Model = " + model + ", Pojemność = " + pojemnosc + "L";
    }
}

