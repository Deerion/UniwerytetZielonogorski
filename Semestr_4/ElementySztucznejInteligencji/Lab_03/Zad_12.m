% Skrypt: porownanie_fibon.m
% Porównanie czasu działania funkcji fibon1 i fibon2 dla dużych N

N = 30; % Liczba wyrazów ciągu do testowania

% Pomiar czasu dla funkcji iteracyjnej (fibon1)
tic;
F1 = fibon1(N);
czas_fibon1 = toc;
fprintf('Czas działania fibon1(%d) = %.6f sekund\n', N, czas_fibon1);

% Pomiar czasu dla funkcji rekurencyjnej (fibon2)
tic;
F2 = fibon2(N);
czas_fibon2 = toc;
fprintf('Czas działania fibon2(%d) = %.6f sekund\n', N, czas_fibon2);

% Analiza wydajności za pomocą profile
profile on;
F1 = fibon1(N);
F2 = fibon2(N);
profile viewer; % Otwiera GUI do analizy wydajności
profile off;
