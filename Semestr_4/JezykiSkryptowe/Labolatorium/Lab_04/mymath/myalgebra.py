# myalgebra.py

def dodaj(a, b):
    if len(a) != len(b) or len(a[0]) != len(b[0]):
        return "Nie można dodać macierzy o różnych wymiarach"

    return [[x + y for x, y in zip(row_a, row_b)] for row_a, row_b in zip(a, b)]


def odejmij(a, b):
    if len(a) != len(b) or len(a[0]) != len(b[0]):
        return "Nie można odjąć macierzy o różnych wymiarach"

    return [[x - y for x, y in zip(row_a, row_b)] for row_a, row_b in zip(a, b)]


def pomnoz(a, b):
    if len(a[0]) != len(b):
        return "Nie można pomnożyć macierzy, ponieważ liczba kolumn w pierwszej macierzy różni się od liczby wierszy w drugiej"

    result = []
    for i in range(len(a)):
        row = []
        for j in range(len(b[0])):
            row.append(sum(a[i][k] * b[k][j] for k in range(len(b))))
        result.append(row)
    return result
