package p4;

public class Abc {

	int x = 10; // member variable

	final void foo() {

		int i = 10; // local variable
		i = 15;

		final int j = 10; // local variable
		j = 15;// final variable cannot re assign

	}

}
