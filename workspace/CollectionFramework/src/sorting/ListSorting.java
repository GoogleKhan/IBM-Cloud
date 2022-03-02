package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		nums.add(56);
		nums.add(45);
		nums.add(34);
		nums.add(87);
		nums.add(24);
		nums.add(47);
		nums.add(93);
		nums.add(17);

		System.out.println(nums);

		Collections.sort(nums);

		System.out.println(nums);
	}

}
