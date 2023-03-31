/*
Nama File 	: MLingkaran.java
Pembuat		: Benjamin Franklin Saloom Sipayung - 24060121130047
Deskripsi 	: File implementasi cara menghitung luas lingkaran
*/

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari lingkaran: ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari "+ jejari + " satuan adalah " + l.hitungLuas());
    }
}