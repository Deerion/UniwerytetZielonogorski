#include <iostream>

class A {
private:
    char* data;

public:
    // Konstruktor
    A(char value) : data(new char(value)) {}

    // Operator przypisania
    A& operator=(const A& other) {
        if (this != &other) {
            delete data;
            data = new char(*(other.data));
        }
        return *this;
    }

    // Destruktor
    ~A() {
        delete data;
    }

    // Metoda do wyświetlania danych
    void printData() const {
        std::cout << "Data: " << *data << std::endl;
    }
};

int main() {
    A obj1('A');
    A obj2('B');
    A obj3('c');

    obj2 = obj1;
    obj3 = 'E';

    obj2.printData();  // Wyświetla: Data: 65
    obj3.printData();  // Wyświetla: Data: 69

    return 0;
}

