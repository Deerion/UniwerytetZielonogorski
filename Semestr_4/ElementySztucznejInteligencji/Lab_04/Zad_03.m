x3 = 0:0.1:10;
y3_1 = x3.^2 - 2*x3;
y3_2 = 5 * sin(x3);

figure;
plot(x3, y3_1, 'g', 'LineWidth', 1.5);
hold on;
plot(x3, y3_2, 'm', 'LineWidth', 1.5);
hold off;
title('Wykresy funkcji f(x) = x^2 - 2x oraz f(x) = 5sin(x)');
xlabel('x');
ylabel('y');
legend('x^2 - 2x', '5sin(x)');
grid on;
