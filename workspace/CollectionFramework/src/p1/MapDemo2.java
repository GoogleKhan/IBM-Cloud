package p1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("INDIA", "New Delhi");
		map.put("PAKISTAN", "Islamabad");
		map.put("NEPAL", "Kathmandu");
		map.put("SRILANKA", "Colombo");
		map.put("USA", "WashingtonDC");
		map.put("FRANCE", "Paris");
		map.put("USA", "NewYork");

		System.out.println("------ First Way: with the help of keys -----------");

		Set<String> allKeys = map.keySet();

		for (Object key : allKeys) {
			Object value = map.get(key);
			System.out.println(key + " -> " + value);
		}

		System.out.println("------ Second Way: with the help of Values -----------");

		Collection<String> allValues = map.values();

		for (Object value : allValues) {
			System.out.println(value);
		}

		System.out.println("------ Third Way: with the help of Entries -----------");

		Set<Entry<String, String>> allEntries = map.entrySet();

		for (Entry<String, String> entry : allEntries) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " -> " + value);
		}

	}

}
