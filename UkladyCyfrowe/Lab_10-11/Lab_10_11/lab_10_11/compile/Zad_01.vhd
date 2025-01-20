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
-- Generated   : Sun Jan 19 18:11:52 2025
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

signal NET3634 : STD_LOGIC;
signal NET3655 : STD_LOGIC;
signal NET4176 : STD_LOGIC;
signal NET4184 : STD_LOGIC;
signal NET4257 : STD_LOGIC;
signal NET4265 : STD_LOGIC;
signal NET4363 : STD_LOGIC;

begin

----  Component instantiations  ----

D0 : PrzerzutnikD
  port map(
       Q => RC,
       Clk => Clk,
       Reset => Reset,
       D => NET3655
  );

D1 : PrzerzutnikD
  port map(
       Q => NET4363,
       Clk => Clk,
       Reset => Reset,
       D => RC
  );

NET3634 <= m or RC;

GP <= RC and not(NET4363);

NET3655 <= not(NET4363) and NET3634;

NET4176 <= not(RC) and not(NET4363) and m;

NET4184 <= NET4363 and RC;

YC <= NET4184 or NET4176;

NET4257 <= not(RC) and not(m);

NET4265 <= not(RC) and NET4363;

GC <= NET4265 or NET4257;

RP <= not(RC) or NET4363;


end Zad_01;
