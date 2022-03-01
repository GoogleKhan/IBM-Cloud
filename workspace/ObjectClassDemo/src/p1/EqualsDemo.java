package p1;

public class EqualsDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setAge(24);
		e1.setName("Shadab");
		e1.setSalary(1234.5);

		Employee e2 = new Employee();
		e2.setAge(26);
		e2.setName("Shadab");
		e2.setSalary(1234.5);

		boolean b = e1.equals(e2); // false

		System.out.println(b);

	}

}
