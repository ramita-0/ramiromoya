import requests


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
        archivo.close()