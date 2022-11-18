from folium import Map, Marker, IFrame, Popup
import pandas as pd
from IPython.display import display

df = pd.read_csv('./20_Octubre/oferta_gastronomica.csv')

ubicacion_de_buenos_aires = [-34.603722, -58.381592]

mapa = Map(location = ubicacion_de_buenos_aires, zoom_start=15)

for i, longitudLocal in enumerate(df["long"]):

    latitudLocal = df['lat'][i]

    nombre = df["nombre"][i]
    tipoMenu = df["cocina"][i]

    nombreCocinaHTML = f"<p>Nombre: {nombre}</p><br><p>Tipo de menu: {tipoMenu}</p>"

    direccion = df["direccion_completa"][i]
    telefono = df["telefono"][i]
    barrio = df["barrio"][i]

    direccionTelefonoBarrioHTML = f"<p>Direccion: {direccion}</p><br><p>Telefono: {telefono}</p><br><p>Barrio: {barrio}</p>"

    popup = Popup(IFrame(direccionTelefonoBarrioHTML, width = 100, height = 100), max_width = 100)
    
    # Por alguna razon cuando le paso una variable al tooltip el mapa se queda en blanco. No puedo hacer lo del nombre de la cocina y el menu
    # marker = Marker(location = [latitudLocal, longitudLocal], popup = direccionTelefonoBarrioHTML, tooltip = nombreCocinaHTML)
    marker = Marker(location = [latitudLocal, longitudLocal], popup = direccionTelefonoBarrioHTML, tooltip = "Aca iria nombreCocinaHTML")
    
    mapa.add_child(marker)

mapa.save('./mapa.html')