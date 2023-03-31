/*
Nama File 	: Kubus.java
Pembuat		: Benjamin Franklin Saloom Sipayung - 24060121130047
Deskripsi 	: Representasi dari objek kubus
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungVolume(){
		double sisi = permukaan.getPanjangSisi();
		return sisi * sisi * sisi;
	}
	
	public double hitungLuasAlas(){
		double sisi = permukaan.getPanjangSisi();
		return sisi * sisi;
	}
}