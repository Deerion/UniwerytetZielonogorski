import random

# Generowanie losowej sekwencji
secret = random.choices([x for x in range(1, 4)], k=4)
print(secret) # Sekwencja do odgadnięcia
# Gra
while True:
    guess = list(map(int, input("Podaj swoja propozycja (4 cyfry od 1-3): ").split()))
    correct_pos = sum([1 for i in range(4) if guess[i] == secret[i]])
    correct_digits = sum([min(guess.count(x), secret.count(x)) for x in set(guess)]) - correct_pos
    print(f"Cyfry na właściwych miejscach: {correct_pos}")
    print(f"Cyfry w sekwencji, ale na innych miejscach: {correct_digits}")
    if correct_pos == 4:
        print("Gratulacje! Zgadłeś sekwencję!")
        break
