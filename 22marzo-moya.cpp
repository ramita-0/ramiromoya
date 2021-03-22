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
	for(int i=0; i<6; i++){
		cin>>palabra;
		palabras.push_back(palabra);
	}
	for(int i=0; i<palabras.size(); i++){
		int size=palabras[i].size();
		if(esPar(size)==true){
			palabrasPar.push_back(palabras[i]);
			i++;
		}
		else{
			palabrasImp.push_back(palabras[i]);
			i++;
		}
	}
	for(int i=0; i!=6; i++){
		if(palabras.size()<=3){
			palabras.push_back(palabrasPar[j]);
			i++;
		}
		else{
			palabras.push_back(palabrasImp[j]);
			i++;
		}
	}
	for(int i=0; i<palabras.size(); i++){
		cout<<palabras[i]<<" - ";
	}
}