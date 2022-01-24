

public class caraMatrix {
    public static void main(String[] args) throws Exception {
    int nilaisukupertama = 10;
    int selisih = 5;
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
    }
    
}
