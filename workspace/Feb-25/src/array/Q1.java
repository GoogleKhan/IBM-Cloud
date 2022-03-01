package array;

import java.util.Arrays;

// Reverse an array
public class Q1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));

		// Reverse the array

		int N = arr.length;

		for (int i = 0; i < N / 2; i++) {

			int first = arr[i];
			int last = arr[N - 1 - i];

			arr[i] = last;
			arr[N - 1 - i] = first;

		}
		System.out.println(Arrays.toString(arr));
	}
}
