package meet_3.Guided;

import java.util.Scanner;

public class FoodMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan daftar menu sebagai panduan bagi pengguna
        System.out.println(">>> DAFTAR MENU WARUNG MAKAN <<<");
        System.out.println("1. Nasi Goreng - Rp 15.000");
        System.out.println("2. Mie Ayam    - Rp 12.000");
        System.out.println("3. Bakso       - Rp 13.000");
        System.out.println("4. Sate Ayam   - Rp 20.000");
        System.out.print("Silakan Pilih Kode Menu (1-4): ");

        // Menyimpan pilihan menu dalam variabel
        int kodeMenu = input.nextInt();
        
        // Deklarasi variabel untuk menyimpan nama dan harga
        String namaMenu = "";
        int harga = 0;
        boolean menuDitemukan = true;

        // Menggunakan struktur switch
        switch (kodeMenu) {
            case 1:
                namaMenu = "Nasi Goreng";
                harga = 15000;
                break; // Gunakan break di setiap case
            case 2:
                namaMenu = "Mie Ayam";
                harga = 12000;
                break; // Gunakan break di setiap case
            case 3:
                namaMenu = "Bakso";
                harga = 13000;
                break; // Gunakan break di setiap case
            case 4:
                namaMenu = "Sate Ayam";
                harga = 20000;
                break; // Gunakan break di setiap case
            default:
                // Gunakan default untuk menangani pilihan yang tidak valid 
                menuDitemukan = false; 
                break;
        }

        System.out.println("...................................");

        // Menampilkan hasil evaluasi switch
        if (menuDitemukan) {
            // 2 & 3. Menampilkan nama makanan dan harga [cite: 340, 341]
            System.out.println("Menu yang dipilih : " + namaMenu);
            System.out.println("Harga             : Rp " + harga);
        } else {
            // 4. Jika kode tidak tersedia [cite: 342]
            System.out.println("Menu Tidak Tersedia"); // Tampilkan pesan [cite: 343]
        }

        input.close();
    }
    
}
