with open("inwokacja.txt", "r", encoding="utf-8") as plik:
    inw_plik = plik.read()

# Podział na linijki
linijki = inw_plik.splitlines()

# Scalenie w jeden łańcuch znaków z separatorem " "
scalony_tekst = ' - '.join(linijki)

print("Scalony tekst:\n", scalony_tekst)
