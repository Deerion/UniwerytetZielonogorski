package Lab2;

public class Zad2 {
    public static void main(String[] args){
        int a,b,c;
        float delta;

        System.out.print("Podaj a ");
        a= new java.util.Scanner(System.in).nextInt();

        System.out.print("Podaj b ");
        b= new java.util.Scanner(System.in).nextInt();

        System.out.print("Podaj c ");
        c= new java.util.Scanner(System.in).nextInt();

        delta = b * b - 4 * a * c;
        System.out.println("Delta = " + delta);

        if(delta < 0){
            System.out.println("Brak rozwiazan");
        }else if(delta == 0){
            float x = -b / (2 * a);
            System.out.println("Jeden pierwiastek: x = " + x);
        }else if(delta > 0){
            float x1 = (-b + delta * delta) / (2 * a);
            float x2 = (-b - delta * delta) / (2 * a);
            System.out.println("Dwa pierwiastki: \n x1 = " + x1 + "\n x2 = " + x2);

        }
    }
}
