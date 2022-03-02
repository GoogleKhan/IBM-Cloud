package p1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {

		Set<String> fruits = new HashSet<String>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Orange");
		fruits.add("Apple");

		System.out.println("---- First Way: using toArray(), Not recommended");
		Object[] arr = fruits.toArray();

		for (int i = 0; i < arr.length; i++) {

			Object element = arr[i];
			System.out.println(element);
		}

		System.out.println("---- Second Way: For Each loop ");

		for (Object element : fruits) {
			System.out.println(element);
		}
		System.out.println("---- Third Way: Using Iterator ");

		Iterator<String> it = fruits.iterator();

		while (it.hasNext()) {
			Object element = it.next();
			System.out.println(element);
		}
	}

}
