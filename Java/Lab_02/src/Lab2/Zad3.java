package Lab2;

public class Zad3 {
    public static void main(String[] args){
        double km;
        double ml;
        System.out.print("Podaj Predkosc samochodu w milach: ");
        ml = new java.util.Scanner(System.in).nextDouble();

        km = ml * 1.6093440;

        System.out.println(ml + " mil to " + km + " Kilometrow");

    }
}
