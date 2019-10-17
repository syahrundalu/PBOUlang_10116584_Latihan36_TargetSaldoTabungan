/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan36_targetsaldotabungan;


/**
 *
 * @author 
 * NIM  : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan36_TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        
        saldo mysaldo = new saldo(); 
        mysaldo.saldo = 3500000;
        mysaldo.bunga = 8;
        mysaldo.target = 6000000;
        
        mysaldo.hitungSaldo(saldo, bunga, target);
        
       
        
                }
    
}
