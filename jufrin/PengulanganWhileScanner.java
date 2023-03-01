package jufrin;

import java.util.Scanner;

public class PengulanganWhileScanner {
    public static void main(String[] args) {
        Scanner kacang =new Scanner(System.in);

        System.out.print("Masukan Angka : ");
        int kacangamanis = kacang.nextInt();
        while ( kacangamanis != 0){
            kacangamanis = kacang.nextInt();

            System.out.print("masukan lagi = ");
        }

    }
}
