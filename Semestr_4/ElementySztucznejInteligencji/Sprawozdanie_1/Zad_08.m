A = [1 2 3; -4 -5 -6; 7 8 9];  % macierz A
disp('Początkowa macierz A:');
disp(A);

% a) sumy
suma_wierszy = sum(A, 2);
disp('Suma po każdym wierszu:');
disp(suma_wierszy);

suma_kolumn = sum(A, 1);
disp('Suma po każdej kolumnie:');
disp(suma_kolumn);

przekatna1 = sum(diag(A));  % suma pierwszej przekątnej
disp('Suma pierwszej przekątnej:');
disp(przekatna1);

przekatna2 = sum(diag(flipud(A)));  % suma drugiej przekątnej
disp('Suma drugiej przekątnej:');
disp(przekatna2);

% b) macierz B o wartościach pseudolosowych
B = randi([-10, 10], 3, 3);
disp('Macierz B o wartościach pseudolosowych:');
disp(B);

% c) najmniejsza wartość z macierzy B
min_B = min(B(:));
disp('Najmniejsza wartość z macierzy B:');
disp(min_B);

% d) działania na macierzach
suma_macierzy = A + B;
disp('Suma macierzy A i B:');
disp(suma_macierzy);

roznica_macierzy = A - B;
disp('Różnica macierzy A i B:');
disp(roznica_macierzy);

mnozenie_macierzy = A .* B;
disp('Mnożenie macierzy A i B (element po elemencie):');
disp(mnozenie_macierzy);

% e) usuwanie wiersza i kolumny
A(1, :) = [];
disp('Macierz A po usunięciu pierwszego wiersza:');
disp(A);

B(:, 2) = [];
disp('Macierz B po usunięciu drugiej kolumny:');
disp(B);

% f) obrót macierzy o 90 stopni
A_rot = rot90(A);
disp('Macierz A po obrocie o 90 stopni:');
disp(A_rot);

B_rot = rot90(B);
disp('Macierz B po obrocie o 90 stopni:');
disp(B_rot);
