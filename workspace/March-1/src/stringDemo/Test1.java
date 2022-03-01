package stringDemo;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {

		String name = "Shadab Ahmad Khan";
		int l = name.length();
		System.out.println("Length: " + l);

		char ch = name.charAt(9);
		System.out.println(ch);// 'm'

		System.out.println("------------------------------");

		int index = name.indexOf('a');
		System.out.println("Index of a is : " + index);

		int lastIndex = name.lastIndexOf('a');
		System.out.println("Last Index of a is : " + lastIndex);

		System.out.println("------------------------------");

		String s1 = name.substring(7, 12);
		System.out.println(s1);

		String s2 = name.substring(13);
		System.out.println(s2);

		System.out.println("------------------------------");

		String str = name.replace('a', 'x');
		System.out.println(name);
		System.out.println(str);

		System.out.println("------------------------------");

		String lower = name.toLowerCase();
		System.out.println(lower);

		String upper = name.toUpperCase();
		System.out.println(upper);

		System.out.println("------------------------------");

		String s3 = "   Hello Brother    ";
		System.out.println(s3 + ", " + s3.length());

		String s4 = s3.trim();
		System.out.println(s4 + ", " + s4.length());

		System.out.println("------------------------------");

		System.out.println(name.startsWith("Sha"));
		System.out.println(name.endsWith("an"));

		System.out.println("------------------------------");

		String a = "I love ";
		String b = "Java";

		String y = a + b; // "I love Java"
		String z = a.concat(b);

		System.out.println(y + " : " + z);

		System.out.println("------------------------------");

		int i = 10;
		// Number or anything to String
		String s5 = i + "";
		// OR
		String s6 = String.valueOf(i);

		System.out.println("------------------------------");

		String[] words = name.split(" ");
		System.out.println(Arrays.toString(words));

	}

}
