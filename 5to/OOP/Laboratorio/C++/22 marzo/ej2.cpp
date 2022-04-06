#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main(){
	string nombreP;
	int index=0;
	int precioP;
	int precioVariable=0;
	bool ingreso=true;
	bool eitherYorN=false;
	vector<string>nombresP;
	vector<int>preciosP;
	
	
	while(ingreso==true){
		eitherYorN=false;
		cout<<"Ingrese el nombre del producto: "<<endl;
		cin>>nombreP;
		nombresP.push_back(nombreP);
		cout<<endl<<endl<<"Ingrese el precio del producto: "<<endl;
		cin>>precioP;
		preciosP.push_back(precioP);
		system("CLS");
		cout<<"Importe parcial a pagar: "<<endl<<endl;
		for(int i=0; i<nombresP.size(); i++){
			precioVariable+=preciosP[i];
			cout<<nombresP[i]<<" $"<<preciosP[i]<<endl;
		}
		cout<<endl<<"Subtotal: $"<<precioVariable;
		cout<<endl<<"Ingresar otro producto? Y/N: ";
		char yn;
		cin>>yn;
		while(eitherYorN==false){
		
			if(yn==89 || yn==121){
				precioVariable=0;
				eitherYorN=true;
				cout<<endl;
			}
			else if(yn==78 || yn==110){
				ingreso=false;
				system("CLS");
				break;
			}
			else{
				system("CLS");
				cout<<"Not valid"<<endl;
				cin>>yn;
			}
		}	
	}
	cout<<"-Importe final-"<<endl<<endl;
	for(int i=0; i<nombresP.size(); i++){
		cout<<nombresP[i]<<" $"<<preciosP[i]<<endl;
	}
	cout<<endl<<"Total: $"<<precioVariable;
	
}
