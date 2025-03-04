package Lab_06.wykonawcze;

public class SilnikInwerterowy {
    private int predkosc = 0;

    public void ustawPredkosc(int predkosc) {
        this.predkosc = predkosc;
        System.out.println("Ustawianie prędkości silnika na " + predkosc + " obrotów/min.");
    }
}
