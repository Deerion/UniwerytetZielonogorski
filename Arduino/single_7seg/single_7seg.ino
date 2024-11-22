const int segG = 1; // Pin 1 Arduino podłączony do segmentu G
const int segF = 2; // Pin 2 Arduino podłączony do segmentu F
const int segE = 3; // Pin 3 Arduino podłączony do segmentu E
const int segD = 4; // Pin 4 Arduino podłączony do segmentu D
const int segC = 5; // Pin 5 Arduino podłączony do segmentu C
const int segB = 6; // Pin 6 Arduino podłączony do segmentu B
const int segA = 7; // Pin 7 Arduino podłączony do segmentu A

void setup() {
  pinMode(segA, OUTPUT);
  pinMode(segB, OUTPUT);
  pinMode(segC, OUTPUT);
  pinMode(segD, OUTPUT);
  pinMode(segE, OUTPUT);
  pinMode(segF, OUTPUT);
  pinMode(segG, OUTPUT);

  // Wyłącz wszystkie segmenty na początku (Wspólna anoda = 5V)
  digitalWrite(segA, HIGH);
  digitalWrite(segB, HIGH);
  digitalWrite(segC, HIGH);
  digitalWrite(segD, HIGH);
  digitalWrite(segE, HIGH);
  digitalWrite(segF, HIGH);
  digitalWrite(segG, HIGH);
}

void loop() {
  wyswietlanie(0);  // Wyświetl cyfrę 2
  delay(1000);      // Poczekaj 1 sekundę
  wyswietlanie(1);  // Wyświetl cyfrę 3
  delay(1000);      // Poczekaj 1 sekundę
  wyswietlanie(2);  // Wyświetl cyfrę 2
  delay(1000);      // Poczekaj 1 sekundę
  wyswietlanie(3);  // Wyświetl cyfrę 3
  delay(1000);      // Poczekaj 1 sekundę
  wyswietlanie(4);  // Wyświetl cyfrę 2
  delay(1000);      // Poczekaj 1 sekundę
  wyswietlanie(5);  // Wyświetl cyfrę 3
  delay(1000);      // Poczekaj 1 sekundę
  wyswietlanie(6);  // Wyświetl cyfrę 2
  delay(1000);      // Poczekaj 1 sekundę
  wyswietlanie(7);  // Wyświetl cyfrę 3
  delay(1000);      // Poczekaj 1 sekundę
  wyswietlanie(8);  // Wyświetl cyfrę 2
  delay(1000);      // Poczekaj 1 sekundę
  wyswietlanie(9);  // Wyświetl cyfrę 3
  delay(1000);      // Poczekaj 1 sekundę
}

void wyswietlanie(int liczba){
  // Wyłącz wszystkie segmenty przed wyświetleniem nowej cyfry
  digitalWrite(segA, HIGH);
  digitalWrite(segB, HIGH);
  digitalWrite(segC, HIGH);
  digitalWrite(segD, HIGH);
  digitalWrite(segE, HIGH);
  digitalWrite(segF, HIGH);
  digitalWrite(segG, HIGH);

  // Ustawienie segmentów dla wyświetlanej cyfry
  switch (liczba){
    case 0:
       // Wszystkie segmenty z wyjątkiem G
       digitalWrite(segG, LOW);
       break;
    case 1:
       // Tylko segmenty B i C
       digitalWrite(segA, LOW);
       digitalWrite(segD, LOW);
       digitalWrite(segE, LOW);
       digitalWrite(segF, LOW);
       digitalWrite(segG, LOW);
       break;
    case 2:
       // Segmenty A, B, D, E, G
       digitalWrite(segC, LOW);
       digitalWrite(segF, LOW);
       break;
    case 3:
       // Segmenty A, B, C, D, G
       digitalWrite(segE, LOW);
       digitalWrite(segF, LOW);
       break;
    case 4:
       // Segmenty B, C, F, G
       digitalWrite(segA, LOW);
       digitalWrite(segD, LOW);
       digitalWrite(segE, LOW);
       break;
    case 5:
       // Segmenty A, C, D, F, G
       digitalWrite(segB, LOW);
       digitalWrite(segE, LOW);
       break;
    case 6:
       // Segmenty A, C, D, E, F, G
       digitalWrite(segB, LOW);
       break;
    case 7:
       // Segmenty A, B, C
       digitalWrite(segD, LOW);
       digitalWrite(segE, LOW);
       digitalWrite(segF, LOW);
       digitalWrite(segG, LOW);
       break;
    case 8:
       // Wszystkie segmenty
       break;
    case 9:
       // Segmenty A, B, C, D, F, G
       digitalWrite(segE, LOW);
       break;
  }
}
