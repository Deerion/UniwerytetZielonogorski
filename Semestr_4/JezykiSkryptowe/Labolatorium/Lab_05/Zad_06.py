with open("inwokacja.txt", "r", encoding="utf-8") as file:
    tekst = file.read()

# Remove all spaces from the text
bez_spacji = tekst.replace(" ", "")

# Save the modified text back to the file
with open("inwokacja.txt", "w", encoding="utf-8") as file:
    file.write(bez_spacji)

print(bez_spacji)