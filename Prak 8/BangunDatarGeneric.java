/**
 * Nama file : BangunDatarGeneric.java
 * Penulis   : Benjamin Franklin Saloom Sipayung
 * NIM       : 24060121130047
 * Deskripsi : kelas konstruksi generic untuk bangundatar
 * Tanggal   : 07-06-2023
 */
public class BangunDatarGeneric<T2 extends BangunDatar> {
    private T2 bangunDatar;

    public void set(T2 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T2 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

// JIka Mengubah karakter 'T' menjadi 'T2' atau karakter lain di dalam kelas BangunDatarGeneric, kode tersebut akan tetap berjalan tanpa masalah. 
//Karakter yang digunakan hanya sebagai nama variabel saja