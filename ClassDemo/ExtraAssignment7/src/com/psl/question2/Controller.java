package com.psl.question2;

public class Controller {

	static TechnicalManager t[] = new TechnicalManager[5];

	public void moreThanTen() {
		for (int i = 0; i < t.length; i++) {
			if (t[i].getPromotionsTillDate() > 10)
				System.out.println(" " + t[i].promotionsTillDate);

		}
	}

	public static void main(String[] args) {

		try {
			t[0] = new TechnicalManager(10, "PSLG", 3, 5);
			t[1] = new TechnicalManager(10, "PSLGP", 4, 2);
			t[2] = new TechnicalManager(10, "PSLG", 12, 3);
			t[3] = new TechnicalManager(10, "PSLG", 14, 2);
			t[4] = new TechnicalManager(10, "PSLG", 4, 2);
		} catch (MyCustomException e) {
			e.printStackTrace();
		}
		Controller c = new Controller();
		c.moreThanTen();

	}

}
