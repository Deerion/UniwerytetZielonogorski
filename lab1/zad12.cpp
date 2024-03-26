#include <iostream>

using namespace std;

int main() {
    char tab[5] = {'a', 'b', 'c', 'd', 'e'};
    char temp;

    for (int i = 0; i < 5 / 2; i++) {
        temp = tab[i];
        tab[i] = tab[4 - i];
        tab[4 - i] = temp;
    }

    for (int i = 0; i < 5; i++) {
        cout << tab[i] << " ";
    }

    return EXIT_SUCCESS;
}
