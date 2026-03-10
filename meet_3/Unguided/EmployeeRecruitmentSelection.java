package meet_3.Unguided;

import java.util.Scanner;

public class EmployeeRecruitmentSelection {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Meminta Input dari Pengguna ---
        System.out.println("SISTEM SELEKSI PENERIMAAN KARYAWAN");
        System.out.print("Masukkan IPK Anda                  : ");
        double ipk = input.nextDouble();
        
        System.out.print("Masukkan Lama Pengalaman (tahun)   : ");
        int pengalaman = input.nextInt();
        
        System.out.print("Masukkan Umur Anda                 : ");
        int umur = input.nextInt();

        System.out.println("..........................................");

        // Variabel untuk menyimpan hasil akhir
        String status = "";
        String alasanDetail = "";

        // 1. Menggunakan TERNARY OPERATOR untuk melabeli rentang umur
        // Mengecek apakah umur berada di antara 22 dan 30 tahun
        String labelUmur = (umur >= 22 && umur <= 30) ? "Ideal" : "Tidak Masuk Kriteria"; 

        // 2. Evaluasi Utama menggunakan IF-ELSE dan NESTED IF
        if (ipk < 3.0) {
            // Aturan Tambahan 2: Ditolak tanpa proses seleksi
            status = "DITOLAK";
            alasanDetail = "Nilai IPK di bawah 3.0. Ditolak tanpa proses seleksi.";
            
        } else { // Jika IPK >= 3.0, masuk ke proses seleksi lanjutan (NESTED IF)
            
            // Aturan Tambahan 1: Kombinasi operator logika AND (&&)
            if (ipk >= 3.8 && pengalaman >= 3) {
                status = "DITERIMA";
                alasanDetail = "Kualifikasi Istimewa (Jalur Langsung Diterima karena IPK >= 3.8 dan Pengalaman >= 3 tahun)";
                
            } else {
                // Syarat Dasar: Menggunakan kombinasi operator logika OR (||) untuk mencari tahu jika ada syarat yang gagal
                if (ipk < 3.5 || pengalaman < 2 || labelUmur.equals("Tidak Masuk Kriteria")) {
                    status = "DITOLAK";
                    alasanDetail = "Gagal di Syarat Dasar. Harus memenuhi: IPK >= 3.5, Pengalaman >= 2 tahun, dan Umur 22-30 tahun.";
                    
                } else if (ipk >= 3.5 && pengalaman >= 2 && labelUmur.equals("Ideal")) {
                    // Syarat Dasar: Jika semua syarat terpenuhi (Menggunakan AND)
                    status = "DITERIMA";
                    alasanDetail = "Memenuhi semua syarat dasar penerimaan karyawan.";
                }
            }
        }

        // Menampilkan Keputusan Secara Lengkap
        System.out.println("~~~ Hasil Keputusan Seleksi ~~~");
        System.out.println("IPK                 : " + ipk);
        System.out.println("Pengalaman          : " + pengalaman + " tahun");
        System.out.println("Umur                : " + umur + " tahun (Kategori: " + labelUmur + ")");
        System.out.println("Status Keputusan    : " + status);
        System.out.println("Alasan Detail       : " + alasanDetail);

        input.close();
    }
    
}
