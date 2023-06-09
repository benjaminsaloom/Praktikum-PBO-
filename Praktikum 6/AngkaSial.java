/*
Nama File 	: AngkaSial.java
Pembuat		: Benjamin Franklin Saloom Sipayung - 24060121130047
Deskripsi 	: Program untuk demo asersi, yang akan menolak input
				jari-jari lingkaran yang bernilai nol
*/

public class AngkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException{
	if(angka==13){
		throw new AngkaSialException();
	}
	System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}
		catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}