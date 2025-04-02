phi = linspace(0, 2*pi, 200);
a = 2;
b = 0.5;
r = a*cos(phi) + b;

figure;
polarplot(phi, r);
title('Ślimak Pascala');
