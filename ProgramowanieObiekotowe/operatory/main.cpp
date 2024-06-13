// Zadanie na kartkówce
#include <iostream>
#include <cstring>

class A {
private:
    int x;
public:
    A(const int liczba): x(liczba){}

    A operator+(int liczba) {
        return 2 * (this->x * liczba);
    }
};

int main() {


    return 0;
}
