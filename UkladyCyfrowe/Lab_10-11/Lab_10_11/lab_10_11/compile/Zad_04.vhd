-------------------------------------------------------------------------------
--
-- Title       : 
-- Design      : lab_10_11
-- Author      : 
-- Company     : 
--
-------------------------------------------------------------------------------
--
-- File        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_10-11\Lab_10_11\lab_10_11\compile\Zad_04.vhd
-- Generated   : Mon Jan 20 10:22:46 2025
-- From        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_10-11\Lab_10_11\lab_10_11\src\Zad_04\Zad_04.bde
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

entity Zad_04 is
  port(
       Reset : in STD_LOGIC;
       Clock : in STD_LOGIC;
       X0 : in STD_LOGIC;
       X1 : in STD_LOGIC;
       Y0 : buffer STD_LOGIC;
       Y1 : buffer STD_LOGIC;
       Y2 : buffer STD_LOGIC
  );
end Zad_04;

architecture Zad_04 of Zad_04 is

---- Component declarations -----

component PrzerzutnikD
  port(
       Q : out STD_LOGIC;
       Clk : in STD_LOGIC;
       Reset : in STD_LOGIC;
       D : in STD_LOGIC
  );
end component;

---- Signal declarations used on the diagram ----

signal NET1097 : STD_LOGIC;
signal NET1158 : STD_LOGIC;
signal NET1167 : STD_LOGIC;
signal NET947 : STD_LOGIC;
signal NET951 : STD_LOGIC;
signal NET955 : STD_LOGIC;
signal NET963 : STD_LOGIC;

begin

----  Component instantiations  ----

D0 : PrzerzutnikD
  port map(
       Q => NET1167,
       Clk => Clock,
       Reset => Reset,
       D => NET1097
  );

D1 : PrzerzutnikD
  port map(
       Q => NET1158,
       Clk => Clock,
       Reset => Reset,
       D => NET947
  );

Y2 <= NET1167 and not(NET1158);

Y1 <= not(NET1167) and NET1158;

NET955 <= not(X0) and not(NET1158) and not(NET1167);

NET951 <= not(X1) and NET1167 and not(NET1158);

NET963 <= not(X1) and not(NET1167) and NET1158;

NET947 <= NET963 or NET951 or NET955;

NET1097 <= not(NET1158) and not(NET1167) and X0;

Y0 <= not(NET1167) and not(NET1158);


end Zad_04;
