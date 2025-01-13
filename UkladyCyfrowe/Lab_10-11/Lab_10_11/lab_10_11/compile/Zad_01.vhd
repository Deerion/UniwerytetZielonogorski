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
-- Generated   : Mon Jan 13 12:25:28 2025
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

signal NET3146 : STD_LOGIC;
signal NET3154 : STD_LOGIC;
signal NET3277 : STD_LOGIC;
signal NET3406 : STD_LOGIC;
signal NET3429 : STD_LOGIC;

begin

----  Component instantiations  ----

D0 : PrzerzutnikD
  port map(
       Q => NET3429,
       Clk => Clk,
       Reset => Reset,
       D => NET3154
  );

D1 : PrzerzutnikD
  port map(
       Q => RC,
       Clk => Clk,
       Reset => Reset,
       D => NET3429
  );

NET3154 <= not(RC) and NET3146;

NET3406 <= not(RC) and not(NET3429) and m;

NET3146 <= m or NET3429;

YC <= RC xor NET3429;

GC <= not(RC) and not(NET3429) and m;

NET3277 <= NET3429 xor RC;

RP <= NET3406 or NET3277;

GP <= NET3429 and RC;


end Zad_01;
