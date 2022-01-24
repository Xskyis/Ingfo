public class UKL1 {
    public static void main(String[] args) throws Exception {
    //deklarasi
    int nilaisukupertama = 3, selisih = 5;
    int sukuawal = 7;
    int sukuakhir = 15;
    int deret = nilaisukupertama;
    int total = 0;
    //proses
    for(int i = 13; i <= sukuakhir; i++){

        total = total + deret;

        if(i >= sukuawal){   
            System.out.println("Nilai Suku ke - "+ i +" = "+deret);
            
        }
        
        deret += selisih;
    }
    System.out.println("Jumlah suku hingga suku ke-15 = "+total);
 }
 
}
