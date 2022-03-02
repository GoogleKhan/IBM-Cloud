package p1;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set set = new HashSet();

		set.add("Apple");
		set.add("Banana");
		set.add("Grapes");
		set.add("Orange");
		set.add("Apple");

		System.out.println(set.size()); // 4

		System.out.println(set);

		System.out.println(set.contains("Apple"));// true
		System.out.println(set.contains("Coconut")); // false
		
		set.remove("Grapes");
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());

	}

}
