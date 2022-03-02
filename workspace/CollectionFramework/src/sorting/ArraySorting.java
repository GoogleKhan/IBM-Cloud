package sorting;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		int[] arr = { 56, 45, 34, 87, 24, 47, 93, 17 };
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
