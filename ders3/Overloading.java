package javadersleri.ders3;

		public class Overloading {
		public static void skorhesapla (String isim,int puan) {
		
		System.out.println(isim  + " isim adlý oyuncunun " + puan + " puaný var");
		}
	
	
		public static void skorhesapla(int puan) {
		System.out.println("Ýsimisz Oyuncunun " + puan + " puaný var"); 
		
		}
		public static void skorhesapla (String isim) {
		System.out.println(isim + " adlý oyuncunun hiç puaný yok "); 
		
		}
		public static void main (String [] args) {
			
			
	
		skorhesapla("Serdar" ,1000);
		skorhesapla("Mehmet");
		skorhesapla(900);
		}
	}