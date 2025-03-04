package Lab_06.komponenty;
import java.util.Random;

public class FiltrWody {
    public boolean sprawdzDrozny() {
        System.out.print("Sprawdzanie drożności filtra wody...");
        Random random = new Random();
        return random.nextBoolean();

    }
}
