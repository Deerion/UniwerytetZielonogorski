#include <iostream>
#include <cstring>
using namespace std;

class A{
private:
    int x;
public:
    void f(int x){
        cout << x;
    }
};
class B:public A{

};
class C:public B{
public:
    void f(int x){
        cout << "Hello";
    }
};
class D:public C{};

int main() {
    A objA;
    objA.f(1);

    B objb;
    objb.f(2);

    C objC;
    objC.f(3);

    D objD;
    objD.f(4);
    return 0;
}
