m = 4; % liczba wierszy
n = 5; % liczba kolumn

A = zeros(m, n);

[rows, cols] = size(A);

% Obliczanie wartości dla każdego elementu macierzy
for i = 1:rows
    for j = 1:cols
        A(i, j) = (i + j) / (2 * i);
    end
end

% Wyświetlenie wyniku
disp('Macierz A:');
disp(A);