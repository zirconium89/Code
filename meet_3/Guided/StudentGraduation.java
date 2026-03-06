package meet_3.Guided;

import java.util.Scanner;

public class StudentGraduation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai Budi: ");
        double nilai = input.nextDouble();

        // Menyimpan nilai mahasiswa ke dalam sebuah variable
        // double nilai = 74.25; 
        
       String grade;
        
        // Menentukan grade menggunakan struktur if - else if - else
        if (nilai >= 85) {
            grade = "A";
        } else if (nilai >= 75) {
            grade = "B";
        } else if (nilai >= 65) {
            grade = "C";
        } else if (nilai >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        // Menentukan status kelulusan
        String status = (nilai >= 65) ? "LULUS" : "TIDAK LULUS";
        
        // Menampilkan Nilai, Grade, dan Status kelulusan
        System.out.println("Nilai Mahasiswa  : " + nilai);
        System.out.println("Grade            : " + grade);
        System.out.println("Status Kelulusan : " + status);
        
        input.close();
    }
    
}