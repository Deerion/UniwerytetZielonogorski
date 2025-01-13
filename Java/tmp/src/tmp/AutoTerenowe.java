package tmp;

public class AutoTerenowe extends Samochod {
    private double wysokoscZawieszenia;

    public void ustawWysokoscZawieszenia(double wysokoscZawieszenia) {
        this.wysokoscZawieszenia = wysokoscZawieszenia;
    }

    public String wyswietlInformacje() {
        return super.wyswietlInformacje() + ", Wysokość zawieszenia = " + wysokoscZawieszenia + " cm";
    }
}
