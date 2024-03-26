#include <iostream>
int zwiekszacz(int liczba){
    return liczba + 1;
}

using namespace std;
int main(){
    for(int i = 0;i<18;i++){
        cout << " Argument("<< i << "), zwiekszacz "<< zwiekszacz(i) << endl;
    }

}
