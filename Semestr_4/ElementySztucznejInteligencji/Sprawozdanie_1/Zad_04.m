X = rand(1, 10); % wektor X
Y = rand(1, 10); % wektor Y
Z = rand(1, 10); % wektor Z

% a) zapisz wektor X do pliku
save('wektorX.mat', 'X');
disp(['Wektor X = ', mat2str(X)]);

% b) zapisz sumę wektorów Y i Z do pliku
YZ = Y + Z;
save wektorYZ YZ
disp(['Wektor YZ = ', mat2str(YZ)]);

% c) wyczyść przestrzeń roboczą
clear X Y Z;

% d) wczytaj wektor X z pliku
load('wektorX.mat');
disp(X);