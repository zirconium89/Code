package meet_3.Teori;

public class Main {
    public static void main(String[] args) {
        // Literal expression
        // int quantity = 10;

        // Aritmethic expression
        // int hasil = 10 + 5 * 2;

        // Relational expression
        // boolean isTrue = 10 > 5; // cara bacanya: "apakah nilai ini benar?"

        // Logical expression 
        // boolean isValid = (10 < 5) && (10 > 5); // And itu kedua kondisinya harus benar (true) --> real case di Login
        // boolean isValid = (10 < 5) || (10 > 5); // Or itu salah satu kondisinya harus benar (true) --> real case nya di role pengguna
        // boolean isValid = (10 < 5) || (10 > 5); // Or itu salah satu kondisinya harus benar (true) --> real case nya di role pengguna

        // if statement

        int nilai = 60;

        if(nilai >= 75){
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }

        double nilai2 = 81.00;

        if (nilai2 >= 90) {
            System.out.println("A");
        } else if (nilai2 >= 80) {
            System.out.println("B");
        } else if (nilai2 >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        // Nested If
        int umur = 45;
        boolean punyaKTP = false; // true / false

        if (umur >= 17) {
            // if (punyaKTP) {
            //     System.out.println("BOLEH MEMILIH");
            // } else {
            //     System.out.println("BELUM PUNYA KTP");
            // }
            String isValid = punyaKTP ? "Boleh Ikut Pemilu" : "Belum Boleh Ikut Pemilu";
            System.out.println(isValid);
        } else {
            System.out.println("BELUM CUKUP UMUR");
        }

        // Switch Case
        int hari = 2;

        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            default:
                System.out.println("Hari yang kamu maksud, ngga ada cuy!");
                break;
        }

        // Switch expression

        hari = 4;

        String day = switch (hari) {
            case 1 -> "Senin";
            case 2 -> "Selasa";
            default -> "Tidak Valid";
        };
        System.out.println(day);

        
        // Ternary Operator 
        String nilai3 = nilai2 > 90 ? "A" : 
        nilai2 > 80 ? "B" : 
        nilai2 > 70 ? "C" : "D";

        System.out.println(nilai3);


    }
}
