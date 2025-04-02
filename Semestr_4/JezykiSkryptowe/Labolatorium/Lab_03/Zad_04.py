# Jak obsluguje się wyjatki w Pythonie?

try:
    # Kod, ktory moze wywolac wyjatek
    result = 10 / 0
except ZeroDivisionError:
    # Kod obsłulgujacy wyjatek
    print("Nie mozna dzielić przez zero!")
else:
    # Kod, ktory wykona sie, jesli nie wystąpi wyjatek
    print("Wynik:", result)
finally:
    # Kod, ktory wykona sie niezaleznie od tego, czy wystapil wyjatek, czy nie
    print("Koniec obslugi wyjatkow.")