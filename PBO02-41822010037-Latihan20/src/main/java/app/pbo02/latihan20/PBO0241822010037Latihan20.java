/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app.pbo02.latihan20;

/**
 *
 * @author DElDEl
 * * Nama : Syadella Putri
 * NIM  : 41822010037
 * Nama : Anastasya Azami
 * NIM  : 41822010081
 */
public class PBO0241822010037Latihan20 {

    public static void main(String[] args) {
        System.out.println("FOrmat Latihan PBO");
        double saldo=3500000;
        double saldo_target=6000000;
        double bunga=0.08;
        int n=0;
        
        while(saldo<saldo_target){
            saldo+=saldo*bunga;
            n++;
            String formatSaldo = "RP." + formatCurrency((int) saldo);
            System.out.println("Saldo di bulan ke - " + n + " " + formatSaldo);
        }
   
}
public static String formatCurrency(int amount) {
        return String.format("%,d", amount).replace(",", ".");
    }
}
