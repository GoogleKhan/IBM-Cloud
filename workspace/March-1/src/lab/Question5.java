package lab;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Full name: ");

		String name = sc.nextLine();

		String[] words = name.split(" ");

		String initials = "";

		for (int i = 0; i < words.length-1; i++) {

			String word = words[i];

			char firtChar = word.charAt(0);

			initials = initials + firtChar + ". ";

		}
		
		String lastWord= words[words.length-1];
		initials = initials + lastWord;
		
		System.out.println(initials);
		sc.close();
	}

}
