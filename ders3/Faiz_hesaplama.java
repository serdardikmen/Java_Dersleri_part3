package javadersleri.ders3;

import java.util.Scanner;

public class Faiz_hesaplama {

	public static void main (String [] args ) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bankamýza Hoþgeldiniz Faiz Oranýmýz %6");
		//ikiside Ýnt deðer olduðu için Virgülle ikisinide tanýmlayabiliriz.
		int anapara,vade;
		System.out.println("Yatýrmak Ýstediðiniz Tutar " );
		anapara = scanner.nextInt();
		System.out.println("Paranýzý Kaç Yýl Vadeli Yatýrmak Ýstiyorsunuz ? ");
		vade = scanner.nextInt();
		
		double toplampara = anapara;
		double faizOrani = 0.06;
		
		for (int i =1;  i <=vade; i++) {
			
			toplampara = ((toplampara * faizOrani) + toplampara);
			
			System.out.println(i + ".Yýlýn Sonunda Toplam Para " + (int)toplampara);
		}
		
		
		
		
	}
}
