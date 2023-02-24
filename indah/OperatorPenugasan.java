public class OperatorPenugasan {
    public static void main(String[] args) {
        int angka1,angka2,hasil;
        angka1 = 5;
        angka2 = 10;
        
        hasil = angka1 + angka2;
        System.out.println("Hasil Penjumlahan = " + hasil);

        angka1 += angka2;
        System.out.println("Hasil Penjumlahan = " + angka1);

        angka1 -= angka2;
        System.out.println("Hasil Pegurangan = " + angka1);

        angka1 *= angka2;
        System.out.println("Hasil Perkalian = " + angka1);

        angka1 /= angka2;
        System.out.println("Hasil Pembagian = " + angka1);

        angka1 %= angka2;
        System.out.println("Hasil Sisa Bagi = " + angka1);
    }
}