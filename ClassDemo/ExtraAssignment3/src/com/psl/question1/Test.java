package com.psl.question1;

import java.util.Scanner;

public class Test {
	static Service obj[] = new Service[20];
	static int k = 0;

	public static float calculateCost(Service[] s, int k, int ip) {
		float sum = 0;

		for (int x = k - ip; x < k; x++)
			sum = sum + s[x].charges;

		return sum + 0.15f * sum;
	}

	public static void main(String[] args) {

		int ip[] = new int[3];
		int maxUser = 0, j;
		int maxk = 0;

		float max = 0, sum;
		Test t = new Test();

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			sum = 0;
			System.out.println("How many services do you want to avail?");
			ip[i] = s.nextInt();

			for (j = 0; j < ip[i]; j++) {

				String str = s.next();
				obj[k] = new Service(str);
				obj[k].init(str);
				k++;

			}

			sum = calculateCost(obj, k, ip[i]);

			if (sum > max) {
				max = sum;
				maxUser = i;
				maxk = k - ip[i];
			}

		}

		// maxuser details

		for (int k1 = maxk; k1 < maxk + ip[maxUser]; k1++)
			System.out.println(" Services availed are :" + obj[k1].serviceName
					+ " " + obj[k1].charges);

		System.out.println(" Max amount is " + max + "and Max user is "
				+ (maxUser + 1));
	}

}
