x = -10:0.1:10;
y1 = x.^3;
y2 = x.^2;
plot(x, y1, x, y2);
title('Wykresy dwóch wielomianów');
legend('x^3', 'x^2');
