package lab6_p;

import lab6_p.wykonawcze.*;
import lab6_p.komponenty.*;

import java.util.Scanner;

public class FrontPanel {
    Scanner scanner = new Scanner(System.in);

    private GrzalkaDoWody grzalka = new GrzalkaDoWody();
    private PojemnikNaUbrania beben = new PojemnikNaUbrania();
    private PojemnikNaDetergenty pojemnikNaDetergenty = new PojemnikNaDetergenty();
    private FiltrWody filtr = new FiltrWody();
    private SilnikInwerterowy silnik = new SilnikInwerterowy();
    private PompaWody pompaWody = new PompaWody();
    private ElektrozaworyWodne elektrozaworyWodne = new ElektrozaworyWodne();
    private SilnikInwerterowy silnikInwerterowy = new SilnikInwerterowy();
    private SterownikPredkosciObrotowej sterownikPredkosciObrotowej = new SterownikPredkosciObrotowej();
    private Czujniki czujniki = new Czujniki();

    public void uruchomProgramSzybkiePranie() {

        System.out.println("----------------Dodajemy Proszek Do Prania i Płyn Do Płukania----------------");
        pojemnikNaDetergenty.dodajProszek();
        pojemnikNaDetergenty.dodajPlynDoPlukania();

        System.out.print("Wsadź ubrania do pralki (Max 9Kg): ");
        beben.zaladujUbrania(scanner.nextDouble());
        System.out.println("-------------Uruchamianie programu Szybkiego prania-------------");

        if (filtr.sprawdzDrozny()==true) {
            System.out.println("Filtr zatkany! Przerwanie pracy.");
            System.out.println("Wymień filtr ");
            System.out.println(".....");
            System.out.println("Filtr wymieniony");
            System.out.println("Wznawianie pracy...");

            elektrozaworyWodne.otworzZawor();
            pompaWody.pompujWode();
            czujniki.sprawdzCisnienieWody();
            pompaWody.zatrzymajPompe();
            elektrozaworyWodne.zamknijZawor();
            czujniki.sprawdzPoziomWody();
            czujniki.czujnikZalewowy();

            grzalka.podgrzejWode(40);
            czujniki.sprawdzTemperatureWody();
            grzalka.wylacz();
            silnik.ustawPredkosc(1000);
            sterownikPredkosciObrotowej.uruchom();
            System.out.println("............................................");
            sterownikPredkosciObrotowej.zatrzymaj();
            System.out.println("Pranie zakończone.");
        }
        else {
            System.out.println("Filtr sprawny");

            elektrozaworyWodne.otworzZawor();
            pompaWody.pompujWode();
            czujniki.sprawdzCisnienieWody();
            pompaWody.zatrzymajPompe();
            elektrozaworyWodne.zamknijZawor();

            czujniki.sprawdzPoziomWody();
            czujniki.czujnikZalewowy();

            grzalka.podgrzejWode(40);
            czujniki.sprawdzTemperatureWody();
            grzalka.wylacz();

            silnik.ustawPredkosc(1000);
            sterownikPredkosciObrotowej.uruchom();
            System.out.println("............................................");
            sterownikPredkosciObrotowej.zatrzymaj();
            System.out.println("Pranie zakończone.");

        }
    }

