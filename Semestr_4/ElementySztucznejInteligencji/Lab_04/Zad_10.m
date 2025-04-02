k = 5;
n = 2^k-1;
theta = pi*(-n:2:n)/n;
phi = (pi/2)*(-n:2:n)'/n;
X = cos(phi)*cos(theta);
Y = cos(phi)*sin(theta);
Z = sin(phi)*ones(size(theta));
C = hadamard(2^k);

figure;
surf(X,Y,Z,C);
colormap([0 0 0;1 1 1]);
axis square;
title('Macierz Hadamarda na powierzchni');
