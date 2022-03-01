package p1;

public class HashCodeDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setAge(24);
		e1.setName("Abc");
		e1.setSalary(1234.5);
		
		Employee e2 = new Employee();
		e2.setAge(26);
		e2.setName("Xyz");
		e2.setSalary(4321.45);
		
		int h1 = e1.hashCode();
		System.out.println(h1);
		
		int h2 = e2.hashCode();
		System.out.println(h2);
		
		

	}

}
