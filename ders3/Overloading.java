package javadersleri.ders3;

		public class Overloading {
		public static void skorhesapla (String isim,int puan) {
		
		System.out.println(isim  + " isim adl� oyuncunun " + puan + " puan� var");
		}
	
	
		public static void skorhesapla(int puan) {
		System.out.println("�simisz Oyuncunun " + puan + " puan� var"); 
		
		}
		public static void skorhesapla (String isim) {
		System.out.println(isim + " adl� oyuncunun hi� puan� yok "); 
		
		}
		public static void main (String [] args) {
			
			
	
		skorhesapla("Serdar" ,1000);
		skorhesapla("Mehmet");
		skorhesapla(900);
		}
	}