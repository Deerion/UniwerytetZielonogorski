#include <iostream>
#include <cstring>
using namespace std;
class A{
public:
    A(){cout<<"A\n";}
    virtual void f(){cout<<"fA\n";}
};
class B:public A{
public:
    B(){cout<<"B\n";}
    void f(){cout<<"fB\n";}
};
void g(A*obj){
    obj->f();
}

int main() {
    A objA;
    B objB;

    g(&objA);

    g(&objB);


    return 0;
}
