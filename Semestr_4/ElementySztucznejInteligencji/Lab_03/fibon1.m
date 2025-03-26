function f = fibon1(n)
    % FIBON1 - Iteracyjne wyznaczanie ciągu Fibonacciego
    %
    % Wejście:
    %   n - liczba wyrazów ciągu (n >= 1)
    %
    % Wyjście:
    %   f - wektor zawierający n liczb Fibonacciego
    
    if n == 1
        f = 1;
        return;
    elseif n == 2
        f = [1; 1];
        return;
    end

    f = zeros(n, 1);  % Tworzymy pustą macierz kolumnową
    f(1) = 1; 
    f(2) = 1;
    for k = 3:n
        f(k) = f(k - 1) + f(k - 2); % Kolejne liczby Fibonacciego
    end
end
