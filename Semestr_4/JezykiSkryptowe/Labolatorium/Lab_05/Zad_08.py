import string

plik = open("inwokacja.txt", "r", encoding="utf-8")
inwokacja = plik.read()

zmodyfikowany_tekst = inwokacja.replace("a", "{}").format(*string.ascii_lowercase)

plik = open("inwokacja.txt", "w", encoding="utf-8")
plik.write(zmodyfikowany_tekst)

print(zmodyfikowany_tekst)

plik.close()

