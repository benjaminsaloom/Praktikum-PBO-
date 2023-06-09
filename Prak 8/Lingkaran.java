/**
 * Nama file : Lingkaran.java
 * Penulis   : Benjamin Franklin Saloom Sipayung
 * NIM       : 24060121130047
 * Deskripsi : implementasi lingkaran sebagai bangundatar
 * Tanggal   : 07-06-2023
 */
public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2 *jejari*3.14;
    }
}
