C = randi([-10, 10], 5, 10);  % macierz C 5x10
disp('Macierz początkowa:');
disp(C);

% a) odwrócenie kolejności kolumn
C = fliplr(C);
disp('Macierz po odwróceniu kolejności kolumn:');
disp(C);

% b) zamiana wiersza pierwszego z trzecim
C([1, 3], :) = C([3, 1], :);
disp('Macierz po zamianie pierwszego i trzeciego wiersza:');
disp(C);

% c) zamiana kolumn
C(:, [2, 4]) = C(:, [4, 2]);
C(:, [6, 8]) = C(:, [8, 6]);
C(:, [10, 1]) = C(:, [1, 10]);
disp('Macierz po zamianie kolumn:');
disp(C);

% d) usunięcie kolumn 5, 6 i 9
C(:, [5, 6, 9]) = [];
disp('Macierz po usunięciu kolumn 5, 6 i 9:');
disp(C);
