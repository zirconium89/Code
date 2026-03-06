package meet_2.Unguided;

public class MultilevelWarehouseStockData {
    public static void main(String[] args) {
        
        String[][][] warehouseStockData = {
            {
                {"Borgol", "tongkat Porli"},
                {"Pistol", "Rompi Anti Peluru"},
                {"Peluru Karet", "Gas Air Mata"}
            }, // Gedung 1

            {
                {"Mobil Water Canon", "Peluru Tajam"},
                {"Mobil Patroli", "Sepeda Motor"},
                {"Pisau", "Linggis"}
            } // Gedung 2
        };

        System.out.println("Isi Gedung dua di lantai 1: " + warehouseStockData[1][0][0]);
    }
    
}
