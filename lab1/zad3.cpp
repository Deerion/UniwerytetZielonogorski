#include <iostream>

int zwiekszacz(int liczba){
    return liczba + 1;
}

using namespace std;
int main() {
    int liczba;
    cout << "podaj liczbe:  ";  cin >> liczba;
    cout << zwiekszacz(liczba);

    return 0;
}