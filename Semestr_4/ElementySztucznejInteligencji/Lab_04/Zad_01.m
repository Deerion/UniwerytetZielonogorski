x1 = -5:0.1:5;
y1 = x1.^2 - 4;
figure;
plot(x1, y1);
title('y = x^2 - 4');
xlabel('x');
ylabel('y');
grid on;

x2 = linspace(-2*pi, 2*pi, 100);

figure;
plot(x2, cos(x2));
title('y = cos(x)');
xlabel('x');
ylabel('y');
grid on;

figure;
plot(x2, sin(x2));
title('y = sin(x)');
xlabel('x');
ylabel('y');
grid on;

figure;
plot(x2, tan(x2));
title('y = tan(x)');
xlabel('x');
ylabel('y');
grid on;
ylim([-10 10]); % ograniczenie zakresu dla tan(x)
