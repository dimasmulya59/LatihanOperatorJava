package jufrin;

import java.util.Scanner;

public class PengulanganWhileDo {
    public static void main(String[] args) {
        Scanner kacangmede = new Scanner(System.in);

        int ver = 0;
        do {
            System.out.print("MASUKAN ANGKA KACANG =");
            ver = kacangmede.nextInt();
        }
        while( ver != 10); {
            System.out.println("YOYOYOYOYOYOY KACANG KUUU");
        }
    }
}
