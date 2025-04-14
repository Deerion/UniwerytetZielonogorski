A = [1 2 3; 4 5 6; 7 8 9];

% a) drugi wiersz
second_row = A(2, :);
disp(second_row);

% b) trzecia kolumna
third_column = A(:, 3);
disp(third_column);

% c) pierwszy wiersz i czwórta kolumna
B = [A(1, :)  A(:, 4)'];
disp(B);
