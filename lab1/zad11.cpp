#include <iostream>

using namespace std;
int main(){

    double tab[3][3]=
            {{2.2,3,5},
            {5,3,2},
            {7,3,0.4}};

    double min = tab[0][0];
    double max = tab[0][0];

    for(int i=0;i<3;i++){
        for(int j=0; j<3; j++){
            if(min>tab[i][j])
                min=tab[i][j];
        }
    }
    cout << min << "\n";
    for(int i=0;i<3;i++){
        for(int j=0; j<3; j++){
            if(max<tab[i][j])
                max=tab[i][j];
        }
    }
    cout << max;


    return 0;
}