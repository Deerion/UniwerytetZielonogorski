public class EkspresDoKawy {
    private boolean wlaczony = false;
    private ComponentManager komponenty;
    private Sensory sensory;
    private List<RodzajKawy> przepisy;

    public EkspresDoKawy() {
        komponenty = new ComponentManager();
        sensory = new Sensory();
        przepisy = new ArrayList<>();
        zaladujDomyslnePrzepisy();
    }

    public void wlacz() {
        wlaczony = true;
        System.out.println("Ekspres włączony.");
    }

    public void wylacz() {
        wlaczony = false;
        System.out.println("Ekspres wyłączony.");
    }

    public void przygotujKawe(RodzajKawy przepis) {
        if (!wlaczony) {
            System.out.println("Urządzenie jest wyłączone!");
            return;
        }
        if (!sensory.sprawdzSensory()) {
            System.out.println("Nie można zrobić kawy. Sprawdź poziomy składników.");
            return;
        }
        System.out.println("Przygotowywanie kawy: " + przepis.getNazwa());
        komponenty.mielKawa(przepis.getIloscKawy());
        komponenty.podgrzejWode(przepis.getTemperaturaWody());
        komponenty.uruchomPompe("woda", przepis.getIloscKawy());
        if (przepis.getIloscMleka() > 0) {
            komponenty.uruchomPompe("mleko", przepis.getIloscMleka());
        }
        System.out.println("Kawa gotowa!");
    }

    private void zaladujDomyslnePrzepisy() {
        przepisy.add(new RodzajKawy("Espresso", 30, 0, 0, 90, 9));
        przepisy.add(new RodzajKawy("Latte", 20, 100, 10, 85, 9));
        przepisy.add(new RodzajKawy("Cappuccino", 30, 50, 5, 90, 9));
        przepisy.add(new RodzajKawy("Americano", 50, 0, 0, 95, 9));
        przepisy.add(new RodzajKawy("Mocha", 30, 50, 15, 85, 9));
    }

    public void dodajPrzepis(RodzajKawy przepis) {
        przepisy.add(przepis);
        System.out.println("Dodano nowy przepis: " + przepis.getNazwa());
    }
}
