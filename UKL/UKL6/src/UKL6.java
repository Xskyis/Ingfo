public class UKL6 {
    public static void main(String[] args) throws Exception {
        int A[][]={{2,3},{3,1}};
        int B[][]={{5},{1}};
        int H[][]={{0},{0}};
        
        for(int i=0;i<2;i++){
        for(int j=0;j<1;j++){
        for(int k=0;k<2;k++){
           H[i][j]=H[i][j]+A[i][k]*B[k][j];
        
        } 
        
     }
        }
    for(int i=0;i<2;i++){
 for(int j=0;j<1;j++){
 System.out.print(H[i][j]+"\t");
 System.out.print(H[i][j]+"\t");

 }
 System.out.println();
    }
    }
}
