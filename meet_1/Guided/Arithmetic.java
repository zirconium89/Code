package meet_1.Guided;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.printf("Hasil penjumlahan: %.2f" , (angka1 + angka2));
            System.out.println();
        System.out.printf("Hasil pengurangan: %.2f" , (angka1 - angka2));
            System.out.println();
        System.out.printf("Hasil perkalian: %.2f" , (angka1 * angka2));
            System.out.println();
        System.out.printf("Hasil pembagian: %.2f" , (angka1 / angka2));
            System.out.println();

    input.close();
    }
    

    
}
