package meet_3.Guided;

import java.util.Scanner;

public class ProgramLoginSederhana {

    public static void main(String[] args) {

        // Membuat object Scanner untuk mengambil input dari keyboard
        Scanner input = new Scanner(System.in);

        // Data akun admin yang terdaftar di sistem
        String adminUser = "admin"; 
        String adminPass = "12345"; 

        // Meminta input dari pengguna
        System.out.print("Masukkan Username: ");
        String inputUsername = input.nextLine(); // Menyimpan input username dalam variabel

        System.out.print("Masukkan Password: ");
        String inputPassword = input.nextLine(); // Menyimpan input password dalam variabel

        System.out.println("......................");

        // Memeriksa apakah username yang dimasukkan sesuai
        if (inputUsername.equals(adminUser)) {
            
            // Jika username benar, maka periksa password (Nested If)
            if (inputPassword.equals(adminPass)) {
                // Jika password benar
                System.out.println("Login Berhasil"); 
            } else {
                // Jika password salah
                System.out.println("Password Salah"); 
            }
            
        } else {
            // Jika username tidak ditemukan (tidak sesuai dengan "admin")
            System.out.println("Username Tidak Ditemukan"); 
        }

        input.close();
    }
    
    
}
