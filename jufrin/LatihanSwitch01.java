package jufrin;

import java.util.Scanner;

public class LatihanSwitch01 {
    public static void main(String[] args) {
        System.out.print("Masukan Sebuah Perintah = ");
        Scanner masukan = new Scanner(System.in) ;
        String game = masukan.nextLine();

        switch (game){
            case "start" :
                System.out.println("game telah mulai");
                break;
            case "stop" :
                System.out.println("game telah selesai");
                break;

            default:
                System.out.println("silahkan ketik ulang start/stop");


        }

    }

}
