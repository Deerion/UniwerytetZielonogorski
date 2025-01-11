-------------------------------------------------------------------------------
--
-- Title       : 
-- Design      : lab_10_11
-- Author      : 
-- Company     : 
--
-------------------------------------------------------------------------------
--
-- File        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_10-11\Lab_10_11\lab_10_11\compile\Zad_01.vhd
-- Generated   : Tue Jan  7 12:23:10 2025
-- From        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_10-11\Lab_10_11\lab_10_11\src\Zad_01\Zad_01.bde
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

entity Zad_01 is
  port(
       Clk : in STD_LOGIC;
       Reset : in STD_LOGIC;
       m : in STD_LOGIC;
       RC : buffer STD_LOGIC;
       YC : buffer STD_LOGIC;
       GC : buffer STD_LOGIC;
       RP : buffer STD_LOGIC;
       GP : buffer STD_LOGIC
  );
end Zad_01;

architecture Zad_01 of Zad_01 is

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

signal NET2805 : STD_LOGIC;
signal NET2813 : STD_LOGIC;
signal NET2847 : STD_LOGIC;
signal NET2929 : STD_LOGIC;
signal NET2983 : STD_LOGIC;

begin

----  Component instantiations  ----

U15 : PrzerzutnikD
  port map(
       Q => RC,
       Clk => Clk,
       Reset => Reset,
       D => NET2847
  );

U16 : PrzerzutnikD
  port map(
       Q => NET2983,
       Clk => Clk,
       Reset => Reset,
       D => RC
  );

NET2805 <= NET2983 or m;

NET2813 <= not(RC) and not(NET2983);

NET2847 <= NET2813 and NET2805;

YC <= NET2983 xor RC;

GC <= not(NET2983) and not(RC);

RP <= not(RC) or NET2929;

NET2929 <= not(NET2983) and RC;

GP <= RC and NET2983;


end Zad_01;
