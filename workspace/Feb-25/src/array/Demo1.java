package array;

public class Demo1 {

	public static void main(String[] args) {

		int[] arr = new int[3];
		arr[0] = 13;
		arr[1] = 23;
		arr[2] = 99;

		System.out.println("-------------Using Indexed For loop-------------");

		for (int i = 0; i < arr.length; i++) {

			int x = arr[i];
			System.out.println(x);

		}

		System.out.println("-------------Using EnhancedFor or ForEach loop-------------");

		for (int x : arr) {
			System.out.println(x);
		}
	}

}
