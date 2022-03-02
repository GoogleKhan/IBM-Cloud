package p3;

public class Employee implements Comparable<Employee> {

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
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		Employee e1 = this;
		Employee e2 = emp;

		return e1.getName().compareTo(e2.getName());

	}

}
