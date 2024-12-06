package lab6_p;
import lab6_p.Wykonawcze.*;
import lab6_p.komponenty.*;

public class FrontPanel {
    public FrontPanel() {
        System.out.println("Front Panel Pralki (wlacz/wylacz)");
        String uruchom;
        uruchom = new java.util.Scanner(System.in).nextLine();
        if( uruchom.equals("wlacz") ) {
            wlacz();
        }
        else if( uruchom.equals("wylacz") ) {
            wylacz();
        }
        else {
            System.out.println("Nieznane polecenie");
        }
    }
    public void wlacz() {
        System.out.print("Włączono pralkę, ");
        
    }
    public void wylacz() {

    }

}
