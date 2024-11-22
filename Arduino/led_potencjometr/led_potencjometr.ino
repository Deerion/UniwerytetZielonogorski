int ledPin1 = 9;  // Pin dla diody LED 1
int ledPin2 = 10; // Pin dla diody LED 2
int ledPin3 = 11; // Pin dla diody LED 3

int potPin = A0;  // Pin dla potencjometru

void setup() {
  pinMode(ledPin1, OUTPUT);  // Ustawienie pinów LED jako wyjścia
  pinMode(ledPin2, OUTPUT);
  pinMode(ledPin3, OUTPUT);

  // Rozpoczynamy komunikację szeregową, ustawiamy prędkość transmisji na 9600 bps
  Serial.begin(9600);
}

void loop() {
  int potValue = analogRead(potPin);  // Odczyt wartości z potencjometru (0-1023)

  // Przekształcenie odczytu (0-1023) na zakres PWM (0-255)
  int brightness = map(potValue, 0, 1023, 0, 255);

  // Ustawianie jasności diod LED
  analogWrite(ledPin1, brightness);  // LED 1
  analogWrite(ledPin2, brightness);  // LED 2
  analogWrite(ledPin3, brightness);  // LED 3

  // Wyświetlanie wartości potencjometru w Serial Monitorze
  Serial.print("Potencjometr: ");  
  Serial.print(potValue);  // Wyświetlenie odczytanej wartości z potencjometru
  Serial.print(" | Jasność LED: ");
  Serial.println(brightness);  // Wyświetlenie wartości jasności (0-255)

  delay(100);  // Krótkie opóźnienie (100ms), aby dane były wyświetlane płynnie
}
