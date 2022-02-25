package p3;

public class Student {

	private String name;

	private int rollNo;

	static private String college;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	static public String getCollege() {
		return college;
	}

	static public void setCollege(String college) {
		Student.college = college;
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("Ashish");
		s1.setRollNo(101);
		s1.setCollege("SVCE");

		Student s2 = new Student();
		s2.setName("Raghvan");
		s2.setRollNo(104);
		s2.setCollege("SVCE");

		Student s3 = new Student();
		s3.setName("Preethika");
		s3.setRollNo(108);
		s3.setCollege("SVCE");

	}

}
