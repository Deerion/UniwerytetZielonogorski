n = 5;  
suma = 0;

for i = 1:2:(2*n - 1) 
    suma = suma + i;
end

disp(['Suma ', num2str(n), ' początkowych liczb nieparzystych to: ', num2str(suma)]);
