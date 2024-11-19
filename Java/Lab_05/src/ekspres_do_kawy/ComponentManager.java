public class ComponentManager {
    private Grinder mlynek;
    private Heater grzalkaWody;
    private Heater grzalkaMleka;
    private Pump pompaWody;
    private Pump pompaMleka;

    public ComponentManager() {
        mlynek = new Grinder();
        grzalkaWody = new Heater();
        grzalkaMleka = new Heater();
        pompaWody = new Pump();
        pompaMleka = new Pump();
    }

    public void mielKawa(int ilosc) {
        mlynek.miel(ilosc);
    }

    public void podgrzejWode(int temperatura) {
        grzalkaWody.podgrzej(temperatura);
    }

    public void uruchomPompe(String typ, int ilosc) {
        if ("woda".equals(typ)) {
            pompaWody.pompuj(ilosc);
        } else if ("mleko".equals(typ)) {
            pompaMleka.pompuj(ilosc);
        }
    }
}
