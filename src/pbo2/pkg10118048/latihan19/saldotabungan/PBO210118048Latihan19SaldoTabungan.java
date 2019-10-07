/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan19.saldotabungan;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menghitung saldo tabungan tiap bulan
 */
public class PBO210118048Latihan19SaldoTabungan {

    public static void main(String[] args) {
        int saldoAwal, i;
        
        saldoAwal = 2_500_000;
        i = 1;
        while(i <= 6) {
            saldoAwal +=  saldoAwal * 0.15;
            System.out.print("Saldo di bulan ke-"+ i +" Rp."); i++;
            System.out.printf("%,10d%n" , saldoAwal);  
        }
    }
}
   