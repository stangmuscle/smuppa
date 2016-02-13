package Day1Examples;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FooBarBaz {

	public static void main(String[] args) {
		while (true) {
			int count = 0;
			String x;
			PrintWriter writer = null;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the count");
			try {
				x = sc.next();
				writer = new PrintWriter(new FileWriter("FooBarBaz.txt"));
				if (x.equals("stop")) {
					break;
				} else {
					count = Integer.parseInt(x);
				}
			}

			catch (Exception e) {
				System.out.println("Invalid Input");
			}

			for (int i = 1; i <= count; i++) {
				if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0)
					System.out.println("FooBarBaz");
				else if (i % 3 == 0 && i % 5 == 0)
					System.out.println("FooBar");
				else if (i % 3 == 0 && i % 7 == 0)
					System.out.println("FooBaz");
				else if (i % 5 == 0 && i % 7 == 0)
					System.out.println("BarBaz");
				else if (i % 3 == 0)
					System.out.println("Foo");
				else if (i % 5 == 0)
					System.out.println("Bar");
				else if (i % 7 == 0)
					System.out.println("Baz");
				else
					System.out.println(i);
			}
		}
	}
}