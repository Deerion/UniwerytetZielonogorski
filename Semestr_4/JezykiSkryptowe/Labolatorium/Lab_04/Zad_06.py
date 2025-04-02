from Lab_04.mymath.Zad_01.myalgebra import *


#zad 1
a = 2
b = 3
print("Wynik dodawania ", a , "+", b, "=",dodaj(a, b))
print("Wynik odejmowania ", a , "-", b, "=",odejmij(a, b))
print("Wynik mnozenia ", a , "*", b, "=",pomnoz(a, b))
print("Wynik dzielenia ", a , "/", b, "=",podziel(a, b))

print("-----------------------------")
#zad 2

from Lab_04.mymath.Zad_02.myalgebra import *
c = [1, 2, 3]
d = [4, 5, 6]
print("Wynik dodawania wektorów ", c , "+", d, "=", dodaj([1, 2, 3,], [4, 5, 6]))
print("Wynik odejmowania wektorów ", c , "-", d, "=", odejmij([1, 2, 3,], [4, 5, 6]))
print("Wynik mnozenia wektorów ", c , "*", d, "=", pomnoz([1, 2, 3,], [4, 5, 6]))

