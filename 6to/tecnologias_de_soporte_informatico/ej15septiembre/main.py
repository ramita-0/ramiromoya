import csv
import cv2
from pathlib import Path

ids = []
nombres = []
numRostros = []

idsOne = []
nombresOne = []
posicionOne = []

clasificadorRostros = cv2.CascadeClassifier(cv2.data.haarcascades+'haarcascade_frontalface_default.xml')

for i, pathImagen in enumerate(Path("/home/rama/trabajo/fotosTrabajoNadia").glob("*.jpg")):
  imagenActual = cv2.imread(str(pathImagen))
  copiaImagenActual = imagenActual.copy()
  rostros = clasificadorRostros.detectMultiScale(imagenActual)

  ids.append(i)
  nombres.append(pathImagen.stem)
  numRostros.append(len(rostros))

  for(x, y, ancho, alto) in rostros:
    cv2.rectangle(imagenActual, (x, y), (x + ancho, y + alto), (0, 255, 255), 2)
    rostro = copiaImagenActual[ y:y + alto, x:x +ancho ]
    cv2.imwrite('rostro' + str(i) + '.jpg', rostro)

    idsOne.append(i)
    nombresOne.append('rostro'+str(i)+'.jpg')
    posicionOne.append([x,y])

with open('csv.csv', 'w', newline='') as file:
  writer = csv.writer(file)
  for n, name in enumerate(nombres):
    writer.writerow([ids[n], name, numRostros[n]])

with open('csv1.csv', 'w', newline='') as file:
  writer = csv.writer(file)
  for n, name in enumerate(nombresOne):
    writer.writerow( [idsOne[n], name, posicionOne[n]] )