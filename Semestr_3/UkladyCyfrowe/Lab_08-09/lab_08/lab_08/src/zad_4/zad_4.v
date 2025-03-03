//-----------------------------------------------------------------------------
//
// Title       : zad_4
// Design      : lab_08
// Author      : Hubert
// Company     : Uniwersytet Zielonogorski
//
//-----------------------------------------------------------------------------
//
// File        : C:/Users/Hubert Jarosz/Documents/GitHub/UniwersytetZielonogorski/UkladyCyfrowe/Lab_08/lab_08/lab_08/src/zad_4.v
// Generated   : Fri Nov 29 09:54:14 2024
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
//{module {zad_4}}

module zad_4 (
	output reg Q,
	input Clk, Reset, D
);
	always @(posedge Clk or posedge Reset)
	if (Reset) Q <= 1'b0;
	else Q <= D;
endmodule