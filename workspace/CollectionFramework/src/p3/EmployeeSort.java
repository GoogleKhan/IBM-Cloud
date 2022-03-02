package p3;

import java.util.Arrays;

public class EmployeeSort {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setAge(23);
		e1.setName("Shadab");
		e1.setSalary(900);

		Employee e2 = new Employee();
		e2.setAge(34);
		e2.setName("Lala");
		e2.setSalary(1200);

		Employee e3 = new Employee();
		e3.setAge(26);
		e3.setName("Arif");
		e3.setSalary(1100);

		Employee[] emps = { e1, e2, e3 };

		System.out.println(Arrays.toString(emps));

		System.out.println("After Sorting....");

//		Arrays.sort(emps);
//		System.out.println(Arrays.toString(emps));
		
		System.out.println("-----------Name---------------");
		Arrays.sort(emps, new NameComparator());
		System.out.println(Arrays.toString(emps));
		
		System.out.println("-----------Age---------------");
		Arrays.sort(emps, new AgeComparator());
		System.out.println(Arrays.toString(emps));
		
		System.out.println("-----------Salary---------------");
		Arrays.sort(emps, new SalaryComparator());
		System.out.println(Arrays.toString(emps));

	}

}
