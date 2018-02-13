package com.psl.question1;

import java.util.Date;

public class StackClass {
	public final static int maxSize = 2;

	int tos;
	Contact c[];

	public StackClass() {
		// TODO Auto-generated constructor stub

		tos = -1;
		c = new Contact[maxSize];

	}

	public void pop() {

		try {
			if (tos == -1 || c == null) {
				throw new PopException("Stack is empty");
			} else {

				tos--;

			}

		} catch (PopException p) {
			// TODO: handle exception
			p.printStackTrace();
		}

	}

	public void push(Contact c1) {

		try {
			if (tos == maxSize - 1)
				throw new PushException("stack is already full");
			else {

				tos++;
				c[tos] = c1;
				// System.out.println("top of stack is  Push "+tos);

			}

		} catch (PushException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void display() {
		// TODO Auto-generated method stub

		for (int i = tos; i > -1; i--) {

			System.out.println(c[i].firstName + " " + c[i].middleName + " "
					+ c[i].lastName);

		}

	}

	public static void main(String[] args) {

		StackClass obj = new StackClass();
		Contact c1;
		try {
			if (obj != null) {

				c1 = new Contact("Vibhuti", "Vinayak", "Sawant", new Date(18,
						12, 1987), 'F', "vibhutisawant12@gmail.com",
						"0789654123", "9923665544");
				c1.validate();
				obj.push(c1);

				c1 = new Contact("ABC", "XYZ", "wer", new Date(4, 11, 2000),
						'F', "Vi@gmail.com", "7894563210", "7410852096");
				c1.validate();
				obj.push(c1);

				// obj.display();
				// obj.pop();
				// obj.display();

				// obj.pop();
				// obj.pop();

				c1 = new Contact("ABC", "XYZ", "kkk", new Date(4, 11, 2000),
						'F', "Vi@gmail.com", "7894563210", "7410852096");
				c1.validate();
				obj.push(c1);
				// obj.pop();
			}

			else
				throw new PushException("uninitialized stack");
		} catch (PushException e) {
			e.printStackTrace();
		}
	}
}
