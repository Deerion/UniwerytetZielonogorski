-------------------------------------------------------------------------------
--
-- Title       : 
-- Design      : lab_10_11
-- Author      : 
-- Company     : 
--
-------------------------------------------------------------------------------
--
-- File        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_10-11\Lab_10_11\lab_10_11\compile\Zad_02.vhd
-- Generated   : Sun Jan 19 17:43:42 2025
-- From        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_10-11\Lab_10_11\lab_10_11\src\Zad_02\Zad_02.bde
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

entity Zad_02 is
  port(
       Reset : in STD_LOGIC;
       Clk : in STD_LOGIC;
       m : in STD_LOGIC;
       RC : buffer STD_LOGIC;
       YC : buffer STD_LOGIC;
       GC : buffer STD_LOGIC;
       RP : buffer STD_LOGIC;
       GP : buffer STD_LOGIC
  );
end Zad_02;

architecture Zad_02 of Zad_02 is

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

signal NET1749 : STD_LOGIC;
signal NET1814 : STD_LOGIC;
signal NET1822 : STD_LOGIC;
signal NET1867 : STD_LOGIC;
signal NET1875 : STD_LOGIC;
signal NET2054 : STD_LOGIC;
signal NET2081 : STD_LOGIC;
signal NET2133 : STD_LOGIC;
signal NET2172 : STD_LOGIC;
signal NET2311 : STD_LOGIC;

begin

----  Component instantiations  ----

JK0 : PrzerzutnikJK
  port map(
       Q => RC,
       Clk => NET1749,
       Reset => NET1749,
       J => NET2133,
       K => NET2172
  );

JK1 : PrzerzutnikJK
  port map(
       Q => NET2311,
       Clk => NET1749,
       Reset => NET1749,
       J => NET2054,
       K => NET2081
  );

RP <= not(RC) or NET2311;

GP <= RC and not(NET2311);

NET2054 <= not(NET2311) and RC;

NET2081 <= NET2311 and not(RC);

NET2133 <= not(RC) and not(NET2311) and m;

NET2172 <= RC and NET2311;

NET1822 <= not(NET2311) and not(RC) and m;

YC <= NET1822 or NET1814;

NET1814 <= NET2311 and RC;

NET1867 <= not(RC) and not(m);

NET1875 <= not(RC) and NET2311;

GC <= NET1875 or NET1867;


---- Terminal assignment ----

    -- Inputs terminals
	NET1749 <= Clk;
	NET1749 <= Reset;


end Zad_02;
