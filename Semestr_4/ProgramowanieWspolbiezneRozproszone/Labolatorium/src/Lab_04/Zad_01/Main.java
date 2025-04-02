package Lab_04.Zad_01;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Cake cake = new Cake();
        Thread mouse1 = new Mouse(cake, "Mysz_1");
        Thread mouse2 = new Mouse(cake, "Mysz_2");
        System.out.println("mouse1=" + mouse1.getState());
        System.out.println("mouse2=" + mouse2.getState());

        mouse1.start();
        mouse2.start();

        while (true) {
            System.out.println("mouse1=" + mouse1.getState());
            System.out.println("mouse2=" + mouse2.getState());
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (mouse1.getState().ordinal()
                    + mouse2.getState().ordinal() == 10) {
                break;
            }
        }
    }
}

// W pierwszej wersji kodu obie myszy jedą jednocześnie tort

// W drugiej wersji kodu po zmianie tylko jedna musz ma dostęp do tortu, Synchornizacja powinna być umieszczona
// w odpowiednim miejscu żeby zabewnić porządany efet działania kodu.