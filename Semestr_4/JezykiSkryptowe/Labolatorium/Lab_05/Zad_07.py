with open("inwokacja.txt", "r", encoding="utf-8") as file:
    tekst = file.read()

slowa = tekst.split()

# Save each word to a separate file
for i, slowo in enumerate(slowa, start=1):
    with open(f"word_{i}.txt", "w", encoding="utf-8") as word_file:
        word_file.write(slowo)

print(f"Saved {len(slowa)} words to separate files.")