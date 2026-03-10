package meet_4.Teori;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // --- For Loop yang Sederhana
        // String[] mahasiswa = {"Andi", "Budi", "Citra", "Dina"};

        // System.out.println(mahasiswa.length);

        // for (int i = 0; i < mahasiswa.length; i++) {
        //     System.out.println("Mahasiswa ke-" + (i + 1) + ": " + mahasiswa[i]);
        // }

        // --- While Loop username and password
        Scanner input = new Scanner(System.in);

        // boolean login = false;
        // int percobaan = 0;
        // String username = "sarah";
        // String password = "123";

        // while (!login && percobaan < 3) {
        //     System.out.print("Masukkan username : ");
        //     username = input.nextLine();

        //     System.out.print("Masukkan password : ");
        //     password = input.next();

        //     if (username.equals("sarah") && password.equals("123")) {
        //         System.out.println("Login berhasil!");
        //         login = true;
        //     } else {
        //         System.out.println("Login gagal! Silahkan coba lagi.");
        //         System.out.println("..........................................");
        //     }
        //     percobaan++;
        // }

        int pilihan;

        do {
            System.out.println("\n....................");
            System.out.println("Menu");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Cek Mutasi");
            System.out.println("3. Transfer");
            System.out.println("4. Keluar");
            System.out.println("....................");

            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();

            switch (pilihan) {
            case 1:
                System.out.println("Saldo anda sebesar Rp. 100.000");
                break;
                
            case 2:
                System.out.println("Mutasi anda sebesar Rp. 100.000");
                break;
                
            case 3:
                System.out.println("Transfer ke rekening 1234567890 sebesar Rp. 100.000");
                break;
                
            case 4:
                System.out.println("Terima kasih");
                break;
                
            default:
                System.out.println("Pilihan salah");
        }

        } while (pilihan != 4);

        input.close();

    }
    
}
