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
  `stud_id` Int NOT NULL AUTO_INCREMENT,
  `imie` Varchar(30) NOT NULL,
  `nazwisko` Varchar(30) NOT NULL,
  `pesel` Decimal(11,0) NOT NULL,
  `data_urodzenia` Date NOT NULL,
  `plec` Enum('M', 'K') NOT NULL,
  `srypendium` Decimal(8,2) NOT NULL,
  `miejscowosci_id` Int,
  PRIMARY KEY (`stud_id`)
) ENGINE = InnoDB
;

CREATE INDEX `IX_Relationship2` ON `studenci` (`miejscowosci_id`)
;

ALTER TABLE `studenci` ADD UNIQUE `pesel` (`pesel`)
;

-- Table miejscowosci

CREATE TABLE `miejscowosci`
(
  `miejscowosci_id` Int NOT NULL,
  `nazwa` Varchar(30) NOT NULL,
  `liczba_mieszkancow` Int
)
;

ALTER TABLE `miejscowosci` ADD PRIMARY KEY (`miejscowosci_id`)
;

ALTER TABLE `miejscowosci` ADD UNIQUE `nazwa` (`nazwa`)
;

-- Create foreign keys (relationships) section -------------------------------------------------

ALTER TABLE `studenci` ADD CONSTRAINT `Relationship2` FOREIGN KEY (`miejscowosci_id`) REFERENCES `miejscowosci` (`miejscowosci_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

