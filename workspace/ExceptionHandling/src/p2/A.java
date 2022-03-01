package p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class A {

	public static void main(String[] args) throws FileNotFoundException {
		f1();
		f2();
	}

	private static void f2() throws FileNotFoundException {

		FileReader fr = new FileReader(new File("abc.txt")); // 0.1 % chances FNFE will come compiler gives an error

	}

	private static void f1() {

		int b = 0;
		if (b != 0) {
			int x = 10 / b; // 100 % Guaranty ArithmeticException will come but no error
			System.out.println(x);
		}
		

	}

}
