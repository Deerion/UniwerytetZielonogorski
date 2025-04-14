x = 4;  
y = 3;  
z = 2;

a = (x * y) - 2 * z;
disp(['Równanie a: ', num2str(a)])

b = 2 * z / y;
disp(['Równanie b: ', num2str(b)])

c = (2 * z / y) * x;
disp(['Równanie c: ', num2str(c)])

d = sqrt(abs(x - 1)) - nthroot(abs(y), 3);
disp(['Równanie d: ', num2str(d)])

e = atan(z) + exp(-(x + 3));
disp(['Równanie e: ', num2str(e)])

f = 3 + exp(y + 1) / abs(y - tan(z));
disp(['Równanie f: ', num2str(f)])

g = 1 + abs(y - x) + (y - x)^2 + abs(y - z)^3 / 3;
disp(['Równanie g: ', num2str(g)])
