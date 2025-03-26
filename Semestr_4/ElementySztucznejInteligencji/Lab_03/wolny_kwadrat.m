function y = wolny_kwadrat(x)
    % WOLNY_KWADRAT Oblicza kwadrat każdego elementu wektora x metodą element po elemencie.
    %
    % Funkcja WOLNY_KWADRAT(x) oblicza f(x_i) = x_i^2 dla i = 1, 2, ..., N.
    % Wynik zwracany jest jako wektor y o tej samej długości co x.
    %
    % Wejście:
    %   x - wektor liczb
    %
    % Wyjście:
    %   y - wektor, gdzie y(i) = x(i)^2
    %
    % Przykład użycia:
    %   wynik = wolny_kwadrat([1, 2, 3, 4]);
    %   disp(wynik); % [1 4 9 16]

    N = length(x); % Pobranie liczby elementów wektora
    y = zeros(1, N); % Inicjalizacja wektora wynikowego

    for i = 1:N
        y(i) = x(i)^2; % Obliczenie kwadratu każdego elementu
    end
end
