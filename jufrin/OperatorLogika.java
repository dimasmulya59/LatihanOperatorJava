package jufrin;

public class OperatorLogika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean logika;

        logika = a && b ;
        System.out.println("HASIL LOGIKA AND = "+logika);
        logika = a || b ;
        System.out.println("HASIL LOGIKA OR  = "+logika);
//        logika = a ! b ;
        System.out.println("HASIL LOGIKA NEG = "+!a);
//        logika = a && b ;
        System.out.println("HASIL LOGIKA NEG = "+!b);




    }
}
