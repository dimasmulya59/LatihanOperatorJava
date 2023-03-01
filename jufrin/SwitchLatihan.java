package jufrin;

import java.util.Scanner;

public class SwitchLatihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan kata : ");
        String lord = input.nextLine();

        switch (lord){
            case "mulai" :
                System.out.println("lari...........");
                break;
            case "stop" :
                System.out.println("stop lariii.......");
                break;
            default:
                System.out.println("bukan sesuaii ..tulis perintah mulai/stop");







        }
    }
}
