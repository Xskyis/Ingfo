//deklrasi
class Siswa{
String nama;
String kelas;
String jurusan;
int absen;
int tinggi;    
}
public class App {
    public static void main(String[] args) throws Exception {
Siswa siswa1 = new Siswa();
siswa1.nama = "Achmad Nabil Afgareza";
siswa1.kelas = "XRPL2";
siswa1.jurusan = "Rekayasa Perangkat Lunak";
siswa1.absen =1;
siswa1.tinggi =165;
//output
System.out.println(siswa1.nama);
System.out.println(siswa1.kelas);
System.out.println(siswa1.jurusan);
System.out.println(siswa1.absen);
System.out.println(siswa1.tinggi);

    }
}
