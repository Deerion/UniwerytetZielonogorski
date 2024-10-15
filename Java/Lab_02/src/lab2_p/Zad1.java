package lab2_p;

public class Zad1 {
    public static void main(String[] args){
        int wysokosc;
        System.out.print("Podaj Wysokosc: ");

        wysokosc = new java.util.Scanner(System.in).nextInt();

        for(int i=0;i<wysokosc;i++){
            for(int j=0; j < wysokosc - i;j++){
                System.out.print(" ");
            }
            for(int j=0; j < 2 * i + 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
