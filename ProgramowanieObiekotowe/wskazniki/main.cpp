#include <iostream>

using namespace std;

struct Elem1;
struct Elem2;
struct Elem3;

struct Elem1 {
    int val;
    Elem2 *ptr;
};

struct Elem2 {
    int val;
    Elem3 *ptr;
};

struct Elem3 {
    int val;
    Elem1 **ptr;
};

int main() {
    Elem1 *p; // wskaźnik na strukturę Elem1

    p = new Elem1;
    p->val = 1;
    p->ptr = new Elem2;
    p->ptr->val = 7;
    p->ptr->ptr = new Elem3;
    p->ptr->ptr->val = 5;
    p->ptr->ptr->ptr = &p;

    cout << "p->val = " << p->val << endl;
    cout << "p->ptr->val = " << p->ptr->val << endl;
    cout << "p->ptr->ptr->val = " << p->ptr->ptr->val << endl;
    cout << "p->ptr->ptr->ptr->val = " << (*p->ptr->ptr->ptr)->val << endl;

    delete p->ptr->ptr; // zwolnienie pamięci dla Elem3
    delete p->ptr; // zwolnienie pamięci dla Elem2
    delete p; // zwolnienie pamięci dla Elem1
    p = nullptr; // ustawienie p na nullptr, aby uniknąć wiszącego wskaźnika

    return EXIT_SUCCESS;
}
