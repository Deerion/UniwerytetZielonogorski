inw = """Litwo! Ojczyzno moja! ty jesteś jak zdrowie;
Ile cię trzeba cenić, ten tylko się dowie,
Kto cię stracił. Dziś piękność twą w całej ozdobie
Widzę i opisuję, bo tęsknię po tobie."""

print(inw)

with open("inwokacja.txt", "w", encoding="utf-8") as file:
    file.write(inw)

print("\n")

inpt = open(r'C:\inwokacja.txt', 'r', encoding='utf-8')
for line in inpt:
    print(line.strip())
inpt.close()

