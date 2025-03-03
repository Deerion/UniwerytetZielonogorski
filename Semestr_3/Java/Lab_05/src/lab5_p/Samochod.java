package lab5_p;
import java.time.LocalDate;
import java.time.Period;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Samochod {
    public String marka;
    public String model;
    public double pojemnoscSilnika;
    public String typNadwozie;
    public String typSilnika;
    public int rokProdukcji;
    private LocalDate dataPierwszejRejestracji;
    public double cena;

    public Samochod(String marka, String model, double pojemnoscSilnika, String typNadwozie,
                    String typSilnika, int rokProdukcji, double cena, String dataPierwszejRejestracji) {

        LocalDate dataRejestracji = LocalDate.parse(dataPierwszejRejestracji);
        this.marka = marka;
        this.model = model;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.typNadwozie = typNadwozie;
        this.typSilnika = typSilnika;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
        this.dataPierwszejRejestracji = dataRejestracji;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public String getTypNadwozie() {
        return typNadwozie;
    }

    public void setTypNadwozie(String typNadwozie) {
        this.typNadwozie = typNadwozie;
    }

    public String getTypSilnika() {
        return typSilnika;
    }

    public void setTypSilnika(String typSilnika) {
        this.typSilnika = typSilnika;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public LocalDate getDataPierwszejRejestracji() {
        return dataPierwszejRejestracji;
    }

    public void setDataPierwszejRejestracji(LocalDate dataPierwszejRejestracji) {
        this.dataPierwszejRejestracji = dataPierwszejRejestracji;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String wyswietl() {
        return marka + " " + model + " " + pojemnoscSilnika + " " + typNadwozie + " " + typSilnika + " " + rokProdukcji + " " + cena + " " + dataPierwszejRejestracji;
    }

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
