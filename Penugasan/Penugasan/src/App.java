import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner InputUser = new Scanner(System.in);
    int Angka;
    //
    System.out.print("Masukan Angka = ");
    Angka = InputUser.nextInt();
    // 
    System.out.println(Angka+=5);
    System.out.println(Angka-=5);
    System.out.println(Angka*=5);
    System.out.println(Angka/=5);
    System.out.println(Angka%=5);

    }
}
