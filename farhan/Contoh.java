package farhan;

import java.util.Scanner;

public class Contoh {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda = " );
        String nama = key.nextLine();

        System.out.print("Masukkan Umur Anda = " );
        int umur = key.nextInt();

        System.out.print("Masukkan Tinggi Badan Anda = " );
        int tB = key.nextInt();

        String hobbi;
        hobbi = umur % 2 == 0 ? "Nonton" : "Main";

        String kesukaan;
        kesukaan = tB % 2 != 0 ? "Makan" : "Tidur";

        System.out.println("Nama anda adalah = " + nama);
        System.out.println("Umur Anda Adalah = " + umur + "Tahun");
        System.out.println("Itulah Hobbi Anda = " + hobbi );
        System.out.println("Itulah Kesukaan Anda = " + kesukaan);

    }
    
}
