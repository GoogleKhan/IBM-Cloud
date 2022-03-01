package p1;

public class Employee {

	private String name;
	private int age;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {

		Employee e2 = (Employee) obj;

		String name1 = this.getName();
		String name2 = e2.getName();

		return name1.equals(name2);

//		int age1 = this.getAge();
//		int age2 = e2.getAge();
//		return age1 == age2;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
