package javadersleri.ders3;

import java.util.Scanner;

public class Faiz_hesaplama {

	public static void main (String [] args ) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bankam�za Ho�geldiniz Faiz Oran�m�z %6");
		//ikiside �nt de�er oldu�u i�in Virg�lle ikisinide tan�mlayabiliriz.
		int anapara,vade;
		System.out.println("Yat�rmak �stedi�iniz Tutar " );
		anapara = scanner.nextInt();
		System.out.println("Paran�z� Ka� Y�l Vadeli Yat�rmak �stiyorsunuz ? ");
		vade = scanner.nextInt();
		
		double toplampara = anapara;
		double faizOrani = 0.06;
		
		for (int i =1;  i <=vade; i++) {
			
			toplampara = ((toplampara * faizOrani) + toplampara);
			
			System.out.println(i + ".Y�l�n Sonunda Toplam Para " + (int)toplampara);
		}
		
		
		
		
	}
}
