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
resultado = nombres[['nombre']][condicion].count()
print("2.1-", '\n', resultado, '\n')

condicion = (nombres.anio == 2012) & (nombres.nombre.str.startswith('S'))
resultado = nombres[['nombre']][condicion].count()
print("2.2-", '\n', resultado, '\n')

condicion = (nombres.nombre.str.startswith('A')) | (nombres.nombre.str.startswith('E')) | (nombres.nombre.str.startswith('I')) | (nombres.nombre.str.startswith('O')) | (nombres.nombre.str.startswith('U'))
resultadoVocales = nombres[['nombre']][condicion].count()
print("2.3-", '\n', resultadoVocales, '\n')

condicion = (nombres.nombre.str.startswith('A')) | (nombres.nombre.str.startswith('E')) | (nombres.nombre.str.startswith('I')) | (nombres.nombre.str.startswith('O')) | (nombres.nombre.str.startswith('U'))
nombresVocal = nombres[['nombre']][condicion]
condicion = (nombres.anio >= 2010) & (nombres.anio <= 2013)
resultado = nombresVocal[['nombre']][condicion].count()
print("2.4-", '\n', resultado, '\n')

condicion = nombres.cantidad == nombres.cantidad.max()
resultado = nombres[['nombre']][condicion]
print("2.5-", '\n', resultado, '\n')

anio2014 = nombres[nombres.anio == 2014]
condicion = anio2014.cantidad == anio2014.cantidad.max()
resultado = anio2014[['nombre']][condicion]
print("2.6-", '\n', resultado, '\n')

anio2010 = nombres[nombres.anio == 2010]
condicion = anio2010.cantidad == anio2010.cantidad.min()
resultado = anio2010[['nombre']][condicion]
print("2.7-", '\n', resultado, '\n')

anio2011 = nombres[(nombres.anio == 2011) & (nombres.nombre.str.startswith('A'))]
condicion = anio2011.cantidad == anio2011.cantidad.min()
resultado = anio2011[['nombre']][condicion]
print("2.8-", '\n', resultado, '\n')

resultado = nombres.cantidad.mean()
print("2.9-", '\n', resultado, '\n')

print("2.10-", '\n')
anio = nombres[nombres.anio == 2010]
resultado = anio.cantidad.mean()
print("2010", '\n', resultado, '\n')

anio = nombres[nombres.anio == 2011]
resultado = anio.cantidad.mean()
print("2011", '\n', resultado, '\n')

anio = nombres[nombres.anio == 2012]
resultado = anio.cantidad.mean()
print("2012", '\n', resultado, '\n')

anio = nombres[nombres.anio == 2013]
resultado = anio.cantidad.mean()
print("2013", '\n', resultado, '\n')

anio = nombres[nombres.anio == 2014]
resultado = anio.cantidad.mean()
print("2014", '\n', resultado, '\n')

resultado = nombres.nombre.drop_duplicates().count()
print("2.11-", '\n', resultado, '\n')

print("2.12-", '\n')
condicion = nombres.nombre.str.startswith('A')
resultado = nombres[['nombre']][condicion].count()
print("A-", '\n', resultado, '\n')

condicion = nombres.nombre.str.startswith('E')
resultado = nombres[['nombre']][condicion].count()
print("E-", '\n', resultado, '\n')

condicion = nombres.nombre.str.startswith('I')
resultado = nombres[['nombre']][condicion].count()
print("I-", '\n', resultado, '\n')

condicion = nombres.nombre.str.startswith('O')
resultado = nombres[['nombre']][condicion].count()
print("O-", '\n', resultado, '\n')

condicion = nombres.nombre.str.startswith('U')
resultado = nombres[['nombre']][condicion].count()
print("U-", '\n', resultado, '\n')





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
