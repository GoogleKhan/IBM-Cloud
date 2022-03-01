package stringDemo;

public class Test2 {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Java";

		String x = "JAVA";

		boolean b1 = s1 == s2; // true (Reference/address equality)
		boolean b2 = s1.equals(s2); // true (object equality)

		boolean b = s1.equals(x); // false
		b = s1.equalsIgnoreCase(x); // true

		System.out.println("------------------------------");

		String s3 = new String("Python");
		String s4 = new String("Python");

		boolean b3 = s3 == s4; // false (Reference/address equality)
		boolean b4 = s3.equals(s4); // true

	}

}
