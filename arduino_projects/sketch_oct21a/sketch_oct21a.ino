#include <LiquidCrystal_I2C.h> // dolaczenie pobranej biblioteki I2C dla LCD

LiquidCrystal_I2C lcd(0x3F, 16, 3);  // Ustawienie adresu ukladu na 0x27
#define BACKLIGHT_PIN 3


void setup() 
{
lcd.begin(16, 3);
lcd.init();
lcd.backlight(); // Turn on the backlight (lcd.noBacklight() to turn off)

lcd.setCursor(0,0);
lcd.print("Hubert");
lcd.setCursor(0,1);
lcd.print("Jarosz");

}

void loop()
{
lcd.setCursor(10, 1);
lcd.print(millis()/10);
}