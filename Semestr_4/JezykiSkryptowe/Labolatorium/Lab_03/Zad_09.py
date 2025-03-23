import statistics

studenci = [
    {"imie": "Jan", "nazwisko": "Kowalski", "wiek": 22, "oceny": [3, 4, 5, 5, 3, 4, 4, 3, 5, 4]},
    {"imie": "Anna", "nazwisko": "Nowak", "wiek": 21, "oceny": [4, 4, 4, 3, 3, 5, 5, 4, 4, 5]},
    {"imie": "Piotr", "nazwisko": "Wójcik", "wiek": 23, "oceny": [5, 5, 5, 4, 4, 4, 4, 5, 5, 4]}
]

srednie_oceny = [sum(s["oceny"]) / len(s["oceny"]) for s in studenci]
srednia_wszystkich = sum(srednie_oceny) / len(srednie_oceny)
mediana_wieku = statistics.median([s["wiek"] for s in studenci])
mediana_nazwiska = statistics.median([len(s["nazwisko"]) for s in studenci])

print(f"Średnie oceny studentów: {srednie_oceny}")
print(f"Średnia ocen wszystkich studentów: {srednia_wszystkich}")
print(f"Mediana wieku: {mediana_wieku}")
print(f"Mediana długości nazwiska: {mediana_nazwiska}")
