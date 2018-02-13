package com.psl.medicinestore;

public class TestMedicine {

	public static void main(String args[]) {
		int rand;
		Medicine objs[] = new Medicine[10];

		for (int i = 0; i < 10; i++) {

			rand = 1 + (int) (Math.random() * 3);
			switch (rand) {
			case 1:
				objs[i] = new Tablet("ABC","GOA");
				objs[i].displayLabel();
				break;
			case 2:
				objs[i] = new Syrup("XYZ","PUNE");
				objs[i].displayLabel();

				break;
			case 3:
				objs[i] = new Ointment("PQR","MUMBAI");
				objs[i].displayLabel();
				break;

			}
		}

	}

}
