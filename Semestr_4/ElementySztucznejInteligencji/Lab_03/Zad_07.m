% Skrypt do obliczania zer trójmianu kwadratowego
while true
    % Zapytanie użytkownika o współczynniki
    a = input('Podaj współczynnik a (a ≠ 0, aby kontynuować, a = 0 kończy program): ');
    
    % Sprawdzamy, czy użytkownik chce zakończyć
    if a == 0
        disp('Program zakończony.');
        break;
    end
    
    b = input('Podaj współczynnik b: ');
    c = input('Podaj współczynnik c: ');

    % Obliczanie wyróżnika (delta)
    delta_val = delta(a, b, c);

    % Sprawdzamy, czy istnieją rzeczywiste pierwiastki
    if delta_val > 0
        % Obliczanie pierwiastków
        x1 = (-b + sqrt(delta_val)) / (2 * a);
        x2 = (-b - sqrt(delta_val)) / (2 * a);
        disp(['Pierwiastki trójmianu to: x1 = ', num2str(x1), ' i x2 = ', num2str(x2)]);
    elseif delta_val == 0
        % Jeden pierwiastek (mnożony)
        x1 = -b / (2 * a);
        disp(['Pierwiastek trójmianu to: x1 = ', num2str(x1)]);
    else
        % Brak pierwiastków rzeczywistych
        disp('Brak pierwiastków rzeczywistych.');
    end
end

