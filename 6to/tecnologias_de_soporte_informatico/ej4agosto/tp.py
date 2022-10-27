import requests
import pandas as pd
from bs4 import BeautifulSoup

if __name__ == '__main__':
    
    pagina = requests.get("https://acharts.co/us_singles_top_100")

    soup = BeautifulSoup(pagina.content, "html.parser")
    table = soup.find("table", id="ChartTable")
    for row in table.findAll("tr"):
        position = row.find("span", {"itemprop": "position"})
        print(position)

        