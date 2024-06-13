//Zmienić klasę ProstaListaOsob tak, aby możliwe było dodanie (w dowolnej kolejności) do listy osób jednego
//
//studenta. Argumentem konstruktora pozostaje liczba osób (liczba studentów jest stała i wynosi 1). UWA-
//GA! Zwrócić uwagę, że przy wprowadzaniu danych Student może pojawić się na LiścieOsób w dowolnym
//
//miejscu. Przy wyświetlaniu listy należy uwzględnić miejsce Studenta. Oznacza to, że Student może pojawić
//się w dowolnym miejscu, NIE tylko na początku bądź końcu listy. Zmienić program tak, by demonstrował
//nowe możliwości klasy ProstaListaOsob.
#include <iostream>
#include <string>
#include <vector>
#include <memory>
using namespace std;

class Student {
private:
    string imie;
    int numerIndeksu;

public:

    Student( string imie, int numerIndeksu) : imie(imie), numerIndeksu(numerIndeksu) {}


    ~Student() = default;


    void wypiszDane(ostream &os) const {
        os << "Imie: " << imie << ", Numer indeksu: " << numerIndeksu;
    }


    void wypiszKlase(ostream &os) const {
        os << "Klasa: Student";
    }


    friend ostream &operator<<(ostream &os, const Student &student) {
        student.wypiszKlase(os);
        os << endl;
        student.wypiszDane(os);
        return os;
    }


    static Student *utworzStudenta() {
        string imie;
        int numerIndeksu;

        cout << "Podaj imie: ";
        cin >> imie;
        cout << "Podaj numer indeksu: ";
        cin >> numerIndeksu;

        return new Student(imie, numerIndeksu);
    }
};

class ProstaListaOsob {
private:
    vector<string> listaOsob;
    unique_ptr<Student> student;

public:

    ProstaListaOsob(int liczbaOsob) {
        listaOsob.reserve(liczbaOsob);
    }


    void dodajOsobe(const string &osoba) {
        listaOsob.push_back(osoba);
    }


    void dodajStudenta(Student *student, int pozycja) {
        if (pozycja >= 0 && pozycja <= listaOsob.size()) {
            this->student.reset(student);
            listaOsob.insert(listaOsob.begin() + pozycja, "Student");
        } else {
            cerr << "Bledna pozycja!" << std::endl;
        }
    }


    void wypiszListe(ostream &os) const {
        for (const auto &osoba : listaOsob) {
            if (osoba == "Student" && student) {
                os << *student << endl;
            } else {
                os << "Osoba: " << osoba << endl;
            }
        }
    }
};

int main() {

    ProstaListaOsob lista(3);


    lista.dodajOsobe("Jan Kowalski");
    lista.dodajOsobe("Anna Nowak");


    Student *nowyStudent = Student::utworzStudenta();
    lista.dodajStudenta(nowyStudent, 1);


    lista.dodajOsobe("Piotr Wisniewski");


    lista.wypiszListe(std::cout);


    delete nowyStudent;

    return 0;
}
