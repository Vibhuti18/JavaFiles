package com.psl.combinations;

public class NumberCombinations {

	private String input, output[];

	public NumberCombinations() {
		// TODO Auto-generated constructor stub

	}

	public String Swap(String input, int i, int j) {

		char temp;
		char[] chararray = input.toCharArray();
		temp = chararray[i];
		chararray[i] = chararray[j];
		chararray[j] = temp;

		return String.valueOf(chararray);

	}

	public void Combinations(String input, int l, int h) {

		if (l == h)
			System.out.println(input);
		else
			for (int i = l; i <= h; i++) {
				input = Swap(input, l, i);
				Combinations(input, l + 1, h);
				input = Swap(input, l, i);
			}

		// return output;

	}

	public static void main(String args[]) {
		String p1 = "123";
		int l = p1.length();
		NumberCombinations p = new NumberCombinations();
		p.Combinations(p1, 0, l - 1);

	}

}
