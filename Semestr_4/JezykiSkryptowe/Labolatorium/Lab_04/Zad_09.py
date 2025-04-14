import importlib
from mymath.Zad_02 import myalgebra   # Importujemy moduł z właściwej ścieżki

vector = []

while True:
    val = input("Podaj liczbę lub 'K', aby zakończyć: ")
    if val.upper() == 'K':
        break

    try:
        num = float(val)
        vector.append(num)
    except ValueError:
        print("To nie jest liczba!")
        continue  # Pomijamy dalsze operacje przy błędnym wejściu

    # Przeładuj moduł myalgebra – zmiany w pliku zostaną wczytane
    importlib.reload(myalgebra)
    print("Moduł myalgebra został przeładowany!")

    # Dla demonstracji: tworzymy drugi wektor 'd' - każdy element zwiększony o 1
    c = vector
    d = [x + 1 for x in vector]

    print("Wynik dodawania wektorów:", c, "+", d, "=", myalgebra.dodaj(c, d))
    print("Wynik odejmowania wektorów:", c, "-", d, "=", myalgebra.odejmij(c, d))
    print("Wynik mnożenia wektorów:", c, "*", d, "=", myalgebra.pomnoz(c, d))
