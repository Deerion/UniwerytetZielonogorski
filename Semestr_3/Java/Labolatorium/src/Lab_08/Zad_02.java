package Lab_08;

import java.util.ArrayList;

class Student {
    private String imie;
    private String nazwisko;
    private int index;

    public Student(String imie, String nazwisko, int index) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getIndex() {
        return index;
    }
}

public class Zad_02 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Dodanie kilku studentów do listy
        students.add(new Student("Jan", "Kowalski", 1));
        students.add(new Student("Anna", "Nowak", 2));
        students.add(new Student("Piotr", "Zieliński", 3));

        System.out.println("Liczba elementów w liście: " + students.size());

        System.out.print("Pod 3 elementem listy znajduje się: ");
        System.out.println(students.get(2).getImie() + " " + students.get(2).getNazwisko()+ " " +students.get(2).getIndex() );


    }
}
