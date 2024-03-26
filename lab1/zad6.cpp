#include <iostream>
#include <cmath>

int odloglosc(int x1,int y1,int z1,int x2,int y2,int z2){
    return sqrt(pow((x1-x2),2)+pow((y1-y2),2)+pow((z1-z2),2));
}

using namespace std;
int main(){
    cout << "odleglosc miedzy dwoma punktami wynosi: "<< odloglosc(1,2,3,5,2,6)<<endl;
}
