package p1;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Orange");
		list.add("Apple");

		System.out.println(list.size()); // 5
		System.out.println(list);

		System.out.println(list.get(2));

	}

}
