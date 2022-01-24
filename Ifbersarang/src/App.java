
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    String daftar = "Sudah";
    int diskon = 0;
    int SPP;
    int TotalSPP;
    //
    Scanner inputuser = new Scanner(System.in);
    //
    System.out.print("apakah anda Sudah Mendaftar?");
    daftar = inputuser.nextLine();
    //
    if (daftar.equalsIgnoreCase("Belum")) {
        System.out.print("Silahkan Mendaftar Terlebih Dahulu");
        System.out.print("apakah anda Sudah Mendaftar?");
        daftar = inputuser.nextLine();
    }
    {if (daftar.equalsIgnoreCase("Sudah")) 
        System.out.print("Bayar SPP senilai = ");
        SPP=inputuser.nextInt();
    //
    {if (SPP>=500000){diskon = 100000;
    } else if
    (SPP>=1000000){diskon = 300000;
    }else {
    System.out.println("tidak mendapat diskon");}}
    

    {TotalSPP = SPP - diskon;
    System.out.println("Total SPP Setelah Diskon = "+TotalSPP);}

    
    }
}
    }


    

    

    
    

        
    

