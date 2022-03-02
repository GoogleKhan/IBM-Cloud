package p1;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee e1 = new Employee();
		e1.setAge(24);
		e1.setName("Shadab");
		e1.setSalary(1234.5);

		Employee e2 = e1.clone();

		Employee e3 = e1.clone();

//		Employee e2 = new Employee();
//		e2.setAge(e1.getAge());
//		e2.setName(e1.getName());
//		e2.setSalary(e1.getSalary());

		System.out.println(e1.equals(e2));

		System.out.println(e1);
		System.out.println(e2.toString());
		System.out.println(e3);

	}

}
