n = 1:50; % Zwiększamy zakres do 15, aby lepiej zobaczyć wzrost funkcji
figure;
hold on;
plot(n, ones(size(n)), 'k', 'LineWidth', 1.5, 'DisplayName', 'O(1)');
plot(n, log2(n), 'r', 'LineWidth', 1.5, 'DisplayName', 'O(log n)');
plot(n, n, 'g', 'LineWidth', 1.5, 'DisplayName', 'O(n)');
plot(n, n .* log2(n), 'b', 'LineWidth', 1.5, 'DisplayName', 'O(n log n)');
plot(n, n.^2, 'c', 'LineWidth', 1.5, 'DisplayName', 'O(n^2)');
plot(n, n.^3, 'm', 'LineWidth', 1.5, 'DisplayName', 'O(n^3)');
plot(n, 2.^n, 'y', 'LineWidth', 1.5, 'DisplayName', 'O(2^n)');
plot(n, arrayfun(@factorial, n), 'k--', 'LineWidth', 1.5, 'DisplayName', 'O(n!)');

set(gca, 'YScale', 'log'); % Ustawienie skali logarytmicznej na osi Y
legend('Location', 'northwest'); % Umiejscowienie legendy
title('Porównanie różnych złożoności obliczeniowych');
xlabel('n');
ylabel('Wartość funkcji (skala log)');
grid on;
hold off;
