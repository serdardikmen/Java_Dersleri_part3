package javadersleri.ders3;

import java.util.Scanner;

public class While_ATM {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int bakiye = 1000;
		String islemler = "1.��lem : Bakiye Sorgulama\n" + "2.��lem Para �ekme \n" + "3.��lem Para Yat�rma \n"
				+ "��k�� ��in q'a Bas�n";
		System.out.println("****************************************");
		System.out.println(islemler);
		System.out.println("****************************************");

		while (true) {

			System.out.println("��lemi Se�iniz...");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {

				System.out.println("Programdan ��k�l�yor...");
				break;
			} else if (islem.equals("1")) {
				System.out.println("Bakiyeniz " + bakiye);

			} else if (islem.equals("2")) {
				System.out.println("�ekmek �stede�iniz Tutar : ");
				int tutar = scanner.nextInt();
				scanner.nextLine();

				if (bakiye - tutar < 0) {
				System.out.println("Yeterli Bakiyeniz Yok. Bakiyeniz: " + bakiye);

				} else {
				bakiye -= tutar;
				System.out.println("Yeni Bakiyeniz : " + bakiye);
				}
			} else if (islem.equals("3")) {
				System.out.println("Yat�rmak �stedi�iniz Tutar : ");
				int tutar = scanner.nextInt();
				scanner.nextLine();

				bakiye += tutar;

				System.out.println("Yeni BAkiyeniz  :" + bakiye);

			} else {
				System.out.println("Ge�ersiz ��lem !");
			}

		}

	}
}
