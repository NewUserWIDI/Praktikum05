import java.util.Scanner;

public class pemilihanbilangan25{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();

        if (angka % 2 == 0){
            System.out.println("Angka" + angka + angka + "termasuk bilangan genap");
        }
        else
        {
            System.out.println("Angka " + angka + "termasuk bilangan ganjil");
        }




    }



}



    