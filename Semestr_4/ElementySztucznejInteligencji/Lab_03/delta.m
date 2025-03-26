function delta = delta(a, b, c)
    % DELTA Wyznacza wyróżnik ∆ trójmianu kwadratowego y = ax^2 + bx + c.
    % Funkcja DELTA(a, b, c) wykonuje dzialanie: ∆ = b^2 - 4ac.
    % 
    % Przyklad:
    %     delta(1, -3, 2) = 1
    %
    % Wejście:
    %     a - współczynnik przy x^2
    %     b - współczynnik przy x
    %     c - wyraz wolny
    %
    % Wyjście:
    %     delta - wartość wyróżnika ∆ trójmianu
    delta = b^2 - 4*a*c;
end
