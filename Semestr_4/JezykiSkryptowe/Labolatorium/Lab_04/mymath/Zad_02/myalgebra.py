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
