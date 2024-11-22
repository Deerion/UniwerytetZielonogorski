#include <Wire.h>
#include <LiquidCrystal_I2C.h>

// Tworzenie obiektu LCD (adres 0x3F, rozmiar 16x2)
LiquidCrystal_I2C lcd(0x3F, 16, 2);

void setup() {
  // Inicjalizacja wyświetlacza
  lcd.init();
  lcd.backlight(); // Włącz podświetlenie

  // Wyświetlanie tekstu
  lcd.setCursor(0, 0); // Ustawienie kursora na początku pierwszej linii
  lcd.print("Hubert Jarosz");
  
  lcd.setCursor(0, 1); // Ustawienie kursora na początku drugiej linii
  lcd.print("Test wyswietlacz");
}

void loop() {
  // Nic więcej tutaj nie robimy
}
