#include <iostream>
using namespace std;

class A {
private:
    int x;
public:
    A(const int liczba) : x(liczba) {}

    // Przeciążenie operatora << do wypisywania obiektu klasy A
    friend ostream& operator<<(ostream& os, const A& obj) {
        os << obj.x;
        return os;
    }

};

int main() {
    A obj1(8);
    A obj2(3);

    cout << "Obiekt obj1: " << obj1 << endl;
    cout << "Obiekt obj2: " << obj2 << endl;

    return 0;
}
