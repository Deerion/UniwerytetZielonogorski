//-----------------------------------------------------------------------------
//
// Title       : wyswietlacz
// Design      : lab_07
// Author      : Hubert
// Company     : Uniwersytet Zielonogorski
//
//-----------------------------------------------------------------------------
//
// File        : C:/Users/Hubert Jarosz/Documents/GitHub/UniwersytetZielonogorski/UkladyCyfrowe/Lab_07/lab_07/lab_07/src/wyswietlacz.v
// Generated   : Mon Nov 18 11:27:49 2024
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
//{module {wyswietlacz}}

module wyswietlacz ( Cyfra ,A ,B ,C ,D ,E ,F ,G );

input [3:0] Cyfra;
wire [3:0] Cyfra;
output A;
wire A;
output B;
wire B;
output C;
wire C;
output D;
wire D;
output E;
wire E;
output F;
wire F;
output G;
wire G;

//}} End of automatically maintained section		  

// Logika dla ka¿dego segmentu (0 = zapalone, 1 = zgaszone)	

assign A = (~Cyfra[3] & ~Cyfra[2] & ~Cyfra[1] & Cyfra[0] | ~Cyfra[3] & Cyfra[2] & ~Cyfra[1] & ~Cyfra[0] | 
			 Cyfra[3] & ~Cyfra[2] &  Cyfra[1] & Cyfra[0] |  Cyfra[3] & Cyfra[2] & ~Cyfra[1] &  Cyfra[0]); // Zgaszony dla 1	 4	11	 13
																							  
assign B = (~Cyfra[3] &  Cyfra[2] & ~Cyfra[1] & Cyfra[0] | ~Cyfra[3] & Cyfra[2] & Cyfra[1] & ~Cyfra[0] |
			 Cyfra[3] & ~Cyfra[2] &  Cyfra[1] & Cyfra[0] |  Cyfra[3] & Cyfra[2] & Cyfra[1] & ~Cyfra[0] |
			 Cyfra[3] &  Cyfra[2] &  Cyfra[1] & Cyfra[0] |  Cyfra[3] & Cyfra[2] & ~Cyfra[1] & ~Cyfra[0] ); // Zgaszony dla 	 5 6	 11	  14   15

assign C = (~Cyfra[3] & ~Cyfra[2] & Cyfra[1] & ~Cyfra[0] | Cyfra[3] & Cyfra[2] & ~Cyfra[1] & ~Cyfra[0] |
			 Cyfra[3] &  Cyfra[2] & Cyfra[1] & ~Cyfra[0] | Cyfra[3] & Cyfra[2] &  Cyfra[1] &  Cyfra[0]); // Zgaszony dla 	2	12	14 15

assign D = (~Cyfra[3] & ~Cyfra[2] & ~Cyfra[1] &  Cyfra[0] | ~Cyfra[3] & Cyfra[2] & ~Cyfra[1] & ~Cyfra[0] |
			 Cyfra[3] & ~Cyfra[2] &  Cyfra[1] & ~Cyfra[0] |  
			 Cyfra[3] &  Cyfra[2] &  Cyfra[1] &  Cyfra[0] | ~Cyfra[3] & Cyfra[2] &  Cyfra[1] &  Cyfra[0]); // Zgaszony dla	 1	 4	10	 12	 15

assign E = (~Cyfra[3] & ~Cyfra[2] & ~Cyfra[1] &  Cyfra[0] | ~Cyfra[3] & ~Cyfra[2] &  Cyfra[1] & Cyfra[0] |
			~Cyfra[3] &  Cyfra[2] & ~Cyfra[1] & ~Cyfra[0] | ~Cyfra[3] &  Cyfra[2] & ~Cyfra[1] & Cyfra[0] | 
			~Cyfra[3] &  Cyfra[2] &  Cyfra[1] &  Cyfra[0] |  Cyfra[3] & ~Cyfra[2] & ~Cyfra[1] & Cyfra[0]); // Zgaszony dla 	 1	3  4  5 7	 9

assign F = (~Cyfra[3] & ~Cyfra[2] & ~Cyfra[1] & Cyfra[0] | ~Cyfra[3] & ~Cyfra[2] & Cyfra[1] & ~Cyfra[0] |
			~Cyfra[3] & ~Cyfra[2] &  Cyfra[1] & Cyfra[0] | ~Cyfra[3] &  Cyfra[2] & Cyfra[1] &  Cyfra[0] |
			 Cyfra[3] &  Cyfra[2] & ~Cyfra[1] & Cyfra[0]); // Zgaszony dla 	  1	 2		3 7	   13 

assign G = (~Cyfra[3] & ~Cyfra[2] & ~Cyfra[1] & ~Cyfra[0] | ~Cyfra[3] & Cyfra[2] & Cyfra[1] & Cyfra[0] |
			 Cyfra[3] &  Cyfra[2] & ~Cyfra[1] & ~Cyfra[0] | ~Cyfra[3] & ~Cyfra[2] & ~Cyfra[1] &  Cyfra[0]); // Zgaszony dla 0, 1  7 12
		    
endmodule

/*Sposób 2:
assign A = (Cyfra == 4'd1 || Cyfra == 4'd4 || Cyfra == 4'd11 || Cyfra == 4'd13); // Zgaszony dla 1, 4, B, D
assign B = (Cyfra == 4'd5 || Cyfra == 4'd6 || Cyfra == 4'd11 || Cyfra == 4'd12 || Cyfra == 4'd14 || Cyfra == 4'd15); // Zgaszony dla 5, 6, B, C, E, F
assign C = (Cyfra == 4'd2 || Cyfra == 4'd12 || Cyfra == 4'd14 || Cyfra == 4'd15); // Zgaszony dla 2, C, E, F
assign D = (Cyfra == 4'd1 || Cyfra == 4'd4 || Cyfra == 4'd7 || Cyfra == 4'd10 || Cyfra == 4'd15); // Zgaszony dla 1, 4, 7, A, F
assign E = (Cyfra == 4'd1 || Cyfra == 4'd3 || Cyfra == 4'd4 || Cyfra == 4'd5 || Cyfra == 4'd7 || Cyfra == 4'd9); // Zgaszony dla 1, 3, 4, 5, 7, 9
assign F = (Cyfra == 4'd1 || Cyfra == 4'd2 || Cyfra == 4'd3 || Cyfra == 4'd7 || Cyfra == 4'd13); // Zgaszony dla 1, 2, 3, 7
assign G = (Cyfra == 4'd0 || Cyfra == 4'd1 || Cyfra == 4'd7 || Cyfra == 4'd12); // Zgaszony dla 0, 1, 7, C
*/ 