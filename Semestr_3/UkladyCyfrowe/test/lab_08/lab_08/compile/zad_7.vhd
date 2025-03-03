-------------------------------------------------------------------------------
--
-- Title       : 
-- Design      : lab_08
-- Author      : 
-- Company     : 
--
-------------------------------------------------------------------------------
--
-- File        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_08\lab_08\lab_08\compile\zad_7.vhd
-- Generated   : Sun Dec  8 18:46:13 2024
-- From        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_08\lab_08\lab_08\src\zad_7\zad_7.bde
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

entity zad_7 is
  port(
       Clk : in STD_LOGIC;
       Reset : in STD_LOGIC;
       Y : out STD_LOGIC
  );
end zad_7;

architecture zad_7 of zad_7 is

---- Component declarations -----

component zad_5
  port(
       Q : out STD_LOGIC;
       Clk : in STD_LOGIC;
       Reset : in STD_LOGIC;
       J : in STD_LOGIC;
       K : in STD_LOGIC
  );
end component;

---- Signal declarations used on the diagram ----

signal NET712 : STD_LOGIC;
signal NET740 : STD_LOGIC;

begin

----  Component instantiations  ----

U1 : zad_5
  port map(
       Q => NET712,
       Clk => Clk,
       Reset => Reset,
       J => NET740,
       K => NET740
  );

Y <= NET712;

NET740 <= not(NET712 xor NET712);


end zad_7;
