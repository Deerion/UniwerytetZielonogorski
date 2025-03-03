@echo off
:: Sprawdzenie, czy podano wystarczającą liczbę argumentów
if "%~1"=="" (
    echo Podaj dolny zakres przedziału.
    exit /b
)
if "%~2"=="" (
    echo Podaj górny zakres przedziału.
    exit /b 
)

:: Przypisanie argumentów do zmiennych
set "start=%~1"
set "end=%~2"

:: Sprawdzenie, czy dolny zakres jest mniejszy od górnego
if %start% gtr %end% (
    echo Dolny zakres musi być mniejszy lub równy górnemu.
    exit /b
)

:: Pętla wypisująca liczby z przedziału
for /l %%i in (%start%,1,%end%) do (
    echo %%i
)
