package p1;

public class Cat {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (age <= 0) {

			System.out.println("Not a valid age");
			return;
		}

		this.age = age;
	}

}
