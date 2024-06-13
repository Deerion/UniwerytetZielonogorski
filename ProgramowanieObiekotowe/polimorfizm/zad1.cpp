#include <iostream>
#include <string>

using namespace std;

class Czlowiek {
private:
    string imie;

public:
    Czlowiek(const string& name){
        imie=name;
    }

    ~Czlowiek() = default;

    void wypiszDane(ostream& os) const {
        os << "Imie: " << imie << endl;
    }

    static Czlowiek* utworzNowegoCzlowieka() {
        string name;
        cout << "Podaj imie nowego czlowieka: ";
        cin >> name;
        return new Czlowiek(name);
    }

    void wypiszKlase(ostream& os) const {
        os << "Klasa: Czlowiek" << endl;
    }

    void operator<<(ostream& os) {
        wypiszKlase(os);
        wypiszDane(os);
    }
};

int main() {
    Czlowiek* nowyCzlowiek = Czlowiek::utworzNowegoCzlowieka();
    nowyCzlowiek->operator<<(cout);
    delete nowyCzlowiek;
    return 0;
}

