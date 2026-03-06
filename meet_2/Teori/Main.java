package meet_2.Teori;

public class Main {
    public static void main(String[] args) {

        //Array satu dimensi
        int[] angka;
        angka = new int[9];

        angka[0] = 1;
        angka[1] = 2;
        angka[3] = 3;
        angka[4] = 5;
        angka[5] = 6;
        angka[6] = 7;
        angka[7] = 8;
        angka[8] = 9;

        System.out.println(angka[5]);

        int[] angka2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(angka2[5]);
        
        // Array dua dimensi
        int[][] angka3;
        angka3 = new int[3][3];

        angka3[0][0] = 1;
        angka3[0][1] = 2;
        angka3[0][2] = 3;

        angka3[1][0] = 4;
        angka3[1][1] = 5;
        angka3[1][2] = 6;

        angka3[2][0] = 7;
        angka3[2][1] = 8;
        angka3[2][2] = 9;

        System.out.println(angka3[2][1]);

        int[][] angka4 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(angka4[1][1]);

        //Array tiga dimensi
        int[][][] tigaDimensi;
        tigaDimensi = new int[3][2][2]; // [gedung berapa lantai],[gedung punya berapa ruang],[didalam ruang ada berapa lemari]

        //jabarkan dulu paling akhir

        //lantai pertama
        tigaDimensi[0][0][0] = 1;
        tigaDimensi[0][0][1] = 2;

        tigaDimensi[0][1][0] = 3;
        tigaDimensi[0][1][1] = 4;

        //lantai kedua
        tigaDimensi[1][0][0] = 5;
        tigaDimensi[1][0][1] = 6;

        tigaDimensi[1][1][0] = 7;
        tigaDimensi[1][1][1] = 8;

        //lantai ketiga
        tigaDimensi[2][0][0] = 9;
        tigaDimensi[2][0][1] = 10;

        tigaDimensi[2][1][0] = 11;
        tigaDimensi[2][1][1] = 12;

        System.out.println(tigaDimensi[2][0][0]);

        int[][][] gedungTigaDimensi = {
            {
                {1,2},
                {3,4}
            }, // Ini lantai 1

            {
                {5,6},
                {7,8}
            }, // Ini lantai 2

            {
                {9,10},
                {11,12}
            } // Ini lantai 3

        };

        System.out.println(gedungTigaDimensi[2][1][1]);



    }
}
