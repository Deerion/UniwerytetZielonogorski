//-----------------------------------------------------------------------------
//
// Title       : PrzerzutnikJK
// Design      : lab_10_11
// Author      : Hubert
// Company     : Uniwersytet Zielonogorski
//
//-----------------------------------------------------------------------------
//
// File        : C:/Users/Hubert Jarosz/Documents/GitHub/UniwersytetZielonogorski/UkladyCyfrowe/Lab_10-11/Lab_10_11/lab_10_11/src/PrzerzutnikJK.v
// Generated   : Sat Jan 11 18:23:49 2025
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
//{module {PrzerzutnikJK}}

module PrzerzutnikJK (
	output reg Q,
	input Clk, Reset, J, K
);
	always @ (posedge Clk or posedge Reset)
		if (Reset == 1'b1) Q <= 1'b0;
		else if (J==1'b0 && K==1'b0) Q <= Q;
		else if (J==1'b0 && K==1'b1) Q <= 1'b0;
		else if (J==1'b1 && K==1'b0) Q <= 1'b1;
		else if (J==1'b1 && K==1'b1) Q <=~Q;
endmodule
