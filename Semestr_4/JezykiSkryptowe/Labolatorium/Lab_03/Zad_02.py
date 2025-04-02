# Jaka jest roznica pomiedzy break a continue?

# Przyklad uzycia break
print("Break:")
for i in range(10):
    if i == 5:
        break # Przerywa petle
    print(i)
# Wynik: 0 1 2 3 4

print()

# Przyklad uzycia continue
print("Continue:")
for i in range(10):
    if i == 5:
        continue # Pomija reszte petli i przechodzi do nastepnej iteracji
    print(i)
# Wynik: 0 1 2 3 4 6 7 8 9