function y = szybki_kwadrat(x)
    % SZYBKI_KWADRAT Oblicza kwadrat każdego elementu wektora x metodą tablicową.
    %
    % Funkcja SZYBKI_KWADRAT(x) oblicza f(x_i) = x_i^2 dla i = 1, 2, ..., N
    % bez użycia pętli, wykorzystując operacje tablicowe MATLAB-a.
    %
    % Wejście:
    %   x - wektor liczb
    %
    % Wyjście:
    %   y - wektor, gdzie y(i) = x(i)^2
    %
    % Przykład użycia:
    %   wynik = szybki_kwadrat([1, 2, 3, 4]);
    %   disp(wynik); % [1 4 9 16]

    y = x.^2; % Elementowe podnoszenie do kwadratu
end
