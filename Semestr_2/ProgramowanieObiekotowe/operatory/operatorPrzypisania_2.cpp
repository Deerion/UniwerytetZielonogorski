#include <iostream>
using namespace std;

class A {
private:
    char data;

public:
    // Konstruktor
    A(char value) : data(value) {}

    // Operator przypisania
    A& operator=(const A& obj) {
        if (this != &obj) {
            data = obj.data;
        }
        return *this;
    }

    // Metoda do wyświetlania danych
    void wyswietl() const {
        cout << "Data: " << data << endl;
    }
};

int main() {
    A obj1('A');
    A obj2('B');
    A obj3('c');

    obj2 = obj1;
    obj3 = 'E';

    obj2.wyswietl();  // Wyświetla: Data: A
    obj3.wyswietl();  // Wyświetla: Data: E

    return 0;
}
