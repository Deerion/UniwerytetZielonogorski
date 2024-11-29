-------------------------------------------------------------------------------
--
-- Title       : 
-- Design      : lab_08
-- Author      : 
-- Company     : 
--
-------------------------------------------------------------------------------
--
-- File        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_08\lab_08\lab_08\compile\zad_3.vhd
-- Generated   : Fri Nov 29 09:45:44 2024
-- From        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_08\lab_08\lab_08\src\zad_3\zad_3.bde
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

entity zad_3 is
  port(
       D : in STD_LOGIC;
       Clk : in STD_LOGIC;
       Q : out STD_LOGIC;
       nQ : out STD_LOGIC
  );
end zad_3;

architecture zad_3 of zad_3 is

---- Signal declarations used on the diagram ----

signal NET677 : STD_LOGIC;
signal NET681 : STD_LOGIC;
signal NET685 : STD_LOGIC;
signal NET728 : STD_LOGIC;
signal NET741 : STD_LOGIC;

begin

----  Component instantiations  ----

NET681 <= not(Clk and D);

NET685 <= not(NET677 and Clk);

NET728 <= not(NET741 and NET681);

NET741 <= not(NET685 and NET728);

Q <= NET728;

nQ <= NET741;

NET677 <= not(D);


end zad_3;
