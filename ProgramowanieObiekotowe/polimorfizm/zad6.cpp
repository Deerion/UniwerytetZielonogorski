#include <iostream>
#include <string>
#include <vector>
#include <memory>
using namespace std;

class ProstaListaOsob {
private:
    vector<string> listaOsob;


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
    lista.dodajOsobe("Piotr Wisniewski");

    return 0;
}
