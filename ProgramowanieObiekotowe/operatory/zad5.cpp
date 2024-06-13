#include <iostream>
using namespace std;
class A{
public:
    A(){cout<<"A\n";}
    virtual void f(){cout<<"fA\n";}
};
class B:public A{
public:
    B(){cout<<"B\n";}
    virtual void f(){cout<<"fB\n";}
};

int main() {
    A objA;
    B objB;
    int x;
    cin >> x;
    A* wsk;
    if(x==1){
        wsk=&objA;
    }else{
        wsk=&objB;
    }
    wsk->f();

    return 0;
}
