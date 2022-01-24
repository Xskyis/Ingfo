public class UKL2 {
    public static void main(String[] args) throws Exception {
            int nilaisukupertama = 6;
            int selisih = 10;
            int baris = 2;
            int kolom = 4;
            int deret = nilaisukupertama;
    
            //jeda
            for(int a=0; a<baris; a++){
                for(int b=0; b<kolom; b++){
                    System.out.print(deret+ "\t");
                    
                    total +=deret;
                    deret +=selisih;
                }
                System.out.println("");
            }    
    }
}
