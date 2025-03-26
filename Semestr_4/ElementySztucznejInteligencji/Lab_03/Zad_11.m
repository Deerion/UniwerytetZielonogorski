% Skrypt: Zad_11.m
% Porównanie czasu działania funkcji wolny_kwadrat i szybki_kwadrat dla dużych wartości N.

% Definiujemy duży wektor losowych liczb
N = 1e6; % Milion elementów
x = rand(1, N); % Wektor losowych wartości od 0 do 1

% Pomiar czasu dla funkcji wolny_kwadrat (z pętlą)
tic;
y1 = wolny_kwadrat(x);
czas_wolny = toc;
fprintf('Czas działania wolny_kwadrat: %.6f sekund\n', czas_wolny);

% Pomiar czasu dla funkcji szybki_kwadrat (operacja tablicowa)
tic;
y2 = szybki_kwadrat(x);
czas_szybki = toc;
fprintf('Czas działania szybki_kwadrat: %.6f sekund\n', czas_szybki);

% Analiza wydajności za pomocą profile
profile on;
y1 = wolny_kwadrat(x);
y2 = szybki_kwadrat(x);
profile viewer; % Otwiera GUI do analizy wydajności
profile off;
