import requests

<<<<<<< HEAD
if __name__ == '__main__':
   
    archivo = open("gatos.csv", "w")
    columnas = "gatito, tag,  status \n"
    archivo.write(columnas)
    archivo.close()
    
    for i in range(10):
        respuesta = requests.get('https://cataas.com/c')
        informacion = respuesta.json()
        respuesta.status_code
        mensaje = informacion["message"]
        estado = informacion["status"]
        # tag = informacion["tag"]

        linea = mensaje + "," + estado + "\n"

        archivo = open("gatos.csv", "a")
        archivo.write(linea)
=======

if __name__ == '__main__':

    archivo = open("ale.csv", "w")
    archivo.write("--Cervezas-- \n \nNombre    Precio    ID")
    archivo.write("\n\n")
    archivo.close()
    
    respuesta = requests.get('https://api.sampleapis.com/beers/ale')
    objects = respuesta.json()

    for obj in objects:
        name = obj["name"]
        price = obj["price"]
        id = str(obj["id"])

        linea = name + ", " + price + ", " + id

        archivo = open("ale.csv", "a")
        archivo.write(linea)
        archivo.write("\n")
>>>>>>> 801de7ea37e3f2ec06fcd10c2f6ccdd03a7acfdc
        archivo.close()