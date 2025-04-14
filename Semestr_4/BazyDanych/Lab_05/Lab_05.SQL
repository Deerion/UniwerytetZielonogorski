/*
Created: 9.04.2025
Modified: 9.04.2025
Model: MySQL 8.0
Database: MySQL 8.0
*/

-- Create tables section -------------------------------------------------

-- Table Studenci

CREATE TABLE `Studenci`
(
  `stud_id` Int NOT NULL,
  `imie` Varchar(20) NOT NULL,
  `nazwisko` Varchar(20) NOT NULL,
  `kod_pocztowy` Varchar(6) NOT NULL,
  `pesel` Decimal(11,0) NOT NULL,
  `miejscowosc_id` Int NOT NULL,
  `wydzial_id` Int NOT NULL,
  `ocena_id` Int NOT NULL,
  `numer_indeksu` Int NOT NULL
)
;

CREATE INDEX `IX_Relationship3` ON `Studenci` (`miejscowosc_id`)
;

CREATE INDEX `IX_Relationship4` ON `Studenci` (`wydzial_id`)
;

ALTER TABLE `Studenci` ADD PRIMARY KEY (`stud_id`)
;

ALTER TABLE `Studenci` ADD UNIQUE `pesel` (`pesel`)
;

ALTER TABLE `Studenci` ADD UNIQUE `numer_indeksu` (`numer_indeksu`)
;

-- Table Oceny

CREATE TABLE `Oceny`
(
  `ocena_id` Int NOT NULL,
  `ocena_koncowa` Float,
  `ocena_pierwsza` Float,
  `ocena_poprawiona` Float,
  `data_pierwszej` Date,
  `data_poprawionej` Date,
  `semestr_id` Int NOT NULL,
  `wykladowca_id` Int NOT NULL,
  `przedmiot_id` Int NOT NULL,
  `stud_id` Int
)
;

CREATE INDEX `IX_Relationship6` ON `Oceny` (`wykladowca_id`)
;

CREATE INDEX `IX_Relationship7` ON `Oceny` (`przedmiot_id`)
;

CREATE INDEX `IX_Relationship9` ON `Oceny` (`semestr_id`)
;

CREATE INDEX `IX_Relationship12` ON `Oceny` (`stud_id`)
;

ALTER TABLE `Oceny` ADD PRIMARY KEY (`ocena_id`)
;

-- Table Miejscowosc

CREATE TABLE `Miejscowosc`
(
  `miejscowosc_id` Int NOT NULL,
  `miejscowosc` Varchar(40) NOT NULL
)
;

ALTER TABLE `Miejscowosc` ADD PRIMARY KEY (`miejscowosc_id`)
;

ALTER TABLE `Miejscowosc` ADD UNIQUE `miejscowosc` (`miejscowosc`)
;

-- Table Wydzial

CREATE TABLE `Wydzial`
(
  `wydzial_id` Int NOT NULL,
  `wydzial` Varchar(50) NOT NULL
)
;

ALTER TABLE `Wydzial` ADD PRIMARY KEY (`wydzial_id`)
;

ALTER TABLE `Wydzial` ADD UNIQUE `wydzial` (`wydzial`)
;

-- Table Wykladowca

CREATE TABLE `Wykladowca`
(
  `wykladowca_id` Int NOT NULL,
  `wykladowca` Varchar(50) NOT NULL
)
;

ALTER TABLE `Wykladowca` ADD PRIMARY KEY (`wykladowca_id`)
;

-- Table Przedmiot

CREATE TABLE `Przedmiot`
(
  `przedmiot_id` Int NOT NULL,
  `przedmiot` Varchar(40) NOT NULL
)
;

ALTER TABLE `Przedmiot` ADD PRIMARY KEY (`przedmiot_id`)
;

ALTER TABLE `Przedmiot` ADD UNIQUE `przedmiot` (`przedmiot`)
;

-- Table Rok_akademicki

CREATE TABLE `Rok_akademicki`
(
  `rok_id` Int NOT NULL,
  `rok_akademicki` Varchar(11) NOT NULL
)
;

ALTER TABLE `Rok_akademicki` ADD PRIMARY KEY (`rok_id`)
;

ALTER TABLE `Rok_akademicki` ADD UNIQUE `rok_akademicki` (`rok_akademicki`)
;

-- Table Semestr

CREATE TABLE `Semestr`
(
  `semestr_id` Int NOT NULL,
  `semestr` Enum('Letni', 'Zimowy') NOT NULL,
  `rok_id` Int NOT NULL
)
;

CREATE INDEX `IX_Relationship10` ON `Semestr` (`rok_id`)
;

ALTER TABLE `Semestr` ADD PRIMARY KEY (`semestr_id`)
;

ALTER TABLE `Semestr` ADD UNIQUE `semestr` (`semestr`)
;

-- Create foreign keys (relationships) section -------------------------------------------------

ALTER TABLE `Studenci` ADD CONSTRAINT `Relationship3` FOREIGN KEY (`miejscowosc_id`) REFERENCES `Miejscowosc` (`miejscowosc_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Studenci` ADD CONSTRAINT `Relationship4` FOREIGN KEY (`wydzial_id`) REFERENCES `Wydzial` (`wydzial_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Oceny` ADD CONSTRAINT `Relationship6` FOREIGN KEY (`wykladowca_id`) REFERENCES `Wykladowca` (`wykladowca_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Oceny` ADD CONSTRAINT `Relationship7` FOREIGN KEY (`przedmiot_id`) REFERENCES `Przedmiot` (`przedmiot_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Oceny` ADD CONSTRAINT `Relationship9` FOREIGN KEY (`semestr_id`) REFERENCES `Semestr` (`semestr_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Semestr` ADD CONSTRAINT `Relationship10` FOREIGN KEY (`rok_id`) REFERENCES `Rok_akademicki` (`rok_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Oceny` ADD CONSTRAINT `Relationship12` FOREIGN KEY (`stud_id`) REFERENCES `Studenci` (`stud_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

