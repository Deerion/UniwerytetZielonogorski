@echo off
setlocal enabledelayedexpansion

REM Pobieranie pierwszej liczby
set /p liczba1="Podaj pierwsza liczbe: "

REM Pobieranie operatora
:operator
set /p operator="Podaj operator (+, -, *, /): "

REM Sprawdzanie poprawności operatora
if not "!operator!"=="+" if not "!operator!"=="-" if not "!operator!"=="*" if not "!operator!"=="/" (
    echo Nieprawidlowy operator. Sprobuj ponownie.
    goto operator
)

REM Pobieranie drugiej liczby
set /p liczba2="Podaj druga liczbe: "

REM Sprawdzanie dzielenia przez zero
if "!operator!"=="/" if "!liczba2!"=="0" (
    echo Blad: Nie mozna dzielic przez zero!
    goto operator
)

REM Wykonywanie operacji
set /a wynik=liczba1%operator%liczba2
echo Wynik: !liczba1! !operator! !liczba2! = !wynik!

pause
