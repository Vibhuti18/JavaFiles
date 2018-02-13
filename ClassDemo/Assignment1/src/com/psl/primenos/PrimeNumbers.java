package com.psl.primenos;

public class PrimeNumbers {

	private int range[] = new int[20];
	private int high, low, c;
	private int primeNos[] = new int[20];
    private int t;
	public PrimeNumbers(int low, int high) {
		// TODO Auto-generated constructor stub
		c = 0;
		for (int i = low; i <= high; i++) {
			range[c] = i;
			c++;
		}
	}

	public int isPrime(int k) {
		int i, flag = 0;
		for (i = 2; i <= k / 2; ++i) {

			if (k % i == 0) {
				flag = 1;
				break;
			}
		}

		if (flag == 0)
			return k;
		else
			return -1;
	}

	public int[] findPrime(int[] range) {

		int res;
		 t = 0;

		for (int i = 0; i < c + 1; i++) {
			res = isPrime(range[i]);
			if (res == -1)
				continue;
			else {
				primeNos[t] = range[i];
				t++;
			}

		}

		return primeNos;

	}

	public static void main(String args[]) {

		PrimeNumbers obj = new PrimeNumbers(10, 20);

		obj.primeNos = obj.findPrime(obj.range);

		for (int i = 0; i < obj.t-1; i++)
			System.out.println(obj.primeNos[i]);

	}

}
