package tyas;

import java.util.Scanner;

public class ContohScanner1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nama anda= ");
        String nama = input.nextLine();
        System.out.println("Nama Anda= " + nama);
    }
}