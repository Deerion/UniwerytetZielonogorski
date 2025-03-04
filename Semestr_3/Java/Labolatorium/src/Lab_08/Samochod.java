package Lab_08;

import java.time.LocalDate;
import java.time.Period;

public class Samochod {
    // Zmiana dostępu do pól na 'protected' dla dostępu w obrębie pakietu
    protected String marka;
    protected String model;
    protected double pojemnoscSilnika;
    protected String typNadwozie;
    protected String typSilnika;
    protected int rokProdukcji;
    protected LocalDate dataPierwszejRejestracji;
    protected double cena;

    // Konstruktor klasy Samochod
    public Samochod(String marka, String model, double pojemnoscSilnika, String typNadwozie,
                    String typSilnika, int rokProdukcji, double cena, String dataPierwszejRejestracji) {

        // Parsowanie daty z łańcucha tekstowego na LocalDate
        this.marka = marka;
        this.model = model;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.typNadwozie = typNadwozie;
        this.typSilnika = typSilnika;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
        this.dataPierwszejRejestracji = LocalDate.parse(dataPierwszejRejestracji);
    }

    // Gettery i settery
    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public String getTypNadwozie() {
        return typNadwozie;
    }

    public String getTypSilnika() {
        return typSilnika;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public LocalDate getDataPierwszejRejestracji() {
        return dataPierwszejRejestracji;
    }

    public double getCena() {
        return cena;
    }

    // Metoda do wyświetlania wszystkich danych samochodu
    public String wyswietl() {
        return marka + " " + model + " " + pojemnoscSilnika + " " + typNadwozie + " " + typSilnika + " " + rokProdukcji + " " + cena + " " + dataPierwszejRejestracji;
    }

    // Metoda sprawdzająca, czy samochód posiada jeszcze gwarancję
    public String czyMaGwarancje() {
        if (dataPierwszejRejestracji != null) {
            LocalDate dzis = LocalDate.now();
            Period roznica = Period.between(dataPierwszejRejestracji, dzis);

            if (roznica.getYears() < 2) {
                return "Samochód posiada jeszcze gwarancję.";
            } else {
                return "Gwarancja na samochód już wygasła.";
            }
        }
        return "Data rejestracji nie została ustawiona.";
    }
}
