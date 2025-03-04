package Lab_06.komponenty;

public class PojemnikNaUbrania {
    private double waga = 0.0;

    public void zaladujUbrania(double waga) {
        this.waga = waga;

        if (waga > 9.0) {
            System.out.println("Uwaga! Przekroczono maksymalną wagę ubrań! (9kg)");
            System.out.println("Wyjmij "+ (waga-9) +" Kg nadmiaru ubrań.");
            this.waga = 9.0;
            System.out.println("Po wyjęciu ubrań waga jest prawidłowa: " + this.waga + "kg.");
        }else if (waga < 0.0){
            System.out.println("Nie załadowano żadnych ubrań");
            System.out.println("Załadowano ubrania o wadze: " + 0 + "kg.");
        }
        else{
            System.out.println("Załadowano ubrania o wadze: " + waga + "kg.");
        }

    }


    public void wywazenie() {
        System.out.println("Wyważanie zawartości bębna...");
    }
}
