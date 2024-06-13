#include <iostream>
#include <cstring>

class A {
private:
    int x;
public:
    A(const int liczba):x(liczba){}

    int operator+(int liczba) {
        return (this->x)-liczba;
    }
};

int main() {
    A obj(8); // Creating an object of class A with x = 8
    int result = obj + 3; // Subtracting 3 from the object using the overloaded operator+
    std::cout << "Result: " << result << std::endl;

    return 0;
}
