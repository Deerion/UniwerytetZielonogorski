#include <iostream>
#include <string>

using namespace std;

class Osoba {
private:
    string imie;

public:
    Osoba(string name):imie(name){}

    friend ostream& operator<<(ostream& os, const Osoba& osoba) {
        static int numer = 1;
        os << "Osoba " << numer++ << ": " << osoba.imie << endl;
        return os;
    }
};

class ProstaListaOsob {
private:
    Osoba* lista[2];
    int iloscOsob;

public:
    ProstaListaOsob() : iloscOsob(0) {
        lista[0] = nullptr;
        lista[1] = nullptr;
    }

    ~ProstaListaOsob() {
        for (int i = 0; i < iloscOsob; ++i) {
            delete lista[i];
        }
    }

    void dodaj(const string& imie) {
        if (iloscOsob < 2) {
            lista[iloscOsob++] = new Osoba(imie);
        } else {
            cerr << "Blad: Lista juz zawiera dwie osoby." << endl;
        }
    }

    friend ostream& operator<<(ostream& os, const ProstaListaOsob& listaOsob) {
        for (int i = 0; i < listaOsob.iloscOsob; ++i) {
            os << *(listaOsob.lista[i]);
        }
        return os;
    }
};

int main() {
    ProstaListaOsob lista;
    lista.dodaj("Hubert");
    lista.dodaj("Seba");
    lista.dodaj("Maria");

    cout << lista;
    return 0;
}
