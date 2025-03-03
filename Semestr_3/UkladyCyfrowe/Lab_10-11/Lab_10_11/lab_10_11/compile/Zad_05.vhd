-------------------------------------------------------------------------------
--
-- Title       : 
-- Design      : lab_10_11
-- Author      : 
-- Company     : 
--
-------------------------------------------------------------------------------
--
-- File        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_10-11\Lab_10_11\lab_10_11\compile\Zad_05.vhd
-- Generated   : Mon Jan 20 11:45:04 2025
-- From        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_10-11\Lab_10_11\lab_10_11\src\Zad_05\Zad_05.bde
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

entity Zad_05 is
  port(
       X : in STD_LOGIC;
       Clock : in STD_LOGIC;
       Reset : in STD_LOGIC;
       Y2 : buffer STD_LOGIC;
       Y1 : buffer STD_LOGIC;
       Y0 : buffer STD_LOGIC
  );
end Zad_05;

architecture Zad_05 of Zad_05 is

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

signal NET1022 : STD_LOGIC;
signal NET1079 : STD_LOGIC;
signal NET1098 : STD_LOGIC;
signal NET1106 : STD_LOGIC;
signal NET1296 : STD_LOGIC;
signal NET1304 : STD_LOGIC;
signal NET1341 : STD_LOGIC;
signal NET1348 : STD_LOGIC;
signal NET1480 : STD_LOGIC;
signal NET915 : STD_LOGIC;
signal NET926 : STD_LOGIC;
signal NET934 : STD_LOGIC;

begin

----  Component instantiations  ----

D0 : PrzerzutnikD
  port map(
       Q => NET1480,
       Clk => Clock,
       Reset => Reset,
       D => NET1106
  );

D1 : PrzerzutnikD
  port map(
       Q => NET1348,
       Clk => Reset,
       Reset => Reset,
       D => NET1022
  );

D2 : PrzerzutnikD
  port map(
       Q => NET1341,
       Clk => Clock,
       Reset => Reset,
       D => NET915
  );

NET1079 <= not(NET1348) and not(NET1341) and X;

NET1098 <= X and NET1348 and NET1341 and not(NET1480);

Y2 <= NET1341 and NET1348;

Y1 <= not(NET1341) and NET1348;

NET1296 <= not(NET1341) and not(NET1348) and NET1480;

NET1304 <= NET1341 and not(NET1348) and NET1480;

Y0 <= NET1296 or NET1304;

NET915 <= X and NET1348 and not(NET1480);

NET1022 <= NET926 or NET934;

NET934 <= X and NET1480 and not(NET1341);

NET926 <= NET1348 and not(NET1480) and X;

NET1106 <= NET1098 or NET1079;


end Zad_05;
