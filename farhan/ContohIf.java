 package farhan;

import java.util.Scanner;

public class ContohIf{
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Masukkan Umur Anda = " );
        int umur = key.nextInt();

        if(umur > 18){
            System.out.println("Dewasa" );
        } else if (umur < 18){
            System.out.println("Masih kecil  ");
        }

      //  System.out.println("Itu Umur Anda = " + umur);



      
    }
}