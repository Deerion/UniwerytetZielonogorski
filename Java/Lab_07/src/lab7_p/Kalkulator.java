package lab7_p;

public class Kalkulator {
    private int[] liczby;


    public Kalkulator(int liczba1) {
        this.liczby = new int[]{liczba1};
    }

    public Kalkulator(int liczba1, int liczba2, int liczba3, int liczba4) {
        this.liczby = new int[]{liczba1, liczba2, liczba3, liczba4};
    }

    public Kalkulator(int liczba1, int liczba2, int liczba3, int liczba4, int liczba5, int liczba6, int liczba7) {
        this.liczby = new int[]{liczba1, liczba2, liczba3, liczba4, liczba5, liczba6, liczba7};
    }

    public Kalkulator(Kalkulator innyKalkulator) {
        this.liczby = innyKalkulator.liczby.clone();
    }

    public int obliczSume() {
        int suma = 0;
        for(int i: liczby) {
            suma += i;
        }
        return suma;
    }

    public int obliczRoznice() {
        int roznica = liczby.length != 0 ? liczby[0] : 0;
                                        //        if (liczby.length == 0) {
                                        //            double roznica = liczba[0];
                                        //        } else {
                                        //            double roznica = 0;
                                        //        }
        for (int i : liczby) {
            roznica -= i;
        }
        return roznica;
    }


    public int obliczIloczyn() {
        int iloczyn = 1;
        for (int i : liczby) {
            iloczyn *= i;
        }
        return iloczyn;
    }


    public double obliczIloraz() {
        if (liczby.length == 0) throw new IllegalArgumentException("Tablica jest pusta!");
        double iloraz = liczby[0];
        for (int i = 1; i < liczby.length; i++) {
            if (liczby[i] == 0) {
                throw new ArithmeticException("Nie dziel cholero przez zero");
            }
            iloraz /= liczby[i];
        }
        return iloraz;
    }


    public void wyswietlLiczby() {
        System.out.print("Liczby: ");
        for (int liczba : liczby) {
            System.out.print(liczba + " ");
        }
        System.out.println();
    }
}
