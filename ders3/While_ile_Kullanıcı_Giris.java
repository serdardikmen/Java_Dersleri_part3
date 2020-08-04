package javadersleri.ders3;

import java.util.Scanner;

public class While_ile_Kullanýcý_Giris {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int giris_hakki = 3;
		String sys_kullanici_adi = "Serdarhan Dikmen ";
		String sys_parola = "123Dikmen123";

		System.out.println("***************************");
		System.out.println("Hoþgeldiniz");
		System.out.println("***************************");
		while (true) {

			System.out.println("Kullanýcý Adýnýzý Giriniz : ");
			String kullanici = scanner.nextLine();
			System.out.println("Parolanýýz Giriniz : ");
			String parola = scanner.nextLine();

			if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
				System.out.println("Hoþgeldiniz " + kullanici);
				break;
			} else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
				System.out.println("Parolanýz Yanlýþ ! ");
				giris_hakki -= 1;
				System.out.println("Giriþ Hakkýnýz " + giris_hakki);
				break;
			} else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
				System.out.println("Kullanýcý Adýnýz  Yanlýþ ! ");
				giris_hakki -= 1;
				break;
			} else {
				System.out.println("Kullanýcý Adýnýz ve Parolanýz Yanlýþ ! ");
				giris_hakki -= 1;
				System.out.println("Giriþ Hakkýnýz " + giris_hakki);

			}
			if (giris_hakki == 0) {
				System.out.println("Giriþ Hakkýnýz Bitti Lütfen Daha Sonra Tekrar Deneyiniz !");
				break;
			}
		}
	}
}
