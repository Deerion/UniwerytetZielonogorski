with open("inwokacja.txt", "r", encoding="utf-8") as file:
    inw_plik = file.read()

print(inw_plik)

print("\n" + "="*50 + "\n")

inpt = open(r'C:\inwokacja.txt', 'r', encoding='utf-8')
for line in inpt:
    print(line.strip())
inpt.close()
