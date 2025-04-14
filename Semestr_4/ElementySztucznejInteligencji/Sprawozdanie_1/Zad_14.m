random_number = randi([-1000, 1000]);
if mod(random_number, 2) == 0
    disp('Liczba parzysta');
else
    disp('Liczba nieparzysta');
end
 disp(num2str(random_number));