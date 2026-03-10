package meet_3.Unguided;

import java.util.Scanner;

public class SistemPenilaianKomprehensif {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.println(">>> Evaluasi Akademik <<<");
        System.out.print("Masukkan Nilai Akhir (0-100)      : ");
        double nilai = input.nextDouble();
        
        System.out.print("Masukkan Persentase Kehadiran (%) : ");
        double kehadiran = input.nextDouble();

        // Variabel untuk menyimpan hasil keputusan
        String grade = "-";
        String status = "";

        // 1. Cek syarat kehadiran minimal (Outer If)
        if (kehadiran < 70) {
            // Jika kehadiran kurang dari 70%, otomatis Tidak Lulus 
            status = "Tidak Lulus";
        } else {
            // Jika kehadiran >= 70%, masuk ke evaluasi nilai (Nested If & If-Else If) 
            
            if (nilai >= 85 && kehadiran >= 90) {
                // 2. Jika nilai >= 85 dan kehadiran >= 90% 
                grade = "A";
                status = "Lulus";
            } else if (nilai >= 75 && kehadiran >= 80) {
                // 3. Jika nilai >= 75 dan kehadiran >= 80% 
                grade = "B";
                status = "Lulus";
            } else if (nilai >= 65) {
                // 4. Jika nilai >= 65 
                grade = "C";
                status = "Lulus";
            } else {
                // 5. Selain itu, dinyatakan Tidak Lulus
                status = "Tidak Lulus";
            }
        }

        // Menampilkan seluruh keputusan secara lengkap
        System.out.println("\n>>> Hasil Keputusan Kelulusan <<<");
        System.out.println("Nilai Akhir      : " + nilai);
        System.out.println("Kehadiran        : " + kehadiran + "%");
        System.out.println("Grade            : " + grade); // Menentukan grade
        System.out.println("Status Kelulusan : " + status); // Menentukan status kelulusan

        input.close();
    }
    
}
