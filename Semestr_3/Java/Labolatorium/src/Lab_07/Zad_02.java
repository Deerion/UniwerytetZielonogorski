package Lab_07;

import java.io.*;

public class Zad_02 {
    public static void main(String[] args) {
        String txtFilePath = "dane.txt";
        String csvFilePath = "dane.csv";

        System.out.println("Podaj zawartość pliku tekstowego:");
        String textData = new java.util.Scanner(System.in).nextLine();

        System.out.println("Podaj zawartość pliku CSV:");
        System.out.println("Podaj dane w formacie: Imię,Nazwisko,Wiek");
        System.out.println("Aby zakończyć wprowadzanie danych, wpisz 'exit'.");
        StringBuilder csvData = new StringBuilder();
        String line;
        while (!(line = new java.util.Scanner(System.in).nextLine()).equalsIgnoreCase("exit")) {
            csvData.append(line).append("\n");
        }

        writeTextFile(txtFilePath, textData);
        writeCsvFile(csvFilePath, new String[][]{
                {"Imię", "Nazwisko", "Wiek"},
                csvData.toString().split("\n")
        });

        System.out.println("Zawartość pliku tekstowego:");
        System.out.println(readTextFile(txtFilePath));
        System.out.println("Zawartość pliku CSV:");
        readCsvFile(csvFilePath);
    }

    private static void writeTextFile(String filePath, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readTextFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    private static void writeCsvFile(String filePath, String[][] data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String[] row : data) {
                writer.write(String.join(",", row));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readCsvFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
