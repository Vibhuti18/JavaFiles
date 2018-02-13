package com.psl.question7;

import java.util.ArrayList;
import java.util.List;

public class HundredLakhNumbers {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		long now = System.nanoTime();

		for (int i = 0; i < 100; i++) {
			list.add(i);
		}

		long after = System.nanoTime();

		System.out.println(after - now);

	}

}
