package Lab_04.Zad_02;
import java.util.Random;

public class zad2 {
    public static void main(String[] args) {
        Random r = new Random();
        int [][] tab1 = new int[7][7];
        int [][] tab2 = new int[2][7];

        int [][] tab3 = new int[7][7];

        /* ----------------------------------Min Max----------------------------------*/
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                tab1[i][j] = r.nextInt(100);
            }
        }
        for (int i = 0; i < 7; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < 7; j++) {
                if (tab1[j][i] < min) {
                    min = tab1[j][i];
                }
                if (tab1[j][i] > max) {
                    max = tab1[j][i];
                }
            }
            tab2[0][i] = min;
            tab2[1][i] = max;
        }
        /* ---------------------------------------------------------------------------*/
        /* ----------------------------------srenida----------------------------------*/
        double suma = 0;
        int count = 0;
        for (int i = 0; i < 7; i++) {
            for(int j = 0; j < 7; j++){
                suma += tab1[i][j];
                count++;
            }
        }
        double srenia = suma/count;
        /* --------------------------------------------------------------------------*/
        /* ----------------------------Ilosc >< od min max---------------------------*/
        int iloscmniejszych = 0;
        int iloscwiekszych = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(tab1[i][j] < srenia){
                    iloscmniejszych++;
                }
                if(tab1[i][j] > srenia){
                    iloscwiekszych++;
                }
            }
        }
        /* --------------------------------------------------------------------------*/
        /* -----------------------------Kopia odwrotnosci----------------------------*/
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[i].length; j++) {
                tab3[tab1.length - 1 - i][tab1[i].length - 1 - j] = tab1[i][j];
            }
        }
        /* --------------------------------------------------------------------------*/
        System.out.println("Tablica 1");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(tab1[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Min Max Tablicy 1");
        System.out.println();
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 7; j++) {
                System.out.print(tab2[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Odwrotność Tablicy 1");
        for(int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++) {
                System.out.print(tab3[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Srenia arytmetyczna: " + srenia);
        System.out.println("Ilosc liczb mniejszych od sreniej: " + iloscmniejszych);
        System.out.println("Ilosc liczb wiekszych od sreniej: " + iloscwiekszych);


    }
}
