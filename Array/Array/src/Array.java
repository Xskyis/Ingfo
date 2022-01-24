import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
    String nama;
    int jmlhbarang;
    //
    Scanner input = new Scanner(System.in);
    String[][] barang = {{"Gula","10000"},{"Garam","5000"},{"Minyak","20000"}};
   
    //
    System.out.print("Ketikan Nama Anda Di sini                  = ");
    nama = input.nextLine();
    //
    System.out.print("Masukan Jumlah barang yang ingin anda beli = ");
    jmlhbarang = input.nextInt();
    
    for (int x=0; x<barang.length;x++){

        System.out.println("Nama Costumer = "+nama);
        System.out.println("Nama Barang   = "+barang[x][0]);
        System.out.println("Harga Barang  = "+barang[x][1]);
        System.out.println("Jumlah Barang = "+jmlhbarang);
        System.out.println("===============================");


    }


    }
}    

