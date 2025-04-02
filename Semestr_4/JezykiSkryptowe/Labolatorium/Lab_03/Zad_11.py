import random

# Pobranie długosci sekwencji oraz zakresu z którego losowane są liczby
sequence_length = int(input("Podaj dlugosc sekwencji: "))
range_start = int(input("Podaj poczatkowa liczbe zakresu: "))
range_end = int(input("Podaj koncowa liczbe zakresu: "))

# Generowanie losowej sekwencji
secret = random.choices([x for x in range(range_start, range_end + 1)], k=sequence_length)
print("Sekwencja do odgadniecia została wylosowana!")
print(secret)
# Gra
while True:
    guess = list(
        map(int, input(f"Podaj swoja propozycje ({sequence_length} cyfr od {range_start} do {range_end}): ").split()))

    if len(guess) != sequence_length:
        print(f"Prosze podac dokladnie {sequence_length} cyfr.")
        continue

    correct_pos = sum([1 for i in range(sequence_length) if guess[i] == secret[i]])
    correct_digits = sum([min(guess.count(x), secret.count(x)) for x in set(guess)]) - correct_pos

    print(f"Cyfry na wlasciwych miejscach: {correct_pos}")
    print(f"Cyfry w sekwencji, ale na innych miejscach: {correct_digits}")

    if correct_pos == sequence_length:
        print("Gratulacje! Zgadles sekwencje!")
        break
