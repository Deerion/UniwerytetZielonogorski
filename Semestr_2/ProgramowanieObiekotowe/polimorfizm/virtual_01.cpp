#include <iostream>
using namespace std;

class A {
public:
    virtual void f() { cout << "fA\n"; }
    void g() { cout << "gA\n"; }
};

class B : public A {
public:
    virtual void f() { cout << "fB\n"; }
    void g() { cout << "gB\n"; }
};

class C : public B {
public:
    virtual void f() { cout << "fC\n"; }
    void g() { cout << "gC\n"; }
};

void f(B* obj) {
    obj->f(); // Wywołanie funkcji wirtualnej
}

void g(A* obj) {
    obj->g(); // Wywołanie funkcji niewirtualnej
}

int main() {
    A* objA = new A();
    B* objB = new B();
    C* objC = new C();

    // Wywołania funkcji przez wskaźnik do klasy bazowej (A)
    // f(objA); // błąd
    f(objB); // Wywoła fB (polimorfizm)
    f(objC); // Wywoła fC (polimorfizm)

    g(objA); // Wywoła gA
    g(objB); // Wywoła gA (brak polimorfizmu)
    g(objC); // Wywoła gA (brak polimorfizmu)

    // Zwolnienie dynamicznie alokowanych obiektów
    delete objA;
    delete objB;
    delete objC;

    return 0;
}
