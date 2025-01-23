-------------------------------------------------------------------------------
--
-- Title       : 
-- Design      : lab_10_11
-- Author      : 
-- Company     : 
--
-------------------------------------------------------------------------------
--
-- File        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_10-11\Lab_10_11\lab_10_11\compile\Zad_06.vhd
-- Generated   : Mon Jan 20 12:12:29 2025
-- From        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_10-11\Lab_10_11\lab_10_11\src\Zad_06\Zad_06.bde
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

entity Zad_06 is
  port(
       X : in STD_LOGIC;
       Clock : in STD_LOGIC;
       Reset : in STD_LOGIC;
       Y2 : buffer STD_LOGIC;
       Y1 : buffer STD_LOGIC;
       Y0 : buffer STD_LOGIC
  );
end Zad_06;

architecture Zad_06 of Zad_06 is

---- Component declarations -----

component PrzerzutnikJK
  port(
       Q : out STD_LOGIC;
       Clk : in STD_LOGIC;
       Reset : in STD_LOGIC;
       J : in STD_LOGIC;
       K : in STD_LOGIC
  );
end component;

---- Signal declarations used on the diagram ----

signal NET1044 : STD_LOGIC;
signal NET1157 : STD_LOGIC;
signal NET1194 : STD_LOGIC;
signal NET1199 : STD_LOGIC;
signal NET1207 : STD_LOGIC;
signal NET1227 : STD_LOGIC;
signal NET737 : STD_LOGIC;
signal NET786 : STD_LOGIC;
signal NET852 : STD_LOGIC;
signal NET860 : STD_LOGIC;
signal NET877 : STD_LOGIC;
signal NET883 : STD_LOGIC;
signal NET937 : STD_LOGIC;
signal NET981 : STD_LOGIC;

begin

----  Component instantiations  ----

U1 : PrzerzutnikJK
  port map(
       Q => NET1157,
       Clk => Clock,
       Reset => Reset,
       J => NET737,
       K => NET786
  );

NET877 <= not(NET1194) and NET937 and NET1157 and X;

NET1044 <= X and NET1194 and NET1157;

Y2 <= NET1157 and NET1157;

Y1 <= NET1157 and not(NET1157);

Y0 <= NET1227 or NET1207 or NET1199;

NET1199 <= NET1194 and not(NET1157) and not(NET1157);

NET1207 <= not(NET1194) and NET1157 and not(NET1157);

U2 : PrzerzutnikJK
  port map(
       Q => NET937,
       Clk => Clock,
       Reset => Reset,
       J => NET852,
       K => NET860
  );

NET1227 <= NET1194 and NET1157 and NET1157;

U3 : PrzerzutnikJK
  port map(
       Q => NET1194,
       Clk => Clock,
       Reset => Reset,
       J => NET981,
       K => NET1044
  );

NET737 <= X and NET937 and not(NET1194) and not(NET1157);

NET786 <= X and NET1194 and NET937 and NET1157;

NET852 <= X and NET1194 and not(NET937) and not(NET1157);

NET860 <= NET1157 and NET937 and NET1194 and X;

NET981 <= NET877 or NET883;

NET883 <= X and not(NET937) and not(NET1157) and not(NET1194);


end Zad_06;
