@echo off
setlocal enabledelayedexpansion

REM Losowanie liczby z zakresu od 0 do 100
set /a liczba_do_zgadniecia=%random% %% 101
set /a proby=6

echo Witaj w grze zgadywanka!
echo Komputer wylosowal liczbe calkowita z zakresu od 0 do 100.
echo Masz 6 prob, aby ja zgadnac.

:zgadywanie
REM zgadywanie
set /p zgadnieta_liczba="Podaj swoja liczbe: "

if !zgadnieta_liczba! lss !liczba_do_zgadniecia! (
    echo Za malo! Sprobuj ponownie.
) else if %zgadnieta_liczba% gtr %liczba_do_zgadniecia% (
    echo Za duzo! Sprobuj ponownie.
) else (
    echo Gratulacje! Zgadles liczbe %liczba_do_zgadniecia%!
    exit /b
)

set /a proby-=1
if !proby! gtr 0 (
    echo Zostalo prob: !proby!
    goto zgadywanie
)

echo Niestety, nie zgadles. Wylosowana liczba to !liczba_do_zgadniecia!.

