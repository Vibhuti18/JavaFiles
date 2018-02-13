package com.psl.question2;

public class Anagram {

	static char array[] = new char[20];
	static int count[] = new int[20];
	static int size;

	public static int isPresent(char p) {
		int flag = 0;
		int i;
		for (i = 0; i < array.length; i++) {
			if (array[i] == p) {
				flag = 1;
				break;
			}
		}

		if (flag == 1)
			return i;
		else
			return 0;
	}

	public static void main(String args[]) {
		char c;
		int q;
		String p2 = "kostrew", p3 = "tsrkewo";
		String str = p2.toLowerCase(), str1 = p3.toLowerCase();

		size = str.length();
		if (str.length() == str1.length()) {

			for (int i = 0; i < str.length(); i++) {
				c = str.charAt(i);
				q = isPresent(c);
				if (q == 0) {
					array[i] = c;
					count[i] = 1;
				} else {
					count[q]++;
				}

			}

			for (int j = 0; j < str1.length(); j++)

			{
				for (int k = 0; k < array.length; k++) {
					if (str1.charAt(j) == array[k]) {

						count[k] = count[k] - 1;
						// System.out.println("found  "+k+array[k]+" "
						// +count[k]);

					}

				}

			}

			int f = 1;

			for (int ll = 0; ll < count.length; ll++) {
				if (count[ll] != 0) {

					System.out.println(count[ll]);
					f = 0;
					break;
				}
			}

			if (f == 0)
				System.out.println("Not an anagram");
			else
				System.out.println("Anagram");

		}

		else
			System.out.println("Length mismatch :Not an anagram");

	}

}
