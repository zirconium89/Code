package meet_3.Unguided;

import java.util.Scanner;

public class SupermarketDiscountSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menerima Input
        System.out.println(">>> Sistem Kasir Supermarket <<<");
        System.out.print("Masukkan Total Belanja (Rp)        : ");
        double totalBelanja = input.nextDouble();

        System.out.print("Apakah pelanggan Member? (true/false) : ");
        boolean isMember = input.nextBoolean();

        System.out.print("Masukkan Hari Pembelanjaan         : ");
        String hari = input.next();

        // 1. Menggunakan TERNARY untuk menentukan status member berupa teks
        String statusMember = isMember ? "Member" : "Non-Member";

        double diskonUtama = 0.0;

        // 2. Menggunakan NESTED IF dan IF-ELSE IF untuk logika diskon
        if (isMember) { // Outer If (Jika pelanggan adalah Member)
            
            // Nested If & If-Else If di dalam blok Member
            if (totalBelanja >= 500000) {
                diskonUtama = 0.20; // Member dan belanja >= 500.000 → Diskon 20%
            } else if (totalBelanja >= 300000) {
                diskonUtama = 0.15; // Member dan belanja >= 300.000 → Diskon 15%
            } else {
                diskonUtama = 0.0;  // Selain itu Tidak ada diskon
            }
            
        } else { // Outer Else (Jika pelanggan adalah Non-Member)
            
            // Nested If di dalam blok Non-Member 
            if (totalBelanja >= 500000) {
                diskonUtama = 0.10; // Non-member dan belanja >= 500.000 → Diskon 10%
            } else {
                diskonUtama = 0.0;  // Selain itu Tidak ada diskon
            }
        }

        // 3. Menggunakan SWITCH untuk mengecek hari dan diskon tambahan 
        double tambahanDiskon = 0.0;
        
        // .toLowerCase() digunakan agar program tetap mengenali "minggu", "Minggu", atau "MINGGU"
        switch (hari.toLowerCase()) { 
            case "minggu":
                tambahanDiskon = 0.05; // Jika hari "Minggu", tambahan diskon 5%
                break;
            default:
                tambahanDiskon = 0.0; // Hari lain tidak ada tambahan diskon
                break;
        }

        // Menghitung Total
        double totalDiskonPersen = diskonUtama + tambahanDiskon; 
        double nominalDiskon = totalBelanja * totalDiskonPersen; 
        double totalBayar = totalBelanja - nominalDiskon;

        // Menampilkan Output
        System.out.println("\n~~~ Struk Pembayaran ~~~");
        System.out.println("Status Pelanggan : " + statusMember);
        System.out.println("Hari             : " + hari);
        System.out.println("Total Belanja    : Rp " + totalBelanja);
        System.out.println("Total Diskon     : " + (totalDiskonPersen * 100) + "% (Rp " + nominalDiskon + ")");
        System.out.println("Total Bayar      : Rp " + totalBayar);

        input.close();
    }
    
}
