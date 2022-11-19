import pandas as pd

diccionario = { 'categoria':['Cantidad total de registros', 'CABA','PBA','Catamarca','Chaco','Chubut','Córdoba','Corrientes','Entre Ríos','Formosa','Jujuy','La pampa','La rioja','Mendoza','Misiones','Rio negro','Salta','San juan','San luis','Santa cruz','Santa fe','Santiago del estero','Tierra del fuego','Tucumán'],
                'categoria':['Cantidad total de registros', 'CABA','PBA','Catamarca','Chaco','Chubut','Córdoba','Corrientes','Entre Ríos','Formosa','Jujuy','La pampa','La rioja','Mendoza','Misiones','Rio negro','Salta','San juan','San luis','Santa cruz','Santa fe','Santiagodel estero','Tierradel fuego','Tucumán'],
                'categoria':['Cantidad total de registros', 'CABA','PBA','Catamarca','Chaco','Chubut','Córdoba','Corrientes','Entre Ríos','Formosa','Jujuy','La pampa','La rioja','Mendoza','Misiones','Rio negro','Salta','San juan','San luis','Santa cruz','Santa fe','Santiagodel estero','Tierradel fuego','Tucumán'],
                'categoria':['Cantidad total de registros', 'CABA','PBA','Catamarca','Chaco','Chubut','Córdoba','Corrientes','Entre Ríos','Formosa','Jujuy','La pampa','La rioja','Mendoza','Misiones','Rio negro','Salta','San juan','San luis','Santa cruz','Santa fe','Santiagodel estero','Tierradel fuego','Tucumán']}

df = pd.DataFrame.from_dict(diccionario, orient='index')
dataframe = pd.DataFrame(diccionario)
dataframe.to_csv("nuevo_dataset.csv")