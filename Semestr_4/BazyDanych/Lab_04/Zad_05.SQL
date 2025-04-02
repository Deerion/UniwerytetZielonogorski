/*
Created: 2.04.2025
Modified: 2.04.2025
Model: MySQL 8.0
Database: MySQL 8.0
*/

-- Create tables section -------------------------------------------------

-- Table studenci

CREATE TABLE `studenci`
(
  `stud_id` Int NOT NULL,
  `imei` Varchar(30) NOT NULL,
  `nazwisko` Varchar(30) NOT NULL,
  `num_indeksu` Int NOT NULL
)
;

ALTER TABLE `studenci` ADD PRIMARY KEY (`stud_id`)
;

-- Table oceny

CREATE TABLE `oceny`
(
  `stud_id` Int NOT NULL,
  `przedmiot_id` Int NOT NULL,
  `ocena` Varchar(10) NOT NULL
)
;

ALTER TABLE `oceny` ADD PRIMARY KEY (`stud_id`, `przedmiot_id`)
;

-- Table przedmioty

CREATE TABLE `przedmioty`
(
  `przedmiot_id` Int NOT NULL,
  `nazwa` Varchar(20) NOT NULL
)
;

ALTER TABLE `przedmioty` ADD PRIMARY KEY (`przedmiot_id`)
;

-- Table oceny1

CREATE TABLE `oceny1`
(
  `stud_id` Int NOT NULL,
  `przedmiot_id` Int NOT NULL,
  `ocena` Varchar(10) NOT NULL,
  `ocena_id` Int NOT NULL
)
;

CREATE INDEX `IX_Relationship9` ON `oceny1` (`stud_id`)
;

CREATE INDEX `IX_Relationship10` ON `oceny1` (`przedmiot_id`)
;

ALTER TABLE `oceny1` ADD PRIMARY KEY (`ocena_id`)
;

ALTER TABLE `oceny1` ADD UNIQUE `przedmiot_id` (`przedmiot_id`)
;

ALTER TABLE `oceny1` ADD UNIQUE `stud_id` (`stud_id`)
;

-- Table studenci1

CREATE TABLE `studenci1`
(
  `stud_id` Int NOT NULL,
  `imei` Varchar(30) NOT NULL,
  `nazwisko` Varchar(30) NOT NULL,
  `num_indeksu` Int NOT NULL
)
;

ALTER TABLE `studenci1` ADD PRIMARY KEY (`stud_id`)
;

-- Table przedmioty1

CREATE TABLE `przedmioty1`
(
  `przedmiot_id` Int NOT NULL,
  `nazwa` Varchar(20) NOT NULL
)
;

ALTER TABLE `przedmioty1` ADD PRIMARY KEY (`przedmiot_id`)
;

-- Create foreign keys (relationships) section -------------------------------------------------

ALTER TABLE `oceny` ADD CONSTRAINT `Relationship7` FOREIGN KEY (`stud_id`) REFERENCES `studenci` (`stud_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `oceny` ADD CONSTRAINT `Relationship8` FOREIGN KEY (`przedmiot_id`) REFERENCES `przedmioty` (`przedmiot_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `oceny1` ADD CONSTRAINT `Relationship9` FOREIGN KEY (`stud_id`) REFERENCES `studenci1` (`stud_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `oceny1` ADD CONSTRAINT `Relationship10` FOREIGN KEY (`przedmiot_id`) REFERENCES `przedmioty1` (`przedmiot_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

