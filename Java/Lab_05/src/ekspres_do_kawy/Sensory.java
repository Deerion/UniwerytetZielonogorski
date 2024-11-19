public class Sensory {
    private int poziomWody = 100;
    private int poziomMleka = 100;
    private int poziomKawy = 100;
    private int poziomCukru = 100;
    private int temperatura = 25;

    public boolean sprawdzSensory() {
        if (poziomWody <= 0) {
            System.out.println("Brak wody!");
            return false;
        }
        if (poziomMleka <= 0) {
            System.out.println("Brak mleka!");
            return false;
        }
        if (poziomKawy <= 0) {
            System.out.println("Brak kawy!");
            return false;
        }
        if (poziomCukru <= 0) {
            System.out.println("Brak cukru!");
            return false;
        }
        return true;
    }

    public void zmniejszPoziom(String skladnik, int ilosc) {
        switch (skladnik) {
            case "woda" -> poziomWody -= ilosc;
            case "mleko" -> poziomMleka -= ilosc;
            case "kawa" -> poziomKawy -= ilosc;
            case "cukier" -> poziomCukru -= ilosc;
        }
    }
}
