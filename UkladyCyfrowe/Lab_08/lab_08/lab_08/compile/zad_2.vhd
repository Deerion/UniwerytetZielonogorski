-------------------------------------------------------------------------------
--
-- Title       : 
-- Design      : lab_08
-- Author      : 
-- Company     : 
--
-------------------------------------------------------------------------------
--
-- File        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_08\lab_08\lab_08\compile\zad_2.vhd
-- Generated   : Mon Nov 25 12:05:22 2024
-- From        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_08\lab_08\lab_08\src\zad_2\zad_2.bde
-- By          : Bde2Vhdl ver. 2.6
--
-------------------------------------------------------------------------------
--
-- Description : 
--
-------------------------------------------------------------------------------
-- Design unit header --
library IEEE;
use IEEE.std_logic_1164.all;
use IEEE.std_logic_arith.all;
use IEEE.std_logic_signed.all;
use IEEE.std_logic_unsigned.all;

entity zad_2 is
  port(
       nS : in STD_LOGIC;
       nR : in STD_LOGIC;
       Q : out STD_LOGIC;
       nQ : out STD_LOGIC
  );
end zad_2;

architecture zad_2 of zad_2 is

---- Signal declarations used on the diagram ----

signal NET673 : STD_LOGIC;
signal NET686 : STD_LOGIC;

begin

----  Component instantiations  ----

NET673 <= not(NET686 and nS);

NET686 <= not(nR and NET673);

Q <= NET673;

nQ <= NET686;


end zad_2;
