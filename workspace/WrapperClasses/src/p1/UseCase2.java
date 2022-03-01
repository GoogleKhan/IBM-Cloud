package p1;

public class UseCase2 {
	public static void main(String[] args) {

		// a) Numeric to String:

		int i = 10;

		String s1 = i + "";
		System.out.println(s1);

		String s2 = String.valueOf(i);
		System.out.println(s2);

		System.out.println("=======================");

		// b) String to Numeric:

		String str = "101";
		// int x1 = (int) s3; // ERROR

		int x = Integer.parseInt(str);
		int x2 = Integer.valueOf(str);
		float y = Float.parseFloat(str);
		double z = Double.parseDouble(str);

		System.out.println(x + " : " + y + " : " + z);
		
		  String str1 ="Abc100";
		  
		  int xyz = Integer.parseInt(str1);
	}

}
