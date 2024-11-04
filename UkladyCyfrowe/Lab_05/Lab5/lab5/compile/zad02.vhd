-------------------------------------------------------------------------------
--
-- Title       : 
-- Design      : lab5
-- Author      : 
-- Company     : 
--
-------------------------------------------------------------------------------
--
-- File        : C:\Users\Hubert Jarosz\Desktop\Uk³ady cyfrowe\Lab_05\Lab5\lab5\compile\zad02.vhd
-- Generated   : Mon Nov  4 11:57:34 2024
-- From        : C:\Users\Hubert Jarosz\Desktop\Uk³ady cyfrowe\Lab_05\Lab5\lab5\src\zad02\zad02.bde
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

entity zad02 is
  port(
       A : in STD_LOGIC;
       B : in STD_LOGIC;
       AwB : out STD_LOGIC;
       ArB : out STD_LOGIC;
       AmB : out STD_LOGIC
  );
end zad02;

architecture zad02 of zad02 is

begin

----  Component instantiations  ----

ArB <= not(B xor A);

AwB <= not(B) and A;

AmB <= not(A) and B;


end zad02;
