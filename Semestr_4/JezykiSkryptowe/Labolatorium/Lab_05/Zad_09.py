plik = open("inwokacja.txt", "r", encoding="utf-8")
inw = plik.read()

counter = 1
formatted_inw = ""
for char in inw:
    if char == "w":
        formatted_inw += f"{{w{counter:04x}}}"
        counter += 1
    else:
        formatted_inw += char

# Displaying the result
print(formatted_inw)