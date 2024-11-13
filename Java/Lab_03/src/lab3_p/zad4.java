package lab3_p;
import java.util.ArrayList;

public class zad4 {

    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>();
        while(true){
            System.out.print("Podaj liczbe: ");
            int x = new java.util.Scanner(System.in).nextInt();
            if(x == 5){
                liczby.add(x);
                break;
            }else {
                liczby.add(x);
            }
        }

        double iloczyn = 1;
        for (int i = 0; i < liczby.size(); i++) {
             iloczyn *= liczby.get(i);
        }
        System.out.println("Iloczyn podanych liczb: " + iloczyn);
    }
}
