import java.util.Scanner;;
public class UKL7  {
    public static void main(String[] args) throws Exception {
    Scanner inputuser = new Scanner(System.in);
    //
    int harga = 0,totbayar = 0,jumlah, air = 1, bayaran = 1;
    int id = 0;
    //
    System.out.println("~ID & NAMA PELANGGAN~ : ");
    System.out.println("1.Dina");
    System.out.println("2.Kiki");
    System.out.println("3.Robby");
    System.out.println("4.Fatwa");
    System.out.println("5.Ulya");
    //
    System.out.print("Masukan Nomor ID Anda                              = ");
    id = inputuser.nextInt();
    if (id == 1){System.out.println("Nama Anda = Dina");
}else if (id == 2){System.out.println("Nama Anda = Kiki");
}else if (id == 3){System.out.println("Nama Anda = Robby");
}else if (id == 4){System.out.println("Nama Anda = Fatwa");
}else  {System.out.println("Ulya");
    }
    System.out.print("Masukan Jumlah pemakaian air anda (M3)             = ");
    air = inputuser.nextInt();
    //
    
    

    switch (air) {
        case 1: 
        if (air <=10 && air >=1){
            harga = 5000;
        totbayar = harga * air;
        break;
        }

        case 2:
        if (air >=11 && air <=20){
            harga = 6000;
        totbayar = harga * air;
        break;
        } 
    
        case 3: 
        if (air >=21 && air <=30){
            harga = 7000;
        totbayar = harga * air;
        break;
        }

        case 4:
        if (air >=31) {
            harga = 8000;
        totbayar = harga * air;
        break;
        }


    }
    System.out.println ("Silahkan Membayar Sebesar                            =Rp."+totbayar);
    }
}
