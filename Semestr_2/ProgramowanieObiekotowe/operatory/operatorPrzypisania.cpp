#include <iostream>
using namespace std;

class A {
private:
    char* data;

public:
    // Konstruktor
    A(char value) : data(new char(value)) {}

    // Operator przypisania
    A& operator=(const A& obj) {
        if (this != &obj) {
            delete data;
            data = new char(*(obj.data));
        }
        return *this;
    }

    // Destruktor
    ~A() {
        delete data;
    }

    // Metoda do wyświetlania danych
    void wyswietl() const {
        cout << "Data: " << *data << endl;
    }
};

int main() {
    A obj1('A');
    A obj2('B');
    A obj3('c');

    obj2 = obj1;
    obj3 = 'E';

    obj2.wyswietl();  // Wyświetla: Data: 65
    obj3.wyswietl();  // Wyświetla: Data: 69

    return 0;
}

