package p1;

public class Test1 {

	public static void main(String[] args) {

		System.out.println("Before main()");
		f1();
		System.out.println("After main()");
	}

	private static void f1() {
		System.out.println("Before f1()");
		f2();
		System.out.println("After f1()");
	}

	private static void f2() {

		System.out.println("Before f2()");

		int a = 10 / 3;
		System.out.println("a = " + a);

		System.out.println("After f2()");

	}

}
