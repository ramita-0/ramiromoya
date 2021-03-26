#include "ejercicios.h"

bool esPar(int n){
    int res = n%2;
    if(res==0) return true;
    else return false;
}

bool todosSonPares(vector<int> numeros){
    for(int i=0; i<numeros.size(); i++){
        bool parCheck = esPar(numeros[i]);
        if (parCheck == false) return false;
    }
    return true;
}

void agregarNumeros(vector<int> numeros, vector<int> elementosNuevos){
    for(int i=0; i<elementosNuevos.size(); i++){
        numeros.push_back(elementosNuevos[i]);
    }
    for(int i=0; i<numeros.size(); i++){
        cout<<numeros[i]<<", ";
    }
}

void imprimirValores(vector<int> numeros){
    for(int i=0; i<numeros.size(); i++){
        cout<<numeros[i]<<", ";
    }
}

vector<vector<int> > multiplicarMatriz(vector<vector<int>> matriz){

}

void mezclarMatrices(vector<vector<int> > matrizA, vector<vector<int> > matrizB){

}
