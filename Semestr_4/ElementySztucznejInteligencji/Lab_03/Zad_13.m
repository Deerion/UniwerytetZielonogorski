% Skrypt: porownanie_m1_m2.m
% Porównanie czasu wykonania dwóch metod tablicowania sinusa

dokladnosci = [1e2, 1e3, 1e4, 1e5, 1e6]; % Różne dokładności
czasy_m1 = zeros(size(dokladnosci)); % Tablica na czasy dla m1
czasy_m2 = zeros(size(dokladnosci)); % Tablica na czasy dla m2

start = 0; 
stop = 2 * pi;

for idx = 1:length(dokladnosci)
    accuracy = dokladnosci(idx);

    % Skrypt m1 (z pętlą)
    tic;
    h = (stop - start) / accuracy;
    for i = 1:accuracy
        x(i) = (i - 1) * h;
        y(i) = sin(x(i));
    end
    czasy_m1(idx) = toc;

    % Skrypt m2 (wersja wektorowa)
    tic;
    x = linspace(start, stop, accuracy);
    y = sin(x);
    czasy_m2(idx) = toc;
end

% Rysowanie wykresu porównawczego
figure;
semilogx(dokladnosci, czasy_m1, '-o', 'LineWidth', 2, 'DisplayName', 'm1 (pętla)');
hold on;
semilogx(dokladnosci, czasy_m2, '-s', 'LineWidth', 2, 'DisplayName', 'm2 (wektorowa)');
xlabel('Dokładność (ilość punktów)');
ylabel('Czas wykonania (s)');
title('Porównanie czasu wykonania m1 i m2');
legend;
grid on;
