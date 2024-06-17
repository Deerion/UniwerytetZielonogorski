#include <iostream>
using namespace std;

class A {
private:
    int x;
public:
    A(const int liczba): x(liczba) {}

    // Przeciążenie operatora + do dodawania liczby całkowitej
    A& operator+(int liczba) {
        this->x += liczba; // Dodawanie liczby do bieżącego obiektu
        return *this;      // Zwracamy referencję do bieżącego obiektu
    }

    // Przeciążenie operatora + do dodawania dwóch obiektów klasy A
    A& operator+(const A& obj) {
        this->x += obj.x; // Dodawanie pola x drugiego obiektu do bieżącego obiektu
        return *this;       // Zwracamy referencję do bieżącego obiektu
    }

    int wyswietl() const {
        return x;
    }
};

int main() {
    A obj1(5);
    A obj2(8);

    obj1 + 3;           // Dodanie liczby do obj1
    obj2 + obj1;        // Dodanie obj2 do obj1

    cout << "Result obj1: " << obj1.wyswietl() << endl; // Wyświetlenie wyniku obj1
    cout << "Result obj2: " << obj2.wyswietl() << endl; // Wyświetlenie wyniku obj2
    return 0;
}
