/*
Created: 2.04.2025
Modified: 2.04.2025
Model: MySQL 8.0
Database: MySQL 8.0
*/

-- Create tables section -------------------------------------------------

-- Table osoby_1

CREATE TABLE `osoby_1`
(
  `osoba_id` Int NOT NULL,
  `imie` Varchar(30) NOT NULL,
  `nazwisko` Varchar(30) NOT NULL
)
;

ALTER TABLE `osoby_1` ADD PRIMARY KEY (`osoba_id`)
;

-- Table ksiazki_1

CREATE TABLE `ksiazki_1`
(
  `ksiazka_id` Int NOT NULL,
  `osoba_id` Int NOT NULL,
  `tytul` Varchar(100) NOT NULL
)
;

CREATE INDEX `IX_Relationship4` ON `ksiazki_1` (`osoba_id`)
;

ALTER TABLE `ksiazki_1` ADD PRIMARY KEY (`ksiazka_id`)
;

-- Table osoby_2

CREATE TABLE `osoby_2`
(
  `osoba_id` Int NOT NULL,
  `imie` Varchar(30) NOT NULL,
  `nazwisko` Varchar(30) NOT NULL
)
;

ALTER TABLE `osoby_2` ADD PRIMARY KEY (`osoba_id`)
;

-- Table ksiazki_2

CREATE TABLE `ksiazki_2`
(
  `ksiazka_id` Int NOT NULL,
  `osoba_id` Int NOT NULL,
  `tytul` Varchar(100) NOT NULL
)
;

ALTER TABLE `ksiazki_2` ADD PRIMARY KEY (`ksiazka_id`, `osoba_id`)
;

-- Table abonenci

CREATE TABLE `abonenci`
(
  `abonent_id` Int NOT NULL,
  `imie` Varchar(30) NOT NULL,
  `nazwisko` Varchar(30) NOT NULL
)
;

ALTER TABLE `abonenci` ADD PRIMARY KEY (`abonent_id`)
;

-- Table telefony

CREATE TABLE `telefony`
(
  `telefon_id` Int NOT NULL,
  `abonent_id` Int NOT NULL,
  `telefon` Decimal(13,0) NOT NULL
)
;

ALTER TABLE `telefony` ADD PRIMARY KEY (`telefon_id`, `abonent_id`)
;

-- Create foreign keys (relationships) section -------------------------------------------------

ALTER TABLE `ksiazki_1` ADD CONSTRAINT `osoby_ksiazki_FK` FOREIGN KEY (`osoba_id`) REFERENCES `osoby_1` (`osoba_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `ksiazki_2` ADD CONSTRAINT `osoby_ksiazki_FK` FOREIGN KEY (`osoba_id`) REFERENCES `osoby_2` (`osoba_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `telefony` ADD CONSTRAINT `Abonenci_Telefont_FK` FOREIGN KEY (`abonent_id`) REFERENCES `abonenci` (`abonent_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

