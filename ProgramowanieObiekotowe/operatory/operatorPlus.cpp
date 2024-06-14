#include <iostream>
using namespace std;

class A {
private:
    int x;
public:
    A(const int liczba): x(liczba) {}

    // Przeciążenie operatora + do dodawania liczby całkowitej
    int operator+(int liczba) const {
        return this->x - liczba;
    }

    // Przeciążenie operatora + do dodawania dwóch obiektów klasy A
    A operator+(const A& other) const {
        return A(this->x + other.x);
    }

    int wyswietl() const {
        return x;
    }
};

int main() {
    A obj1(8);
    A obj2(8);

    int result = obj1 + 3;  // Użycie przeciążonego operatora + dla liczby
    A resultObj = obj1 + obj2;  // Użycie przeciążonego operatora + dla obiektów

    cout << "Result (obj1 + 3): " << result << endl;
    cout << "Result (obj1 + obj2): " << resultObj.wyswietl() << endl;

    return 0;
}
