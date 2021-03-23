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
	vector<string>palabrasImp;
	vector<string>palabrasPar;
	vector<string>palabrasOrdenadas;
	for(int i=0; i<6; i++){
		cin>>palabra;
		palabras.push_back(palabra);
	}
	for(int i=0; i<palabras.size(); i++){
		int size=palabras[i].size();
		if(esPar(size)==true){
			palabrasPar.push_back(palabras[i]);
		}
		else{
			palabrasImp.push_back(palabras[i]);
		}
	}
	for(int i=0; palabrasOrdenadas.size()<6; i++){
		for(int j=0; j<palabrasPar.size(); j++){
			palabrasOrdenadas.push_back(palabrasPar[j]);
		}
		for(int j=0; j<palabrasImp.size(); j++){
			palabrasOrdenadas.push_back(palabrasImp[j]);
		}
	}
	cout<<endl<<endl;
	for(int i=0; i<palabrasOrdenadas.size(); i++){
		cout<<palabrasOrdenadas[i]<<" - ";
	}
}
