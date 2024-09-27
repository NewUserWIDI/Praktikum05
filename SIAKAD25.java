import java.util.Scanner;
/** 
 * siakad25
*/
public class SIAKAD25{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String nama,nim;
         char kelas;
         byte absen;
         double nilaikuis,nilaitugas,nilaiujian,nilaiakhir;
         //Data diri mahasiswa
         System.out.println("--------DATA DIRI MAHASISWA-------");
         System.out.println("Masukkan Nama\t\t: ");
         nama = sc.nextLine();
         System.out.print("Masukkan nim\t\t: ");
         nim = sc.nextLine();
         System.out.print("Masukkan kelas \t\t: ");
         kelas = sc.nextLine().charAt(0);
         System.out.print("Masukkan nomor absen\t\t: ");
         absen = sc.nextByte();

         //nilai Mahasiswa
         System.out.println("---------NILAI MAHASISWA----------");
         System.out.print("Masukkan nilai kuis\t: ");
         nilaikuis = sc.nextDouble();
         System.out.print("Masukkan nilai tugas\t: ");
         nilaitugas = sc.nextDouble();
         System.out.print("Masukkan nilai ujian\t: ");
         nilaiujian = sc.nextDouble();

         System.out.println("------------MAKA---------");
         nilaiakhir = (nilaikuis+nilaitugas+nilaiujian)/3;
         System.out.println("Mahasiswa dengan nama "+nama+" NIM "+ nim + " Kelas = "+ kelas +" No.absen = "+absen);
         String nilaihuruf,kualifikasi;
         double nilaisetara;

         if(80 < nilaiakhir && nilaiakhir <= 100) {
            nilaihuruf = "A" ;
            nilaisetara = 4.0;
            kualifikasi = "Sangat Baik";
         } else if (73 < nilaiakhir && nilaiakhir <= 80) {
            nilaihuruf = "B+";
            nilaisetara = 3.5;
            kualifikasi = "Lebih dari Baik";
         } else if (65 < nilaiakhir && nilaiakhir <= 73){
            nilaihuruf = "B";
            nilaisetara = 3.0;
            kualifikasi = "Baik";
         } else if (60 < nilaiakhir && nilaiakhir <= 65){
            nilaihuruf = "C+";
            nilaisetara = 2.5;
            kualifikasi = "Lebih dari cukup";
         } else if (50 < nilaiakhir && nilaiakhir <= 60){
            nilaihuruf = "C";
            nilaisetara = 2.0;
            kualifikasi= "Cukup";
        } else if (39 < nilaiakhir && nilaiakhir <= 50){
            nilaihuruf = "D";
            nilaisetara = 1.0;
            kualifikasi = "Kurang";
        } else {
            nilaihuruf = "E";
            nilaisetara = 0.0;
            kualifikasi = "Gagal";

        }
        System.out.println("Nilai Huruf\t\t: "+nilaihuruf);
        System.out.println("Nilai Setara\t\t: "+nilaisetara);
        System.out.println("Kualifikasi\t\t: "+kualifikasi);

        sc.close();
}
    }
        