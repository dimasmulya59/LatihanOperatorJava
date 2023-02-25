package jufrin;

import java.util.Scanner;

public class PemasukanScanner {
    public static void main(String[] args) {
      String nama,almat,perkerjaan,hobi,universitas;
      int umur;
      long nomorhp,noid;
      double tinggi;

        Scanner in = new Scanner(System.in);

        System.out.print("NAMA ANDA        = ");
        nama = in.nextLine();
        System.out.print("ALAMAT ANDA      = ");
        almat = in.nextLine();
        System.out.print("MASUKAN UMUR     = ");
        umur = in.nextInt();
        System.out.print("UNIVERSITAS ANDA = ");
        universitas = in.next();
        System.out.print("MASUKAN NOMOEHP  = ");
        nomorhp = in.nextLong();
        System.out.print("MASUKAN ID       = ");
        noid = in.nextLong();
        System.out.print("MASUKAN TINGGI   = ");
        tinggi = in.nextDouble();
        System.out.print("PERKERJAAN ANDA  = ");
        perkerjaan = in.next();
        hobi = umur% 2==0 ? "CATUR" : "KACANGKU";

        System.out.println("========DATA DIRI=========");
        System.out.println("==========================");

        System.out.println("NAMA ANDA        = " +nama);
        System.out.println("ALAMAT ANDA      = "+ almat);
        System.out.println("UMUR ANDA        = "+umur+"Tahun");
        System.out.println("PERKERJAAN ANDA  = "+perkerjaan);
        System.out.println("HOBI ANDA        = "+hobi);
        System.out.println("UNIVERSITAS ANDA = "+universitas);
        System.out.println("MASUKAN NOMOEHP  = "+nomorhp);
        System.out.println("MASUKAN ID       = "+noid);
        System.out.println("MASUKAN TINGGI   = "+tinggi+ "Cm");

    }
}
