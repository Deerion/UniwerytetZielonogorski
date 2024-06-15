#include <iostream>
using namespace std;

class A {
private:
    char* data;

public:
    // Konstruktor
    A(char value):data(new char (value)) {}

    // Konstruktor kopiujący
    A(const A& obj) {
        data = new char(*(obj.data));
    }

    // Destruktor
    ~A() {
        delete data;
    }

    //Wyświetlanie:
    char wyswietl() const{
        return *data;
    }

    // Przeciążenie operatora wyjścia
    friend ostream& operator<<(ostream& os, const A& obj) {
        os << *obj.data;
        return os;
    }
};

int main() {
    A obj1('B');   // Tworzy obiekt obj1 z wartością 'A'
    A obj2 = obj1; // Tworzy obiekt obj2 jako kopię obj1
    A obj3('D');
    obj3 = obj2;

    cout << obj2.wyswietl() << endl;
    cout << obj2 << endl;
    cout << obj3;

    // Teraz obj1 i obj2 posiadają swoje własne, niezależne kopie danych

    return 0;      // Destruktory są wywoływane automatycznie dla obj1 i obj2
}
