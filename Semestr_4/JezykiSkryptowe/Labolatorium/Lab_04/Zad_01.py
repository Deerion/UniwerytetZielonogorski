def dodaj(a, b):
    return a + b

def odejmij(a, b):
    return a - b

def pomnoz(a, b):
    return a * b

def podziel(a,b):
    if b == 0:
        return("Nie można dzielić przez zero")
    return a / b

a = 2
b = 0
print("Wynik dodawania ", a , "+", b, "=",dodaj(a, b))
print("Wynik odejmowania ", a , "-", b, "=",odejmij(a, b))
print("Wynik mnozenia ", a , "*", b, "=",pomnoz(a, b))
print("Wynik dzielenia ", a , "/", b, "=",podziel(a, b))