# Utworzyc slownik w ktorym kluczami sa adresy email, a wartosciami
# imiona i nazwiska, a następnie zwrocic posortowany slownik.

data = {
    "piotr.kowalski@example.com": "Piotr Kowalski",
    "barbara.kowalska@example.com": "Barbara Kowalska",
    "bartosz.zielony@example.com": "Bartosz Zielony",
    "ice.tink@example.com": "Ice Tink",
}

# Sort the dictionary by keys (email addresses)
sorted_data = dict(sorted(data.items()))

print("Posortowany słownik:\n" + "\n".join(f"\t{key}: {value}" for key, value in sorted_data.items()))

