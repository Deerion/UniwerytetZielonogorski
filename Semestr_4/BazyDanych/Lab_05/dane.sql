-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 09, 2025 at 01:51 PM
-- Wersja serwera: 10.4.32-MariaDB
-- Wersja PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lab5`
--

--
-- Dumping data for table `miejscowosc`
--

INSERT INTO `miejscowosc` (`miejscowosc_id`, `miejscowosc`) VALUES
(1, 'Zielona Góra');

--
-- Dumping data for table `oceny`
--

INSERT INTO `oceny` (`ocena_id`, `ocena_koncowa`, `ocena_pierwsza`, `ocena_poprawiona`, `data_pierwszej`, `data_poprawionej`, `semestr_id`, `wykladowca_id`, `przedmiot_id`) VALUES
(1, NULL, NULL, NULL, NULL, NULL, 1, 1, 1);

--
-- Dumping data for table `przedmiot`
--

INSERT INTO `przedmiot` (`przedmiot_id`, `przedmiot`) VALUES
(1, 'Bazy Danych');

--
-- Dumping data for table `rok_akademicki`
--

INSERT INTO `rok_akademicki` (`rok_id`, `rok_akademicki`) VALUES
(1, '2024/2025');

--
-- Dumping data for table `semestr`
--

INSERT INTO `semestr` (`semestr_id`, `semestr`, `rok_id`) VALUES
(1, 'Letni', 1);

--
-- Dumping data for table `studenci`
--

INSERT INTO `studenci` (`stud_id`, `imie`, `nazwisko`, `kod_pocztowy`, `pesel`, `miejscowosc_id`, `wydzial_id`, `ocena_id`, `numer_indeksu`) VALUES
(1, 'Oliwer', 'Pawelski', '65-559', 34267509871, 1, 1, 1, 1);

--
-- Dumping data for table `wydzial`
--

INSERT INTO `wydzial` (`wydzial_id`, `wydzial`) VALUES
(1, 'WNiT');

--
-- Dumping data for table `wykladowca`
--

INSERT INTO `wykladowca` (`wykladowca_id`, `wykladowca`) VALUES
(1, 'Hubert Jarosz');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
