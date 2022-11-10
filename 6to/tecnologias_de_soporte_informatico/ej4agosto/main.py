from bs4 import BeautifulSoup as soup
import requests
import pandas as pd

nombre = []
apellido = []
tag = []
circuito = []
equipo = []
tiempoVuelta = []
y = []

# Extraigo los mejores tiempos de vuelta de cada piloto de los circutos de la F1 2021 
url = 'https://www.formula1.com/en/results.html/2021/fastest-laps.html'

r = requests.get(url)
s = soup(r.text, 'html.parser')

y = y + [2021 for i in range(0,len(list(s.find_all('span', class_='hide-for-tablet'))))]
nombre = nombre + list(x.text.strip() for x in (s.find_all('span', class_='hide-for-tablet')))
apellido = apellido + list(x.text.strip() for x in (s.find_all('span', class_='hide-for-mobile')))
tag = tag + list(x.text.strip() for x in (s.find_all('span', class_='uppercase hide-for-desktop')))
circuito = circuito + list(x.text.strip() for x in (s.find_all('td', class_='width30 dark')))
equipo = equipo + list(x.text.strip() for x in (s.find_all('td', class_='width25 semi-bold uppercase')))
tiempoVuelta = tiempoVuelta + list(x.text.strip() for x in (s.find_all('td', class_='dark bold')))

pd.set_option('display.max_columns', None)
nombreCompleto = list(x + " " + z for x, z in zip(nombre, apellido))
df = pd.DataFrame(zip(y, circuito, nombreCompleto, tag, equipo, tiempoVuelta),
                  columns=['Anio', 'Circuito', 'Nombre', 'Tag', 'Equipo', 'Tiempo de Vuelta'])

df.to_csv('./csv.csv')