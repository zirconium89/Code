package meet_1.Unguided;

import java.util.Scanner;

public class AverageStudent {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai Kalkulus: ");
        double nilaiKalkulus = input.nextDouble();

        System.out.print("Masukkan Nilai Fisika Dasar: ");
        double nilaiFisikaDasar = input.nextDouble();

        System.out.print("Masukkan Nilai Etika Profesi: ");
        double nilaiEtikaProfesi = input.nextDouble();

        //Operasi
        double averageNilaiMahasiswa = (nilaiKalkulus + nilaiFisikaDasar + nilaiEtikaProfesi) / 3;
        
        boolean statusKelulusan = averageNilaiMahasiswa >= 75;

        System.out.println("Rata-rata Nilai: " + averageNilaiMahasiswa);
        System.out.println("Apakah Lulus: " + statusKelulusan);


    input.close();

    }
    
}
