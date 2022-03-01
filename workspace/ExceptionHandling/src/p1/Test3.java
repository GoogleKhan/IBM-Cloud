package p1;

public class Test3 {

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

		try {
			System.out.println("TRY BLOCK");
			int a = 10 / 3;
			System.out.println("a = " + a);
		} catch (Exception e) {
			System.out.println("CATCH BLOCK");
		} finally {
			System.out.println("FINALLY BLOCK");
		}

		System.out.println("After f2()");

	}

}
