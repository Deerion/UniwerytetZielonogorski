from Lab_04.mymath.myalgebra import *


# Test z macierzami
e = [[1, 2, 3, 4], [4, 5, 6]]
f = [[7, 8, 9], [10, 11, 12]]

print("Wynik dodawania macierzy ", e, "+", f, "=", dodaj(e, f))
print("Wynik odejmowania macierzy ", e, "-", f, "=", odejmij(e, f))

# Test mnożenia macierzy
g = [[1, 2], [3, 4], [5, 6]]
h = [[7, 8, 9], [10, 11, 12]]
print("Wynik mnożenia macierzy ", g, "*", h, "=", pomnoz(g, h))