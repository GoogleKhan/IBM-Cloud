package p1;

//Case-2: from the another class but same package.
public class B {

	void f2() {

		A obj = new A();

		System.out.println(obj.a); // OK
		System.out.println(obj.b); // OK
		System.out.println(obj.c); // OK
		// System.out.println(obj.d); // ERROR
	}

}
