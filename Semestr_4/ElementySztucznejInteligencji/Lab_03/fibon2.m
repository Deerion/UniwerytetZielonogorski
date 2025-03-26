function f = fibon2(n)
    % FIBON2 - Rekurencyjne wyznaczanie liczby Fibonacciego
    %
    % Wejście:
    %   n - numer wyrazu (n >= 1)
    %
    % Wyjście:
    %   f - n-ta liczba Fibonacciego

    if n <= 1
        f = 1;
    else
        f = fibon2(n - 1) + fibon2(n - 2);
    end
end
