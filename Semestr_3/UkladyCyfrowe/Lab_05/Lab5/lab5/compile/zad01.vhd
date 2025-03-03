-------------------------------------------------------------------------------
--
-- Title       : 
-- Design      : lab5
-- Author      : 
-- Company     : 
--
-------------------------------------------------------------------------------
--
-- File        : C:\Users\Hubert Jarosz\Desktop\Uk³ady cyfrowe\Lab_05\Lab5\lab5\compile\zad01.vhd
-- Generated   : Mon Nov  4 11:57:34 2024
-- From        : C:\Users\Hubert Jarosz\Desktop\Uk³ady cyfrowe\Lab_05\Lab5\lab5\src\zad01\zad01.bde
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

entity zad01 is
  port(
       A : in STD_LOGIC;
       B : in STD_LOGIC;
       Y : out STD_LOGIC
  );
end zad01;

architecture zad01 of zad01 is

begin

----  Component instantiations  ----

Y <= not(B xor A);


end zad01;
