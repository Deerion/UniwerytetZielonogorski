-------------------------------------------------------------------------------
--
-- Title       : 
-- Design      : lab5
-- Author      : 
-- Company     : 
--
-------------------------------------------------------------------------------
--
-- File        : C:\Users\Hubert Jarosz\Desktop\Uk³ady cyfrowe\Lab_05\Lab5\lab5\compile\zad03.vhd
-- Generated   : Mon Nov  4 11:57:35 2024
-- From        : C:\Users\Hubert Jarosz\Desktop\Uk³ady cyfrowe\Lab_05\Lab5\lab5\src\zad03\zad03.bde
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

entity zad03 is
  port(
       Y : out STD_LOGIC;
       A : in STD_LOGIC_VECTOR(3 downto 0);
       B : in STD_LOGIC_VECTOR(3 downto 0)
  );
end zad03;

architecture zad03 of zad03 is

---- Component declarations -----

component zad01
  port(
       A : in STD_LOGIC;
       B : in STD_LOGIC;
       Y : out STD_LOGIC
  );
end component;

---- Signal declarations used on the diagram ----

signal NET680 : STD_LOGIC;
signal NET688 : STD_LOGIC;
signal NET696 : STD_LOGIC;
signal NET704 : STD_LOGIC;

begin

----  Component instantiations  ----

U1 : zad01
  port map(
       A => A(3),
       B => B(3),
       Y => NET680
  );

U2 : zad01
  port map(
       A => A(2),
       B => B(2),
       Y => NET688
  );

U3 : zad01
  port map(
       A => A(1),
       B => B(1),
       Y => NET696
  );

U4 : zad01
  port map(
       A => A(0),
       B => B(0),
       Y => NET704
  );

Y <= NET680 and NET688 and NET696 and NET704;


end zad03;
