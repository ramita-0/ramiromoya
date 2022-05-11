import pandas as pd

df = pd.read_csv("ventas.csv", sep=",", engine="python")
df.set_index("Region")
df.drop_duplicates()
df.to_csv("nuevoCsv.csv")
# Se genera un csv igual ya que no tiene duplicados el csv utilizado

df = pd.concat([df[:3000],df[-2000:]])
df.to_csv("nuevoCsv.csv")

print("-------------")
print(df.loc[[1,5,12,36]])
print("-------------")
print(df.columns)
print("-------------")
print(df["Total Profit"].value_counts())