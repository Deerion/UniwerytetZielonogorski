//-----------------------------------------------------------------------------
//
// Title       : and_test
// Design      : lab_06
// Author      : Hubert
// Company     : Uniwersytet Zielonogorski
//
//-----------------------------------------------------------------------------
//
// File        : C:/Users/Hubert Jarosz/Documents/GitHub/UniwersytetZielonogorski/UkladyCyfrowe/Lab_06/lab_06/lab_06/src/and_test.v
// Generated   : Wed Nov 13 11:35:58 2024
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
//{module {and_test}}

module and_test ( A ,B ,Y );

input A;
wire A;
input B;
wire B;
output Y;
wire Y;

//}} End of automatically maintained section

// Enter your statements here //		 

assign Y = A & B;

endmodule