    public void uruchomProgramBawelna() {

        System.out.println("----------------Dodajemy Proszek Do Prania i Płyn Do Płukania----------------");
        pojemnikNaDetergenty.dodajProszek();
        pojemnikNaDetergenty.dodajPlynDoPlukania();

        System.out.print("Wsadź ubrania do pralki (Max 9Kg): ");
        beben.zaladujUbrania(scanner.nextDouble());
        System.out.println("-------------Uruchamianie programu Bawelna-------------");

        if (filtr.sprawdzDrozny()==true) {
            System.out.println("Filtr zatkany! Przerwanie pracy.");
            System.out.println("Wymień filtr ");
            System.out.println(".....");
            System.out.println("Filtr wymieniony");
            System.out.println("Wznawianie pracy...");

            elektrozaworyWodne.otworzZawor();
            pompaWody.pompujWode();
            czujniki.sprawdzCisnienieWody();
            pompaWody.zatrzymajPompe();
            elektrozaworyWodne.zamknijZawor();
            czujniki.sprawdzPoziomWody();
            czujniki.czujnikZalewowy();

            grzalka.podgrzejWode(30);
            czujniki.sprawdzTemperatureWody();
            grzalka.wylacz();
            silnik.ustawPredkosc(800);
            sterownikPredkosciObrotowej.uruchom();
            System.out.println("............................................");
            sterownikPredkosciObrotowej.zatrzymaj();
            System.out.println("Pranie zakończone.");
        }
        else {
            System.out.println("Filtr sprawny");

            elektrozaworyWodne.otworzZawor();
            pompaWody.pompujWode();
            czujniki.sprawdzCisnienieWody();
            pompaWody.zatrzymajPompe();
            elektrozaworyWodne.zamknijZawor();

            czujniki.sprawdzPoziomWody();
            czujniki.czujnikZalewowy();

            grzalka.podgrzejWode(30);
            czujniki.sprawdzTemperatureWody();
            grzalka.wylacz();

            silnik.ustawPredkosc(800);
            sterownikPredkosciObrotowej.uruchom();
            System.out.println("............................................");
            sterownikPredkosciObrotowej.zatrzymaj();
            System.out.println("Pranie zakończone.");

        }
    }
    public void uruchomProgramCodzienne() {

        System.out.println("----------------Dodajemy Proszek Do Prania i Płyn Do Płukania----------------");
        pojemnikNaDetergenty.dodajProszek();
        pojemnikNaDetergenty.dodajPlynDoPlukania();

        System.out.print("Wsadź ubrania do pralki (Max 9Kg): ");
        beben.zaladujUbrania(scanner.nextDouble());
        System.out.println("-------------Uruchamianie programu Codzienne-------------");

        if (filtr.sprawdzDrozny()==true) {
            System.out.println("Filtr zatkany! Przerwanie pracy.");
            System.out.println("Wymień filtr ");
            System.out.println(".....");
            System.out.println("Filtr wymieniony");
            System.out.println("Wznawianie pracy...");

            elektrozaworyWodne.otworzZawor();
            pompaWody.pompujWode();
            czujniki.sprawdzCisnienieWody();
            pompaWody.zatrzymajPompe();
            elektrozaworyWodne.zamknijZawor();
            czujniki.sprawdzPoziomWody();
            czujniki.czujnikZalewowy();

            grzalka.podgrzejWode(40);
            czujniki.sprawdzTemperatureWody();
            grzalka.wylacz();
            silnik.ustawPredkosc(1200);
            sterownikPredkosciObrotowej.uruchom();
            System.out.println("............................................");
            sterownikPredkosciObrotowej.zatrzymaj();
            System.out.println("Pranie zakończone.");
        }
        else {
            System.out.println("Filtr sprawny");

            elektrozaworyWodne.otworzZawor();
            pompaWody.pompujWode();
            czujniki.sprawdzCisnienieWody();
            pompaWody.zatrzymajPompe();
            elektrozaworyWodne.zamknijZawor();

            czujniki.sprawdzPoziomWody();
            czujniki.czujnikZalewowy();

            grzalka.podgrzejWode(40);
            czujniki.sprawdzTemperatureWody();
            grzalka.wylacz();

            silnik.ustawPredkosc(1200);
            sterownikPredkosciObrotowej.uruchom();
            System.out.println("............................................");
            sterownikPredkosciObrotowej.zatrzymaj();
            System.out.println("Pranie zakończone.");

        }
    }
    public void uruchomProgramSyntetyczne() {

        System.out.println("----------------Dodajemy Proszek Do Prania i Płyn Do Płukania----------------");
        pojemnikNaDetergenty.dodajProszek();
        pojemnikNaDetergenty.dodajPlynDoPlukania();

        System.out.print("Wsadź ubrania do pralki (Max 9Kg): ");
        beben.zaladujUbrania(scanner.nextDouble());
        System.out.println("-------------Uruchamianie programu Syntetyczne-------------");

        if (filtr.sprawdzDrozny()==true) {
            System.out.println("Filtr zatkany! Przerwanie pracy.");
            System.out.println("Wymień filtr ");
            System.out.println(".....");
            System.out.println("Filtr wymieniony");
            System.out.println("Wznawianie pracy...");

            elektrozaworyWodne.otworzZawor();
            pompaWody.pompujWode();
            czujniki.sprawdzCisnienieWody();
            pompaWody.zatrzymajPompe();
            elektrozaworyWodne.zamknijZawor();
            czujniki.sprawdzPoziomWody();
            czujniki.czujnikZalewowy();

            grzalka.podgrzejWode(35);
            czujniki.sprawdzTemperatureWody();
            grzalka.wylacz();
            silnik.ustawPredkosc(1000);
            sterownikPredkosciObrotowej.uruchom();
            System.out.println("............................................");
            sterownikPredkosciObrotowej.zatrzymaj();
            System.out.println("Pranie zakończone.");
        }
        else {
            System.out.println("Filtr sprawny");

            elektrozaworyWodne.otworzZawor();
            pompaWody.pompujWode();
            czujniki.sprawdzCisnienieWody();
            pompaWody.zatrzymajPompe();
            elektrozaworyWodne.zamknijZawor();

            czujniki.sprawdzPoziomWody();
            czujniki.czujnikZalewowy();

            grzalka.podgrzejWode(35);
            czujniki.sprawdzTemperatureWody();
            grzalka.wylacz();

            silnik.ustawPredkosc(1000);
            sterownikPredkosciObrotowej.uruchom();
            System.out.println("............................................");
            sterownikPredkosciObrotowej.zatrzymaj();
            System.out.println("Pranie zakończone.");

        }
    }
    public void uruchomProgramDelikatne() {

        System.out.println("----------------Dodajemy Proszek Do Prania i Płyn Do Płukania----------------");
        pojemnikNaDetergenty.dodajProszek();
        pojemnikNaDetergenty.dodajPlynDoPlukania();

        System.out.print("Wsadź ubrania do pralki (Max 9Kg): ");
        beben.zaladujUbrania(scanner.nextDouble());
        System.out.println("-------------Uruchamianie programu Delikatne-------------");

        if (filtr.sprawdzDrozny()==true) {
            System.out.println("Filtr zatkany! Przerwanie pracy.");
            System.out.println("Wymień filtr ");
            System.out.println(".....");
            System.out.println("Filtr wymieniony");
            System.out.println("Wznawianie pracy...");

            elektrozaworyWodne.otworzZawor();
            pompaWody.pompujWode();
            czujniki.sprawdzCisnienieWody();
            pompaWody.zatrzymajPompe();
            elektrozaworyWodne.zamknijZawor();
            czujniki.sprawdzPoziomWody();
            czujniki.czujnikZalewowy();

            grzalka.podgrzejWode(30);
            czujniki.sprawdzTemperatureWody();
            grzalka.wylacz();
            silnik.ustawPredkosc(600);
            sterownikPredkosciObrotowej.uruchom();
            System.out.println("............................................");
            sterownikPredkosciObrotowej.zatrzymaj();
            System.out.println("Pranie zakończone.");
        }
        else {
            System.out.println("Filtr sprawny");

            elektrozaworyWodne.otworzZawor();
            pompaWody.pompujWode();
            czujniki.sprawdzCisnienieWody();
            pompaWody.zatrzymajPompe();
            elektrozaworyWodne.zamknijZawor();

            czujniki.sprawdzPoziomWody();
            czujniki.czujnikZalewowy();

            grzalka.podgrzejWode(30);
            czujniki.sprawdzTemperatureWody();
            grzalka.wylacz();

            silnik.ustawPredkosc(600);
            sterownikPredkosciObrotowej.uruchom();
            System.out.println("............................................");
            sterownikPredkosciObrotowej.zatrzymaj();
            System.out.println("Pranie zakończone.");

        }
    }

