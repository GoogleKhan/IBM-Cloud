package p1;

public class GetClassDemo {

	public static void main(String[] args) throws Exception {

		Employee e1 = new Employee(); // First way to create object in java using new operator
		e1.setAge(24);
		e1.setName("Shadab");
		e1.setSalary(1234.5);

		Employee e2 = e1.clone(); // Second way to create object in java using clone()

		Class clazz = e1.getClass();
		Employee e3 = (Employee) clazz.newInstance(); // Third way to create object in java using 
														// Reflection API

		System.out.println(e1.equals(e2));

		System.out.println(e1);
		System.out.println(e2);

	}

}
