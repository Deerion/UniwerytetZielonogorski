def dodaj(a, b):
    if (len(a)==len(b)):
        return [x + y for x, y in zip(a, b)]
    else:
        return("Nie można dodać wektorów o różnych długościach")

def odejmij(a, b):
    if (len(a)==len(b)):
        return [x - y for x, y in zip(a, b)]
    else:
        return("Nie można odjąć wektorów o różnych długościach")

def pomnoz(a, b):
    if (len(a)==len(b)):
        return [x * y for x, y in zip(a, b)]
    else:
        return("Nie można pomnożyć wektorów o różnych długościach")



c = [1, 2, 3,]
d = [4, 5, 6]
print("Wynik dodawania wektorów ", c , "+", d, "=", dodaj([1, 2, 3,], [4, 5, 6]))
print("Wynik odejmowania wektorów ", c , "-", d, "=", odejmij([1, 2, 3,], [4, 5, 6]))
print("Wynik mnozenia wektorów ", c , "*", d, "=", pomnoz([1, 2, 3,], [4, 5, 6]))