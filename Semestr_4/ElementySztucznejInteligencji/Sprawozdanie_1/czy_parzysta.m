function wynik = czy_parzysta(x)
    % Sprawdza, czy liczba x jest parzysta
    if mod(x, 2) == 0
        wynik = true;
    else
        wynik = false;
    end
end
