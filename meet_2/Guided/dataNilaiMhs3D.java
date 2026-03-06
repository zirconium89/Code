package meet_2.Guided;

public class dataNilaiMhs3D {
    public static void main(String[] args) {
        int[][][] nilaiMahasiswa3D = {
            {
                {100, 95},
                {95, 60}
            }, // Lantai 1

            {
                {90, 85},
                {85, 80}
            } // Lantai 2
        };

        System.out.println("Nilai Prabowo: " + nilaiMahasiswa3D[1][0][0]);
        System.out.println("Nilai Gibran: " + nilaiMahasiswa3D[0][1][1]);

    }
    
}
