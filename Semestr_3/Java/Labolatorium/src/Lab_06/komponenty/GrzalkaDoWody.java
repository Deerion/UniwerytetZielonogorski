package Lab_06.komponenty;

public class GrzalkaDoWody {
    private boolean wlaczona = false;
    private int temperatura = 0;

    public void podgrzejWode(int docelowaTemperatura) {
        wlaczona = true;
        temperatura = docelowaTemperatura;
        System.out.println("Podgrzewanie wody do " + docelowaTemperatura + "°C...");
    }

    public void wylacz() {
        wlaczona = false;
        temperatura = 0;
        System.out.println("Grzałka wyłączona.");
    }

    public int pobierzTemperature() {
        return temperatura;
    }
}
