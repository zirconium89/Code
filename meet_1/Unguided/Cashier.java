package meet_1.Unguided;

import java.util.Scanner;

public class Cashier {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        final int MINYAK_GORENG = 15000;
        final int TELUR = 20500;
        final int GULA = 12700;
        final int MIE_INSTAN = 2500;

        System.out.print("Masukkan jumlah pembelian Minyak Goreng: ");
        int minyakGoreng = input.nextInt();

        System.out.print("Masukkan jumlah pembelian Telur: ");
        int telur = input.nextInt();

        System.out.print("Masukkan jumlah pembelian Gula: ");
        int gula = input.nextInt();

        System.out.print("Masukkan jumlah pembelian Mie Instan: ");
        int mieInstan = input.nextInt();
        

        // Hasil perhitungan operasi

        int totalMinyakGoreng = minyakGoreng * MINYAK_GORENG;
        int totalTelur = telur * TELUR;
        int totalGula = gula * GULA;
        int totalMieInstan = mieInstan * MIE_INSTAN;

        int totalBelanja = totalMinyakGoreng + totalGula + totalTelur + totalMieInstan;

        System.out.println("Harga Minyak Goreng: " + totalMinyakGoreng);
        System.out.println("Harga Telur: " + totalTelur);
        System.out.println("Harga Gula: " + totalGula);
        System.out.println("Harga Mie Instan: " + totalMieInstan);
     
        System.out.println("Total Belanja: " + totalBelanja);

        input.close();
    }

}
