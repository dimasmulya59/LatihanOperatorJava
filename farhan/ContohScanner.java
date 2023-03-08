package farhan;

import java.util.Scanner;

public class ContohScanner {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
       
        System.out.print("Masukkan Nama Anda = " );
        String nama = key.nextLine();

        System.out.print("Masukkan Angka = " );
        int umur = key.nextInt();
        
        System.out.println("Itulah Nama Anda = " + nama);
        System.out.println("Itulah Umur Anda = " + umur + "tahun");

    }
    
}
