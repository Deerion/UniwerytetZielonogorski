#include <iostream>

class MyClass {
private:
    char* data;

public:
    // Konstruktor
    MyClass(char value) : data(new char(value)) {}

    // Operator przypisania
    MyClass& operator=(const MyClass& other) {
        if (this != &other) {
            delete data;
            data = new char(*(other.data));
        }
        return *this;
    }

    // Destruktor
    ~MyClass() {
        delete data;
    }

    // Metoda do wyświetlania danych
    void printData() const {
        std::cout << "Data: " << *data << std::endl;
    }
};

int main() {
    MyClass obj1('A');
    MyClass obj3('B');
    obj3 = obj1;
    obj3.printData();  // Wyświetla: Data: 65

    return 0;
}

