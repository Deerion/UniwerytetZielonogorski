package lab6_p.komponenty;

public class PojemnikNaDetergenty {
    int proszekDoPrania;
    int plynyDoPlukania;
    int zmiękczacz;
    public PojemnikNaDetergenty(int proszekDoPrania, int plynyDoPlukania, int zmiękczacz) {
        this.proszekDoPrania = proszekDoPrania;
        this.plynyDoPlukania = plynyDoPlukania;
        this.zmiękczacz = zmiękczacz;
    }
    public void wsypProszek(int ilosc) {
        proszekDoPrania += ilosc;
    }
}
