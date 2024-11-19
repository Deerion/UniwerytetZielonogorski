public class RodzajKawy {
    private String nazwa;
    private int iloscKawy;
    private int iloscMleka;
    private int iloscCukru;
    private int temperaturaWody;
    private int cisnienie;

    public RodzajKawy(String nazwa, int iloscKawy, int iloscMleka, int iloscCukru, int temperaturaWody, int cisnienie) {
        this.nazwa = nazwa;
        this.iloscKawy = iloscKawy;
        this.iloscMleka = iloscMleka;
        this.iloscCukru = iloscCukru;
        this.temperaturaWody = temperaturaWody;
        this.cisnienie = cisnienie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getIloscKawy() {
        return iloscKawy;
    }

    public int getIloscMleka() {
        return iloscMleka;
    }

    public int getIloscCukru() {
        return iloscCukru;
    }

    public int getTemperaturaWody() {
        return temperaturaWody;
    }

    public int getCisnienie() {
        return cisnienie;
    }
}
