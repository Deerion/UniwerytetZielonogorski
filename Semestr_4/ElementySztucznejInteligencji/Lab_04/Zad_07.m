[x, y] = meshgrid(-2:0.1:2, -2:0.1:2);
z1 = x.^2 + y + 2;

figure;
surf(x, y, z1);
title('z(x, y) = x^2 + y + 2');
xlabel('x');
ylabel('y');
zlabel('z');
colorbar;
grid on;
