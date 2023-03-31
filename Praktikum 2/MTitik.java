/*
Nama File 	: MTitik.java
Pembuat		: Benjamin Franklin Saloom Sipayung - 24060121130047
Tanggal		: Rabu, 1 Maret 2023
*/

class MTitik{
	public static void main(String[] args){
		Titik t1 = new Titik();
		t1.setAbsis(3.0);
		t1.setOrdinat(4.0);
				
		Titik t2 = new Titik();
		t2.setAbsis(7.0);
		t2.setOrdinat(9.0);
				
		Titik t3 = new Titik(5.0, 6.0);				
		//t3.setAbsis(5.0);
		//t3.setOrdinat(6.0);
				
		System.out.println("Jumlah objek titik : " + (int) Titik.counterTitik());
		System.out.println("t1("+t1.getAbsis()+", " + t1.getOrdinat()+")");
		System.out.println("t2("+t2.getAbsis()+", " + t2.getOrdinat()+")");
		System.out.println("t3("+t3.getAbsis()+", " + t3.getOrdinat()+")");

		OperasiTitik op = new OperasiTitik();
		op.refleksiSumbuX(t1);
		System.out.println("t1.x setelah refleksi X = "+ t1.absis);
		System.out.println("t1.y setelah refleksi X = "+ t1.ordinat);		
	}
}