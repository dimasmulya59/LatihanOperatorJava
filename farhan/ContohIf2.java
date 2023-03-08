package farhan;

import java.util.Scanner;

public class ContohIf2 {
    public static void main(String[] args) {
      Scanner ha = new Scanner(System.in);
        System.out.print("Masukkan Angka bebas = " );
        int angka = ha.nextInt();

        if(angka < 10 ){  
          System.out.println("Itu adalah bilangan kecil ");
         }else if (angka < 100) {  
          System.out.println("Itu adalah bilangan puluhan ");
        } else if (angka < 1000) {
          System.out.println("Itu adalah bilangan Ratusan ");
        } else {
          System.out.println("Itu adalah bilangan Ribuan ");
        }


         }
    }
    




//    for(int i=10;i>=1;i-=3){
      //   System.out.print(" " + i);
   


//      Scanner key = new Scanner(System.in);
    //    System.out.print("Masukkan Angka = " );
      //  int angka = key.nextInt();

        //for(int i=1;i<=angka;i--) { 
          //  for(int j = i;j>1;i--){
            //    System.out.print("* ");
            //} 
         //System.out.println("Itu adalah angka = " + i);
        //}