#include <iostream>
#include <cstdlib>
using namespace std;

class A{
public:
    virtual void V(){
        cout << "A\n";
    }
    void nV(){
        cout << "nA\n";
    }
};

class B: public A{
public:
    virtual void V(){
        cout << "B\n";
    }
    void nV(){
        cout << "nB\n";
    }
};

class C: public B{
public:
    virtual void V(){
        cout << "C\n";
    }
    void nV(){
        cout << "nC\n";
    }
};



int main() {
    A objA;
    B objB;
    C objC;

    A *wskA;
    B *wskB;
    C *wskC;

    objA.V();    // Wywołuje metodę wirtualną V() z klasy A dla obiektu objA.
    objA.nV();   // Wywołuje metodę nV() z klasy A dla obiektu objA.
    objB.V();    // Wywołuje metodę wirtualną V() z klasy B dla obiektu objB.
    objB.nV();   // Wywołuje metodę nV() z klasy B dla obiektu objB.
    objC.V();    // Wywołuje metodę wirtualną V() z klasy C dla obiektu objC.
    objC.nV();   // Wywołuje metodę nV() z klasy C dla obiektu objC.

    wskA = new A;  // Tworzy dynamicznie obiekt klasy A i przypisuje jego adres do wskaźnika wskA.
    wskA->V();     // Wywołuje metodę wirtualną V() z klasy A za pomocą wskaźnika wskA.
    wskA->nV();    // Wywołuje metodę nV() z klasy A za pomocą wskaźnika wskA.
    delete wskA;   // Usuwa dynamicznie zaalokowany obiekt klasy A.

    wskA = new B;  // Tworzy dynamicznie obiekt klasy B i przypisuje jego adres do wskaźnika wskA.
    wskA->V();     // Wywołuje metodę wirtualną V() z klasy B za pomocą wskaźnika wskA.
    wskA->nV();    // Wywołuje metodę nV() z klasy A za pomocą wskaźnika wskA (nie jest wirtualna).
    delete wskA;   // Usuwa dynamicznie zaalokowany obiekt klasy B.

    wskA = new C;  // Tworzy dynamicznie obiekt klasy C i przypisuje jego adres do wskaźnika wskA.
    wskA->V();     // Wywołuje metodę wirtualną V() z klasy C za pomocą wskaźnika wskA.
    wskA->nV();    // Wywołuje metodę nV() z klasy A za pomocą wskaźnika wskA (nie jest wirtualna).
    delete wskA;   // Usuwa dynamicznie zaalokowany obiekt klasy C.

    wskB = new B;  // Tworzy dynamicznie obiekt klasy B i przypisuje jego adres do wskaźnika wskB.
    wskB->V();     // Wywołuje metodę wirtualną V() z klasy B za pomocą wskaźnika wskB.
    wskB->nV();    // Wywołuje metodę nV() z klasy B za pomocą wskaźnika wskB.
    delete wskB;   // Usuwa dynamicznie zaalokowany obiekt klasy B.

    wskB = new C;  // Tworzy dynamicznie obiekt klasy C i przypisuje jego adres do wskaźnika wskB.
    wskB->V();     // Wywołuje metodę wirtualną V() z klasy C za pomocą wskaźnika wskB.
    wskB->nV();    // Wywołuje metodę nV() z klasy B za pomocą wskaźnika wskB (nie jest wirtualna).
    delete wskB;   // Usuwa dynamicznie zaalokowany obiekt klasy C.

    return EXIT_SUCCESS;
}
