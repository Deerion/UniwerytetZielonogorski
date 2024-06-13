#include <iostream>
#include <string>
using namespace std;

class Student {
private:
    string imie;
    int numerIndeksu;

public:

    Student(string imie, int numerIndeksu) : imie(imie), numerIndeksu(numerIndeksu) {}

    virtual ~Student() = default;

    void wypiszDane(ostream &os) const {
        os << "Imie: " << imie << ", Numer indeksu: " << numerIndeksu;
    }
    void wypiszKlase(ostream &os) const {
        os << "Klasa: Student";
    }

    friend ostream &operator<<(ostream &os, const Student &student) {
        student.wypiszKlase(os);
        os <<endl;
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

int main() {
    Student *nowyStudent = Student::utworzStudenta();
    cout << *nowyStudent << endl;


    delete nowyStudent;

    return 0;
}
