package lab;

public class ReverseString1 {

	public static void main(String[] args) {

		String name = "nitin";

		StringBuffer sb = new StringBuffer(name);
		StringBuffer sbRev = sb.reverse();

		String revName = sbRev.toString();

		if (name.equals(revName)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
