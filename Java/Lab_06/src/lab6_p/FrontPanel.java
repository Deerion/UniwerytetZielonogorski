package lab6_p;

public class FrontPanel {
    public FrontPanel() {
        System.out.println("Front Panel Pralki");
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
        System.out.println("Włączono pralkę");
    }
    public void wylacz() {
        System.out.println("Wyłączono pralkę");
    }

}
