package lab;

import java.util.Scanner;

//10. Write a Java program to break an integer 
// into a sequence of individual digits.  
public class Q10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an Integer Number");
		int num = sc.nextInt(); // 1234 => 1, 2, 3, 4

		int sum = 0;

		while (num > 0) {
			int lastDigit = num % 10;
			System.out.println(lastDigit);

			sum = sum + lastDigit;

			num = num / 10;
		}
		
		System.out.println("Sum = "+ sum);

		sc.close();

	}

}
