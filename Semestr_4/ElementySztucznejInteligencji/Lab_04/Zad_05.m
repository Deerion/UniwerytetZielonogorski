t = linspace(-2*pi, 2*pi, 200);
figure;
subplot(3,1,1);
polarplot(t, sin(t), 'b');
title('y(t) = sin(t)');

subplot(3,1,2);
polarplot(t, sin(2*t), 'r--');
title('y(t) = sin(2t)');

subplot(3,1,3);
polarplot(t, sin(2*t) .* cos(2*t), 'g:');
title('y(t) = sin(2t) cos(2t)');
