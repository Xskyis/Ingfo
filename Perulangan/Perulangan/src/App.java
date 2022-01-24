import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner inputuser = new Scanner(System.in);
    //
    int makanan;
    int harga = 0,totbayar = 0,jumlah;
    //
    System.out.println("Menu Makanan");
    System.out.println("1.Mie Ayam Rp.5000");
    System.out.println("2.Rujak    Rp.7000");
    System.out.println("3.Pecel    Rp.6000");
    //
    System.out.print("Masukan Angka Makanan yang dipesan = ");
    makanan = inputuser.nextInt();
    System.out.print("Masukan Jumlah Makanan             = ");
    jumlah = inputuser.nextInt();
    //
    switch (makanan) {
        case 1: 
        System.out.println("Makanan yang anda pesan Berjumlah   = "+makanan);
        System.out.println("Jumlah maknan yang dipesan          = "+jumlah);
        harga = 5000;
        totbayar = harga * jumlah;
        break;
        
        case 2: 
        System.out.println("Makanan yang anda pesan    = "+makanan);
        System.out.println("Jumlah maknan yang dipesan = "+jumlah);
        harga = 7000;
        totbayar = harga * jumlah;
        break;

        case 3: 
        System.out.println("Makanan yang anda pesan    = "+makanan);
        System.out.println("Jumlah maknan yang dipesan = "+jumlah);
        harga = 6000;
        totbayar = harga * jumlah;
        break;

        default : System.out.println("Terimakasih Atas Kunjungan Anda");

    }
    JOptionPane.showMessageDialog(null,"Silahkan Membayar Sebesar :Rp."+totbayar);

 }  
}

