-------------------------------------------------------------------------------
--
-- Title       : 
-- Design      : lab_08
-- Author      : 
-- Company     : 
--
-------------------------------------------------------------------------------
--
-- File        : C:\Users\Martyna\Desktop\Lab_08\lab_08\lab_08\compile\zad_1.vhd
-- Generated   : Mon Dec  2 12:12:39 2024
-- From        : C:\Users\Martyna\Desktop\Lab_08\lab_08\lab_08\src\zad_1\zad_1.bde
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

entity zad_1 is
  port(
       R : in STD_LOGIC;
       S : in STD_LOGIC;
       Q : out STD_LOGIC;
       Qn : out STD_LOGIC
  );
end zad_1;

architecture zad_1 of zad_1 is

---- Signal declarations used on the diagram ----

signal NET693 : STD_LOGIC;
signal NET710 : STD_LOGIC;

begin

----  Component instantiations  ----

Q <= NET693;

Qn <= NET710;

NET693 <= not(NET710 or R);

NET710 <= not(S or NET693);


end zad_1;