    public void uruchomWlasnyProgram(int temperatura, int czasWstepny, int czasZasadniczy, boolean dodatkowePlukanie, int predkoscWirowania) {

        System.out.println("----------------Dodajemy Proszek Do Prania i Płyn Do Płukania----------------");
        pojemnikNaDetergenty.dodajProszek();
        pojemnikNaDetergenty.dodajPlynDoPlukania();

        System.out.print("Wsadź ubrania do pralki (Max 9Kg): ");
        beben.zaladujUbrania(scanner.nextDouble());
        System.out.println("-------------Uruchamianie programu Własne-------------");


        if (filtr.sprawdzDrozny()==true) {
            System.out.println("Filtr zatkany! Przerwanie pracy.");
            System.out.println("Wymień filtr ");
            System.out.println(".....");
            System.out.println("Filtr wymieniony");
            System.out.println("Wznawianie pracy...");

            elektrozaworyWodne.otworzZawor();
            pompaWody.pompujWode();
            czujniki.sprawdzCisnienieWody();
            pompaWody.zatrzymajPompe();
            elektrozaworyWodne.zamknijZawor();
            czujniki.sprawdzPoziomWody();
            czujniki.czujnikZalewowy();
            grzalka.podgrzejWode(temperatura);
            czujniki.sprawdzTemperatureWody();
            grzalka.wylacz();

            silnik.ustawPredkosc(predkoscWirowania);
            sterownikPredkosciObrotowej.uruchom();
            System.out.println("............................................");

            System.out.println("Pranie wstępne przez " + czasWstepny + " minut...");
            System.out.println("Pranie zasadnicze przez " + czasZasadniczy + " minut...");

            if (dodatkowePlukanie) {
                System.out.println("Wykonywanie dodatkowego płukania...");
            }else {
                System.out.println("Brak dodatkowego płukania");
            }

            sterownikPredkosciObrotowej.zatrzymaj();
        }else {
            System.out.println("Filtr sprawny");

            elektrozaworyWodne.otworzZawor();
            pompaWody.pompujWode();
            czujniki.sprawdzCisnienieWody();
            pompaWody.zatrzymajPompe();
            elektrozaworyWodne.zamknijZawor();

            czujniki.sprawdzPoziomWody();
            czujniki.czujnikZalewowy();

            grzalka.podgrzejWode(temperatura);
            czujniki.sprawdzTemperatureWody();
            grzalka.wylacz();

            silnik.ustawPredkosc(predkoscWirowania);
            sterownikPredkosciObrotowej.uruchom();
            System.out.println("............................................");

            System.out.println("Pranie wstępne przez " + czasWstepny + " minut...");
            System.out.println("Pranie zasadnicze przez " + czasZasadniczy + " minut...");

            if (dodatkowePlukanie) {
                System.out.println("Wykonywanie dodatkowego płukania...");
            }else {
                System.out.println("Brak dodatkowego płukania");
            }


            sterownikPredkosciObrotowej.zatrzymaj();
        }

        System.out.println("Własny program zakończony.");
    }
}
