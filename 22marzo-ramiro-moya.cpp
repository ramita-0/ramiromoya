#include <iostream>
#include <string>
#include <vector>
using namespace std;

bool esPar(int size){
	if(size%2==0) return true;
	else return false;
}

int main(){
	string palabra;
	vector<string>palabras;
	vector<string>palabrasOrdenadas;
	for(int i=0; i<6; i++){
		cin>>palabra;
		palabras.push_back(palabra);
	}
	for(int i=0; i<=palabras.size(); i++){
		int size=palabras[i].size();
		cout<<size;
		if(esPar(size)==true){
			palabrasOrdenadas.push_back(palabras[i]);
			palabras.erase(palabras.begin()+i);
			i++;
		}
		else i++;
	}
	cout<<palabrasOrdenadas.size();
	for(int i=0; i<palabras.size(); i++){
		palabrasOrdenadas.push_back(palabras[i]);	
		i++;
	}

	for(int i=0; i<palabrasOrdenadas.size(); i++){
		cout<<palabrasOrdenadas[i]<<" - ";
		i++;
	}
}