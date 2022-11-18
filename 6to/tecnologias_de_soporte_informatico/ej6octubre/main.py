import pandas as pd
import matplotlib.pyplot as plt

nombres = pd.read_csv("./nombres-2010-2014.csv",sep=",",engine="python")
actividades = pd.read_csv("./actividades-culturales-2021.csv",sep=";",engine="python")

# Parte 1
condicion = actividades.Modalidad == "Virtual"
resultado = actividades[['Modalidad']][condicion].count().to_string().replace("Modalidad    ", "")
condicion2 = actividades.Modalidad == "Presencial"
resultado2 = actividades[['Modalidad']][condicion2].count().to_string().replace("Modalidad    ", "")
print("1.1-", '\n' + f"Virtual {resultado}", '\n' + f"Presencial {resultado2}", '\n')

condicion = actividades.se_suspende_por_lluvia != "No"
resultado = actividades[['se_suspende_por_lluvia']][condicion].count().to_string().replace("se_suspende_por_lluvia    ", "")
print("1.2-", resultado, '\n')

condicion = (actividades.fecha_inicio >= "2021-05-01") & (actividades.fecha_fin <= "2021-05-30")
resultado = actividades[['fecha_inicio']][condicion]
print("1.3-", '\n', resultado, '\n')

condicion = (actividades.se_suspende_por_lluvia != "No") & (actividades.fecha_inicio >= "2021-09-01") & (actividades.fecha_fin <= "2021-09-30")
resultado = actividades[['actividad']][condicion]
print("1.4-", '\n', resultado, '\n')

condicion = (actividades.descripcion_actividad.str.contains('cine')) & (actividades.descripcion_actividad != "nan")
resultado = actividades[['actividad']][condicion]
print("1.5-", '\n', resultado, '\n')

resultado = actividades.groupby(['barrio']).count()
print("1.7-", '\n', resultado, '\n')

condicion = (actividades.descripcion_actividad.str.contains('musica')) & (actividades.barrio == "VILLA URQUIZA")
resultado = actividades[['actividad']][condicion].count()
print("1.8-", '\n', resultado, '\n')

# Parte 2
condicion = nombres.anio == 2012
print(nombres[['nombre']][condicion].count())

condicion = (nombres.anio == 2012) & (nombres.nombre.str.startswith('S'))
print(nombres[['nombre']][condicion].count())

condicion = (nombres.nombre.str.startswith('A')) | (nombres.nombre.str.startswith('E')) | (nombres.nombre.str.startswith('I')) | (nombres.nombre.str.startswith('O')) | (nombres.nombre.str.startswith('U'))
print(nombres[['nombre']][condicion].count())

condicion = (nombres.nombre.str.startswith('A')) | (nombres.nombre.str.startswith('E')) | (nombres.nombre.str.startswith('I')) | (nombres.nombre.str.startswith('O')) | (nombres.nombre.str.startswith('U'))
nombresVocal = nombres[['nombre']][condicion]

condicion = (nombres.anio >= 2010) & (nombres.anio <= 2013)
print(nombresVocal[['nombre']][condicion].count())

numero = nombres.cantidad.max()
condicion = nombres.cantidad == numero
print(nombres[['nombre']][condicion])

condicion = nombres.anio == 2014
anio2014 = nombres[condicion]

numero = anio2014.cantidad.max()
condicion = anio2014.cantidad == numero
print(anio2014[['nombre']][condicion])

condicion = nombres.anio == 2010
anio2010 = nombres[condicion]

numero = anio2010.cantidad.min()
condicion = anio2010.cantidad == numero
print(anio2010[['nombre']][condicion])

condicion = (nombres.anio == 2011) & (nombres.nombre.str.startswith('A'))
anio2011 = nombres[condicion]

numero = anio2011.cantidad.min()
condicion = anio2011.cantidad == numero
print(anio2011[['nombre']][condicion])

print(nombres.cantidad.mean())

condicion = nombres.anio == 2010
anio = nombres[condicion]

print("Promedio de nombres distintos usados en el 2010")
print(anio.cantidad.mean())

condicion = nombres.anio == 2011
anio = nombres[condicion]

print("Promedio de nombres distintos usados en el 2011")
print(anio.cantidad.mean())

condicion = nombres.anio == 2012
anio = nombres[condicion]

print("Promedio de nombres distintos usados en el 2012")
print(anio.cantidad.mean())

condicion = nombres.anio == 2013
anio = nombres[condicion]

print("Promedio de nombres distintos usados en el 2013")
print(anio.cantidad.mean())


condicion = nombres.anio == 2014
anio = nombres[condicion]

print("Promedio de nombres distintos usados en el 2014")
print(anio.cantidad.mean())

nombresUnicos = nombres.nombre.drop_duplicates()
print(nombresUnicos.count())

condicion = nombres.nombre.str.startswith('A')
print("Cantidad de nombres que empiezan con A")
print(nombres[['nombre']][condicion].count())

condicion = nombres.nombre.str.startswith('E')
print("Cantidad de nombres que empiezan con E")
print(nombres[['nombre']][condicion].count())

condicion = nombres.nombre.str.startswith('I')
print("Cantidad de nombres que empiezan con I")
print(nombres[['nombre']][condicion].count())

condicion = nombres.nombre.str.startswith('O')
print("Cantidad de nombres que empiezan con O")
print(nombres[['nombre']][condicion].count())

condicion = nombres.nombre.str.startswith('U')
print("Cantidad de nombres que empiezan con U")
print(nombres[['nombre']][condicion].count())


# Grafico de torta
condicion = actividades.Modalidad == "Virtual"
resultado = actividades[['Modalidad']][condicion].count().to_string().replace("Modalidad    ", "")
condicion2 = actividades.Modalidad == "Presencial"
resultado2 = actividades[['Modalidad']][condicion2].count().to_string().replace("Modalidad    ", "")
labels = 'Virtual', 'Presencial'

sizes = [int(resultado), int(resultado2)]
explode = (0, 0.1)

fig1, ax1 = plt.subplots()
ax1.pie(sizes, explode=explode, labels=labels, autopct='%1.1f%%',
        shadow=True, startangle=90)
ax1.axis('equal')

plt.show()
