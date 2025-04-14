# Lab_04/mymath/Zad_02/myalgebra.py

def dodaj(a, b):
    """
    Funkcja dodaje elementy dwóch wektorów (list liczb).
    Jeśli przekazane argumenty nie są listami lub mają różną długość,
    zwraca komunikat o błędzie.
    """
    if isinstance(a, list) and isinstance(b, list) and len(a) == len(b):
        return [x + y for x, y in zip(a, b)]
    else:
        return "Błąd: Nieprawidłowe argumenty do dodawania."

def odejmij(a, b):
    """
    Funkcja odejmuje elementy dwóch wektorów (list liczb).
    Jeśli przekazane argumenty nie są listami lub mają różną długość,
    zwraca komunikat o błędzie.
    """
    if isinstance(a, list) and isinstance(b, list) and len(a) == len(b):
        return [x - y for x, y in zip(a, b)]
    else:
        return "Błąd: Nieprawidłowe argumenty do odejmowania."

def pomnoz(a, b):
    """
    Funkcja mnoży elementy dwóch wektorów (list liczb).
    Jeśli przekazane argumenty nie są listami lub mają różną długość,
    zwraca komunikat o błędzie.
    """
    if isinstance(a, list) and isinstance(b, list) and len(a) == len(b):
        return [x * y for x, y in zip(a, b)]
    else:
        return "Błąd: Nieprawidłowe argumenty do mnożenia."
