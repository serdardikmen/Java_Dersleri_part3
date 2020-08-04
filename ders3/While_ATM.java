package javadersleri.ders3;

import java.util.Scanner;

public class While_ATM {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int bakiye = 1000;
		String islemler = "1.Ýþlem : Bakiye Sorgulama\n" + "2.Ýþlem Para Çekme \n" + "3.Ýþlem Para Yatýrma \n"
				+ "Çýkýþ Ýçin q'a Basýn";
		System.out.println("****************************************");
		System.out.println(islemler);
		System.out.println("****************************************");

		while (true) {

			System.out.println("Ýþlemi Seçiniz...");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {

				System.out.println("Programdan Çýkýlýyor...");
				break;
			} else if (islem.equals("1")) {
				System.out.println("Bakiyeniz " + bakiye);

			} else if (islem.equals("2")) {
				System.out.println("Çekmek Ýstedeðiniz Tutar : ");
				int tutar = scanner.nextInt();
				scanner.nextLine();

				if (bakiye - tutar < 0) {
				System.out.println("Yeterli Bakiyeniz Yok. Bakiyeniz: " + bakiye);

				} else {
				bakiye -= tutar;
				System.out.println("Yeni Bakiyeniz : " + bakiye);
				}
			} else if (islem.equals("3")) {
				System.out.println("Yatýrmak Ýstediðiniz Tutar : ");
				int tutar = scanner.nextInt();
				scanner.nextLine();

				bakiye += tutar;

				System.out.println("Yeni BAkiyeniz  :" + bakiye);

			} else {
				System.out.println("Geçersiz Ýþlem !");
			}

		}

	}
}
