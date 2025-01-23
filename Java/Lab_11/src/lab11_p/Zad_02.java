package lab11_p;


class MojWyjatek extends Exception {
    public MojWyjatek(String message) {
        super(message);
    }
}

public class Zad_02 {

    public static void sprawdzLiczbe(int liczba) throws MojWyjatek {
        if (liczba < 0) {
            throw new MojWyjatek("Liczba nie może być ujemna!");
        }
        System.out.println("Liczba jest poprawna: " + liczba);
    }

    public static void main(String[] args) {
        int liczba = -5;

        try {
            sprawdzLiczbe(liczba);
        } catch (MojWyjatek e) {
            System.out.println("Wystąpił wyjątek: " + e.getMessage());
        } finally {
            System.out.println("Program zakończony.");
        }
    }
}

