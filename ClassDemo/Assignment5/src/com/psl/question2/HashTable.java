package com.psl.question2;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTable {
	static Scanner s = new Scanner(System.in);

	Hashtable<String, String> hashContainer = new Hashtable<String, String>();

	private void addProduct(Product p) {
		// TODO Auto-generated method stub

		hashContainer.put(p.getProductId(), p.getProductName());
	}

	private void displayProduct() {
		// TODO Auto-generated method stub

		System.out.println(hashContainer);

	}

	public void search() {

		System.out.println("Enter the name you want to search");
		String str = s.next();

		if (hashContainer.containsValue(str)) {
			System.out.println("Found " + str);
		}

		else
			System.out.println("Product not found");
	}

	public void deleteProduct() {
		// TODO Auto-generated method stub

		String key;
		System.out.println("Enter the product id which you want to delete");
		key = s.next();

		if (hashContainer.containsKey(key)) {
			hashContainer.remove(key);
			System.out.println("Item Deleted");

		} else
			System.out.println("Product Id not found ");

	}

	public static void main(String[] args) {

		Product p = new Product();
		HashTable h = new HashTable();

		ProductData c[] = ProductData.values();

		for (int i = 0; i < c.length; i++) {

			System.out.println(c[i]);
			p.setProductName(c[i].toString());

			p.setProductId(c[i].val);

			h.addProduct(p);

			// System.out.println(c[i].());
		}

		h.displayProduct();
		h.search();
		h.deleteProduct();
		h.search();
		h.displayProduct();

	}

}
