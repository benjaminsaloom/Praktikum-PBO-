/*
Nama File 	: BangunDatar.java
Pembuat		: Benjamin Franklin Saloom Sipayung - 24060121130047
Deskripsi 	: kelas abstrak, berisi abstraksi bangun datar
*/

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}