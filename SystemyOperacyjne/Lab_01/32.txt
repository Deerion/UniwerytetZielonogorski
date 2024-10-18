@echo off
setlocal enabledelayedexpansion

REM Pobieranie nazwy aplikacji od użytkownika
set /p aplikacja="Podaj nazwe aplikacji do uruchomienia (np. notepad, calc): "

REM Uruchamianie aplikacji
start /wait %aplikacja%

REM Pobieranie kodu wyjścia aplikacji
set exitCode=%ERRORLEVEL%

REM Wyświetlenie statusu wyjścia
echo Aplikacja zwrocila kod wyjscia: %exitCode%

pause
