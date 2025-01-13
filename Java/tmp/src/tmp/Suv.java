package tmp;

public class Suv extends AutoTerenowe {
    private String typSilnika;

    public void ustawTypSilnika(String typSilnika) {
        this.typSilnika = typSilnika;
    }

    public String setTypSilnika() {
        return typSilnika;
    }

    // Własna metoda do wyświetlania pełnych informacji o SUV-ie
    public String wyswietlInformacje() {
        return super.wyswietlInformacje() + ", Typ silnika = " + typSilnika;
    }
}

