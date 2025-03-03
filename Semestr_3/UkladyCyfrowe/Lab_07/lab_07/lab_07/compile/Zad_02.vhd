-------------------------------------------------------------------------------
--
-- Title       : 
-- Design      : lab_07
-- Author      : 
-- Company     : 
--
-------------------------------------------------------------------------------
--
-- File        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_07\lab_07\lab_07\compile\Zad_02.vhd
-- Generated   : Fri Dec 13 21:50:54 2024
-- From        : C:\Users\Hubert Jarosz\Documents\GitHub\UniwersytetZielonogorski\UkladyCyfrowe\Lab_07\lab_07\lab_07\src\Zad_02\Zad_02.bde
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
       A : out STD_LOGIC;
       B : out STD_LOGIC;
       C : out STD_LOGIC;
       D : out STD_LOGIC;
       E : out STD_LOGIC;
       F : out STD_LOGIC;
       G : out STD_LOGIC;
       Cyfra : in STD_LOGIC_VECTOR(3 downto 0)
  );
end Zad_02;

architecture Zad_02 of Zad_02 is

---- Signal declarations used on the diagram ----

signal NET1002 : STD_LOGIC;
signal NET1075 : STD_LOGIC;
signal NET1077 : STD_LOGIC;
signal NET1083 : STD_LOGIC;
signal NET1160 : STD_LOGIC;
signal NET1162 : STD_LOGIC;
signal NET1168 : STD_LOGIC;
signal NET710 : STD_LOGIC;
signal NET718 : STD_LOGIC;
signal NET743 : STD_LOGIC;
signal NET759 : STD_LOGIC;
signal NET763 : STD_LOGIC;
signal NET771 : STD_LOGIC;
signal NET817 : STD_LOGIC;
signal NET819 : STD_LOGIC;
signal NET825 : STD_LOGIC;
signal NET909 : STD_LOGIC;
signal NET911 : STD_LOGIC;
signal NET917 : STD_LOGIC;
signal NET994 : STD_LOGIC;
signal NET996 : STD_LOGIC;

begin

----  Component instantiations  ----

NET710 <= Cyfra(0) and Cyfra(3);

NET825 <= not(Cyfra(0)) and Cyfra(1);

NET817 <= NET825 or NET819;

C <= not(NET817);

NET911 <= Cyfra(0) and Cyfra(3);

NET917 <= Cyfra(1) and not(Cyfra(2));

NET909 <= NET917 or NET911;

D <= not(NET909);

NET996 <= Cyfra(0) and not(Cyfra(3));

NET1002 <= Cyfra(1) and not(Cyfra(2));

NET994 <= NET1002 or NET996;

NET718 <= Cyfra(1) and not(Cyfra(2));

E <= not(NET994);

NET1077 <= Cyfra(0) and Cyfra(3);

NET1083 <= Cyfra(1) and not(Cyfra(2));

NET1075 <= NET1083 or NET1077;

F <= not(NET1075);

NET1162 <= Cyfra(0) and not(Cyfra(3));

NET1168 <= Cyfra(2) and Cyfra(3);

NET1160 <= NET1168 or NET1162;

G <= not(NET1160);

NET743 <= NET718 or NET710;

A <= not(NET743);

NET763 <= Cyfra(2) and Cyfra(3);

NET771 <= Cyfra(0) and Cyfra(1);

NET759 <= NET771 or NET763;

B <= not(NET759);

NET819 <= Cyfra(2) and Cyfra(3);


end Zad_02;
