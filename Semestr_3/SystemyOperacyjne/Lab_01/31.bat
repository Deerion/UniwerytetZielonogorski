@echo off
setlocal enabledelayedexpansion

REM Sprawdzenie, czy zostały podane wszystkie trzy parametry
if "%~1"=="" (
    echo Blad: Nie podano pierwszej liczby.
    exit /b
)
if "%~2"=="" (
    echo Blad: Nie podano operatora.
    exit /b
)
if "%~3"=="" (
    echo Blad: Nie podano drugiej liczby.
    exit /b
)

REM Pobieranie argumentow
set liczba1=%~1
set operator=%~2
set liczba2=%~3

REM Sprawdzanie poprawności operatora
if not "!operator!"=="+" if not "!operator!"=="-" if not "!operator!"=="*" if not "!operator!"=="/" (
    echo Blad: Nieprawidlowy operator. Dozwolone operatory to +, -, *, /.
    exit /b
)

REM Sprawdzanie dzielenia przez zero
if "!operator!"=="/" if "!liczba2!"=="0" (
    echo Blad: Nie mozna dzielic przez zero!
    exit /b
)

REM Wykonywanie operacji
set /a wynik=liczba1%operator%liczba2
echo Wynik: !liczba1! !operator! !liczba2! = !wynik!

pause
