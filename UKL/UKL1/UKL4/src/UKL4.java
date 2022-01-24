public class UKL4 {
    public static void main(String[] args) throws Exception {
        int nilaisukupertama = 5;
        int selisih = 3;
        int sisimatrix = 5;
        int deret = nilaisukupertama;
        int total = 0;
        //jeda
        for(int a=0; a<sisimatrix; a++){
            for(int b=a; b<sisimatrix; b++){
                System.out.print(deret+ "\t");
                
                total +=deret;
                deret +=selisih;
            }
            System.out.println("");
        }
        
        for(int a=0; a<sisimatrix; a++){
            for(int b=0; b<=a; b++){
                System.out.print(deret+ "\t");
                
                total +=deret;
                deret +=selisih;
            }
            System.out.println("");
        }

        System.out.println("Total deret Aritmatika = "+total);  
    }
}
