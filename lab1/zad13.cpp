// iloczyn (z1, z2) i  iloraz (z1, z2) dwóch liczb zespolonych ( z1= a+bi, z2= c+di )
#include <iostream>
using namespace std;

int main() {
    float a,b;
    cout << "Podaj wartosc a liczby z1=a+bi: ";
    cin >> a;
    cout << "Podaj wartosc b liczby z1=a+bi: ";
    cin >> b;

    float c,d;
    cout << "Podaj wartosc c liczby z2=c+di: ";
    cin >> c;
    cout << "Podaj wartosc d liczby z2=c+di: ";
    cin >> d;

    cout << "\n";

    // iloczyn z1 i z2
    cout << "Iloczyn z1 i z2:\t" << a*c-b*d << " + " << a*d+b*c << "i\n";
    // iloraz z1 i z2
    cout << "Iloraz z1 i z2:\t\t" << (a*c+b*d)/(c*c+d*d) << " + " << (b*c-a*d)/(c*c+d*d) << "i";
    return EXIT_SUCCESS;
}