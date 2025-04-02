% Zadanie 3
x = 5;
y = 3;
z = 2;

a = (x * y) - 2*z;
b = 2*z / y;
c = (2*z / y) * x;
d = sqrt(abs(x - 1)) - nthroot(abs(y), 3);
e = atan(z) + exp(-(x + 3));
f = (3 + exp(y + 1)) / abs(y - tan(z));
g = 1 + abs(y - x) + (y-x)/2 + abs(y - z)/3;

disp([a, b, c, d, e, f, g]);
