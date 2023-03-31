// Nama: Benjamin Franklin Saloom Sipayung
// NIM : 24060121130047

class Titik {
		double absis;
		double ordinat;
		static int counterTitik;
		
		Titik(){
			absis =0.0;
			ordinat= 0.0;
			counterTitik ++;
		}	
		
		Titik(double a, double o){
			absis = a;
			ordinat= o;
			counterTitik ++;
		}	
		void setAbsis (double a) {
			absis = a;
			}
			
		void setOrdinat (double o) {
			ordinat = o;
			}
		
		double getAbsis() {
			return absis;
			}
			
		double getOrdinat() {
			return ordinat;
			}
			
		static double counterTitik(){
			return counterTitik;
			}	
}