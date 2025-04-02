t1 = 0:0.1:8;
t2 = 0:0.1:80;
t3 = 0:0.1:30;
alpha = 0.055;

figure;
subplot(3,1,1);
plot(t1, 1 - 2*exp(-t1).*sin(t1));
title('y(t) = 1 - 2e^{-t} sin(t)');

subplot(3,1,2);
plot(t2, exp(-alpha*t2).*sin(t2.^2));
title('y(t) = e^{-αt} sin(t^2)');

subplot(3,1,3);
plot(t3, 5*exp(-0.2*t3).*cos(0.9*t3 - pi/6) + 0.8*exp(-2*t3));
title('y(t) = 5e^{-0.2t} cos(0.9t - π/6) + 0.8e^{-2t}');
