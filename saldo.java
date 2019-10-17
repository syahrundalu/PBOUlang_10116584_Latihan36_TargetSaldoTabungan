/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan36_targetsaldotabungan;

/**
 *
 * @author
 * NIM  :  10116484
 * Nama : Muhammad Syahrun Dalu
 */
public class saldo { 
           
           
        public void hitungSaldo(int saldo,int target, double bunga){
        int i=1;       
        while(saldo<= target){
            bunga = bunga/100;
            saldo = (int)(saldo+(saldo*bunga));
            System.out.println("Saldo di bulan ke-"+i+"Rp. "+saldo);
            i++;
        
        System.out.println("");
        System.out.println ("developed by Muhammad Syahrun Dalu");
        }
}
}