clear;

wiersze = input('Podaj liczbę wierszy: ');
kolumny = input('Podaj liczbę kolumn: ');

wiersze = floor(wiersze);
kolumny = floor(kolumny);

M = randi([-100, 100], wiersze, kolumny);
disp('Wygenerowana macierz:');
disp(M);

min_wymiar = floor(min([wiersze, kolumny]));  
suma_przekatnej = sum(diag(M(1:min_wymiar, 1:min_wymiar)));
disp(['Suma elementów na przekątnej: ', num2str(suma_przekatnej)]);

suma_wierszy = sum(M, 2);
disp('Suma elementów wierszy:');
disp(suma_wierszy);

suma_kolumn = sum(M, 1);
disp('Suma elementów kolumn:');
disp(suma_kolumn);

min_el = min(M(:));
max_el = max(M(:));
disp(['Minimalny element macierzy: ', num2str(min_el)]);
disp(['Maksymalny element macierzy: ', num2str(max_el)]);
