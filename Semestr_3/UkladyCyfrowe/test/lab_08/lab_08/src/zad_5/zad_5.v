//-----------------------------------------------------------------------------
//
// Title       : zad_5
// Design      : lab_08
// Author      : Hubert
// Company     : Uniwersytet Zielonogorski
//
//-----------------------------------------------------------------------------
//
// File        : C:/Users/Hubert Jarosz/Documents/GitHub/UniwersytetZielonogorski/UkladyCyfrowe/Lab_08/lab_08/lab_08/src/zad_5.v
// Generated   : Fri Nov 29 10:11:16 2024
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
//{module {zad_5}}

module zad_5 (
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