package javadersleri.ders3;

import java.util.Scanner;

public class While_ile_Kullan�c�_Giris {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int giris_hakki = 3;
		String sys_kullanici_adi = "Serdarhan Dikmen ";
		String sys_parola = "123Dikmen123";

		System.out.println("***************************");
		System.out.println("Ho�geldiniz");
		System.out.println("***************************");
		while (true) {

			System.out.println("Kullan�c� Ad�n�z� Giriniz : ");
			String kullanici = scanner.nextLine();
			System.out.println("Parolan��z Giriniz : ");
			String parola = scanner.nextLine();

			if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
				System.out.println("Ho�geldiniz " + kullanici);
				break;
			} else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
				System.out.println("Parolan�z Yanl�� ! ");
				giris_hakki -= 1;
				System.out.println("Giri� Hakk�n�z " + giris_hakki);
				break;
			} else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
				System.out.println("Kullan�c� Ad�n�z  Yanl�� ! ");
				giris_hakki -= 1;
				break;
			} else {
				System.out.println("Kullan�c� Ad�n�z ve Parolan�z Yanl�� ! ");
				giris_hakki -= 1;
				System.out.println("Giri� Hakk�n�z " + giris_hakki);

			}
			if (giris_hakki == 0) {
				System.out.println("Giri� Hakk�n�z Bitti L�tfen Daha Sonra Tekrar Deneyiniz !");
				break;
			}
		}
	}
}
