function A = przeksztalc_macierz(A)
    % PRZEKSZTALC_MACIERZ Przekształca macierz A, przypisując każdemu elementowi
    % wartość a_{i,j} = (i + j) / (2 * i), gdzie i to indeks wiersza, a j to indeks kolumny.

    [m, n] = size(A); % Pobranie rozmiaru macierzy A (m - liczba wierszy, n - liczba kolumn)
    
    for i = 1:m
        for j = 1:n
            A(i,j) = (i + j) / (2 * i); % Przypisanie wartości zgodnie ze wzorem
        end
    end
end
