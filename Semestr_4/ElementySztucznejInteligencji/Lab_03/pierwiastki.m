function [x1, x2] = pierwiastki(a, b, c)
    % PIERWIASTKI Wyznacza pierwiastki trójmianu kwadratowego y = ax^2 + bx + c.
    % Funkcja PIERWIASTKI(a, b, c) wykorzystuje wzór kwadratowy:
    %     x1,2 = (-b ± sqrt(Δ)) / (2a)
    % gdzie Δ = delta(a, b, c).
    %
    % Przyklad:
    %     pierwiastki(1, -3, 2) = [2, 1]
    %
    % Wejście:
    %     a - współczynnik przy x^2
    %     b - współczynnik przy x
    %     c - wyraz wolny
    %
    % Wyjście:
    %     x1, x2 - pierwiastki trójmianu kwadratowego

    % Obliczanie wyróżnika (Δ)
    delta_val = delta(a, b, c);
    
    % Jeśli wyróżnik jest mniejszy od 0, pierwiastki są zespolone
    if delta_val < 0
        real_part = -b / (2*a);
        imag_part = sqrt(abs(delta_val)) / (2*a);
        x1 = real_part + imag_part * 1i;
        x2 = real_part - imag_part * 1i;
    else
        % Obliczanie pierwiastków w przypadku, gdy wyróżnik jest >= 0
        sqrt_delta = sqrt(delta_val);
        x1 = (-b + sqrt_delta) / (2*a);
        x2 = (-b - sqrt_delta) / (2*a);
    end
end