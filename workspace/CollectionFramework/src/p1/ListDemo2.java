package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Orange");
		list.add("Apple");

		System.out.println("---- First Way: using toArray(), Not recommended");
		Object[] arr = list.toArray();

		for (int i = 0; i < arr.length; i++) {

			Object element = arr[i];
			System.out.println(element);
		}
		System.out.println("---- Second Way: For Each loop ");

		for (Object element : list) {
			System.out.println(element);
		}
		System.out.println("---- Third Way: Using Iterator ");

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}

		System.out.println("---- Forth Way: Using Indexed For loop ");
		for (int i = 0; i < list.size(); i++) {

			Object element = list.get(i);
			System.out.println(element);
		}

		System.out.println("---- Fifth Way: Using ListIterator ");

		ListIterator<String> lit = list.listIterator();

		while (lit.hasNext()) {
			String element = lit.next();
			System.out.println(element);

		}
		System.out.println("----------------------");
		while (lit.hasPrevious()) {
			Object element = lit.previous();
			System.out.println(element);
		}

	}

}
