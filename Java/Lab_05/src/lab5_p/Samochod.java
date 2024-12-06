package lab5_p;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Samochod {
    public String marka;
    public String model;
    public double pojemnoscSilnika;
    public String typNadwozie;
    public String typSilnika;
    public int rokProdukcji;
    public int cena;
    public String dataPierwszejRejestracji;

    public Samochod(String marka, String model, double pojemnoscSilnika, String typNadwozie, String typSilnika, int rokProdukcji, int cena, String dataPierwszejRejestracji) {
        this.marka = marka;
        this.model = model;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.typNadwozie = typNadwozie;
        this.typSilnika = typSilnika;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
        this.dataPierwszejRejestracji = dataPierwszejRejestracji;
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

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getDataPierwszejRejestracji() {
        return dataPierwszejRejestracji;
    }

    public void setDataPierwszejRejestracji(String dataPierwszejRejestracji) {
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

    public static void czyMaGwarancje(Samochod samochod) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dataPierwszejRejestracji = LocalDate.parse(samochod.getDataPierwszejRejestracji(), formatter);
        LocalDate dataKoncaGwarancji = dataPierwszejRejestracji.plusYears(2);
        LocalDate dzisiaj = LocalDate.now();
        if (dzisiaj.isBefore(dataKoncaGwarancji)) {
            System.out.println(samochod.wyswietl() + " Samochód ma gwarancję");
        } else {
            System.out.println(samochod.wyswietl() + " Samochód nie ma gwarancji");
        }

    }
}
