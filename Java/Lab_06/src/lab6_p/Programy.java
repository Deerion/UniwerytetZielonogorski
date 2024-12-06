package lab6_p;

public class Programy {
    public Programy(){
        System.out.println("Wybierz Program pralki");
        System.out.println("1. Bawelna");
        System.out.println("2. Sztuczne tkaniny");
        System.out.println("3. Szybkie pranie");
        System.out.println("4. Czarne ubrania");
        System.out.println("5. Wlasne");
        String program = new java.util.Scanner(System.in).nextLine();
        switch(program){
            case "1":
                System.out.println("Wybrano program Bawelna");
                break;
            case "2":
                System.out.println("Wybrano program Sztuczne tkaniny");
                break;
            case "3":
                System.out.println("Wybrano program Szybkie pranie");
                break;
            case "4":
                System.out.println("Wybrano program Czarne ubrania");
                break;
            case "5":
                System.out.println("Wybrano program Wlasne");
                break;
            default:
                System.out.println("Nieznany program");
        }
    }
}
