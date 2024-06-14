class MyClass {
private:
    char* data;

public:
    // Konstruktor
    MyClass(char value):data(new char (value)) {}

    // Konstruktor kopiujący
    MyClass(const MyClass& other) {
        data = new char(*(other.data));
    }

    // Destruktor
    ~MyClass() {
        delete data;
    }
};