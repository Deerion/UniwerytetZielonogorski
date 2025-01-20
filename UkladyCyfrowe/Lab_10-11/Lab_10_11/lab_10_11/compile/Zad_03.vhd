-------------------------------------------------------------------------------
--
-- Title       : 
-- Design      : lab_10_11
-- Author      : 
-- Company     : 
--
-------------------------------------------------------------------------------
--
-- File        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_10-11\Lab_10_11\lab_10_11\compile\Zad_03.vhd
-- Generated   : Sun Jan 19 19:10:03 2025
-- From        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_10-11\Lab_10_11\lab_10_11\src\Zad_03\Zad_03.bde
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

entity Zad_03 is
  port(
       X0 : in STD_LOGIC;
       X1 : in STD_LOGIC;
       Reset : in STD_LOGIC;
       Clock : in STD_LOGIC;
       Y0 : buffer STD_LOGIC;
       Y1 : buffer STD_LOGIC;
       Y2 : buffer STD_LOGIC;
       Jeden : in STD_LOGIC
  );
end Zad_03;

architecture Zad_03 of Zad_03 is

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

signal NET648 : STD_LOGIC;
signal NET656 : STD_LOGIC;
signal NET691 : STD_LOGIC;

begin

----  Component instantiations  ----

U1 : PrzerzutnikJK
  port map(
       Q => NET691,
       Clk => Clock,
       Reset => Reset,
       J => Jeden,
       K => X1
  );

Y0 <= NET691 and X1;

NET648 <= not(X0) and not(NET691);

NET656 <= not(X1) and NET691;

Y2 <= not(NET691) and X0;

Y1 <= NET656 or NET648;


end Zad_03;
