package test;

import hospital.doctors.cardio.D; // import class D only from the package 
import hospital.staff.*; // will import all public classes from the package

public class Test {

	public static void main(String[] args) {

		p1.A a1 = new p1.A(); // fullyQualifiedName
		p2.B b1 = new p2.B();

		D d1 = new D(); // import statement
		
		G g1= new G();
		
		System.out.println("Hello");
		
	}

}
