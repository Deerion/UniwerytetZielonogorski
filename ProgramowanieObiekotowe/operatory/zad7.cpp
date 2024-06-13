#include <iostream>
using namespace std;

class Zwierze {
public:
    bool type = 0;
    Zwierze() {};
    void wypisz() {
        cout << "Zwierze\n";
    }
};

class Pies:public Zwierze {
private:
    string name;

public:
    Pies(string tmp) {
        name = tmp;
        type = 1;
    }
    void wypisz(){
        cout << "Czesc, " << name << "\n";
    }
};

// Napisać globalną funkcję wypisz(), której zadaniem jest wypisanie obiektu dowolnej klasy (w zależności od argumentu)
void wypisz(Zwierze* tmp){
    if (tmp->type){
        ((Pies*)tmp)->wypisz();
    } else {
        tmp->wypisz();
    };
}

int main () {

    Zwierze objZ;
    Pies objP("Czarek");

    objZ.wypisz(); // Zwierze
    objP.wypisz(); // Cześć, {}

    wypisz(&objP);

    return 0;
}