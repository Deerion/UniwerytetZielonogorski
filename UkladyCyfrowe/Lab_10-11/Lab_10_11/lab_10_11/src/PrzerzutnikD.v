//-----------------------------------------------------------------------------
//
// Title       : PrzerzutnikD
// Design      : lab_10_11
// Author      : Hubert
// Company     : Uniwersytet Zielonogorski
//
//-----------------------------------------------------------------------------
//
// File        : C:/Users/Hubert Jarosz/Documents/GitHub/UniwersytetZielonogorski/UkladyCyfrowe/Lab_10-11/Lab_10_11/lab_10_11/src/PrzerzutnikD.v
// Generated   : Mon Dec 16 11:43:12 2024
// From        : Interface description file
// By          : ItfToHdl ver. 1.0
//
//-----------------------------------------------------------------------------
//
// Description : 
//
//-----------------------------------------------------------------------------

`timescale 1ps / 1ps

//{{ Section below this comment is automatically maintained
//    and may be overwritten
//{module {PrzerzutnikD}}



module PrzerzutnikD (
	output reg Q,
	input Clk, Reset, D
);
	always @(posedge Clk or posedge Reset)
	if (Reset) Q <= 1'b0;
	else Q <= D;
endmodule


