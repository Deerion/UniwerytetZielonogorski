public class FrontPanel {
    private EkspresDoKawy ekspres;

    public FrontPanel(EkspresDoKawy ekspres) {
        this.ekspres = ekspres;
    }

    public void wybierzKawe(String nazwaKawy) {
        for (RodzajKawy przepis : ekspres.getPrzepisy()) {
            if (przepis.getNazwa().equalsIgnoreCase(nazwaKawy)) {
                ekspres.przygotujKawe(przepis);
                return;
            }
        }
        System.out.println("Nie znaleziono przepisu na kawę: " + nazwaKawy);
    }

    public void wyswietlStatus() {
        System.out.println("Ekspres jest " + (ekspres.isWlaczony() ? "włączony" : "wyłączony"));
    }
}
