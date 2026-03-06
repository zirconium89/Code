package meet_2.Unguided;

public class studentGradeData {
    public static void main(String[] args) {
        int[][] nilaiMahasiswa = {
            {75, 80, 85},
            {86, 83, 87},
            {90, 95, 96}
        };

        System.out.println("Nilai Fisika Prabowo: " + nilaiMahasiswa[0][0]);
        System.out.println("Nilai Biologi Prabowo: " + nilaiMahasiswa[0][1]);
        System.out.println("Nilai Matematika Prabowo: " + nilaiMahasiswa[0][2]);

        System.out.println("Nilai Fisika Jokowi: " + nilaiMahasiswa[1][0]);
        System.out.println("Nilai Biologi Jokowi: " + nilaiMahasiswa[1][1]);
        System.out.println("Nilai Matematika Jokowi: " + nilaiMahasiswa[1][2]);

        System.out.println("Nilai Fisika Gibran: " + nilaiMahasiswa[2][0]);
        System.out.println("Nilai Biologi Gibran: " + nilaiMahasiswa[2][1]);
        System.out.println("Nilai Matematika Gibran: " + nilaiMahasiswa[2][2]);

        System.out.println("Nilai Matematika Jokowi: " + nilaiMahasiswa[1][2]);

    }
    
}
