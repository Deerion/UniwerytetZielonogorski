-------------------------------------------------------------------------------
--
-- Title       : 
-- Design      : lab_08
-- Author      : 
-- Company     : 
--
-------------------------------------------------------------------------------
--
-- File        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_08\lab_08\lab_08\compile\zad_06.vhd
-- Generated   : Sun Dec  8 18:46:13 2024
-- From        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_08\lab_08\lab_08\src\zad_6\zad_06.bde
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

entity zad_06 is
  port(
       Reset : in STD_LOGIC;
       Clk : in STD_LOGIC;
       y : buffer STD_LOGIC
  );
end zad_06;

architecture zad_06 of zad_06 is

---- Component declarations -----

component zad_4
  port(
       Q : out STD_LOGIC;
       Clk : in STD_LOGIC;
       Reset : in STD_LOGIC;
       D : in STD_LOGIC
  );
end component;

---- Signal declarations used on the diagram ----

signal NET676 : STD_LOGIC;

begin

----  Component instantiations  ----

U1 : zad_4
  port map(
       Q => y,
       Clk => Clk,
       Reset => Reset,
       D => NET676
  );

NET676 <= not(y);


end zad_06;
