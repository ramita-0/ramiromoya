#include <iostream>
#include <vector>
using namespace std;

int sumaNumeros(int a, int b){
    int res=a+b;
    cout<<"El resultado es : ";
    return res;
}

int main(){
    int a,b;
    cout<<"Ingrese 2 Numeros: "<<endl<<endl;
    cin>> a;
    cin>> b;
    cout<<endl<<endl;
    cout<<sumaNumeros(a,b);
    cout<<endl<<endl;
}
