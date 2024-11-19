package lab3_p;
import java.util.ArrayList;
import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> liczby = new ArrayList<>();

        while(true){
            System.out.print("Podaj liczbe: ");
            int x = scanner.nextInt();
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
