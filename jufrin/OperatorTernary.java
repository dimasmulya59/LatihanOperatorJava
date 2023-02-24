package jufrin;

import java.util.Scanner;

public class OperatorTernary {
    public static void main(String[] args) {
        int umur;
        int tinggi;
        String hobi,warna;
        Scanner linkstar = new Scanner(System.in);
        System.out.println("masukan umur = ");
        umur = linkstar.nextInt();
        System.out.println("masukan tinggi =");
        tinggi = linkstar.nextInt();

        hobi = umur %2 ==0 ? "kacangpolong" :"kacangtanah" ;
        warna = tinggi %2==0 ? "kacangasin" : "kacangmanis" ;

        System.out.println("umur anda    = " + umur +"Tahun");
        System.out.println("tinggi anda  = "+ tinggi+"Cm");
        System.out.println("hobi anda    = " +hobi);
        System.out.println("warna        = " +warna);







    }
}
