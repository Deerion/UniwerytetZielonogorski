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
    assign A = ~(Cyfra == 4'd0 || Cyfra == 4'd2 || Cyfra == 4'd3 || Cyfra == 4'd5 || Cyfra == 4'd6 || Cyfra == 4'd7 || Cyfra == 4'd8 || Cyfra == 4'd9);
    assign B = ~(Cyfra == 4'd0 || Cyfra == 4'd1 || Cyfra == 4'd2 || Cyfra == 4'd3 || Cyfra == 4'd4 || Cyfra == 4'd7 || Cyfra == 4'd8 || Cyfra == 4'd9);
    assign C = ~(Cyfra == 4'd0 || Cyfra == 4'd1 || Cyfra == 4'd3 || Cyfra == 4'd4 || Cyfra == 4'd5 || Cyfra == 4'd6 || Cyfra == 4'd7 || Cyfra == 4'd8 || Cyfra == 4'd9);
    assign D = ~(Cyfra == 4'd0 || Cyfra == 4'd2 || Cyfra == 4'd3 || Cyfra == 4'd5 || Cyfra == 4'd6 || Cyfra == 4'd8 || Cyfra == 4'd9);
    assign E = ~(Cyfra == 4'd0 || Cyfra == 4'd2 || Cyfra == 4'd6 || Cyfra == 4'd8);
    assign F = ~(Cyfra == 4'd0 || Cyfra == 4'd4 || Cyfra == 4'd5 || Cyfra == 4'd6 || Cyfra == 4'd8 || Cyfra == 4'd9);
    assign G = ~(Cyfra == 4'd2 || Cyfra == 4'd3 || Cyfra == 4'd4 || Cyfra == 4'd5 || Cyfra == 4'd6 || Cyfra == 4'd8 || Cyfra == 4'd9);

endmodule
