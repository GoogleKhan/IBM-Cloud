package p1;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("INDIA", "New Delhi");
		map.put("PAKISTAN", "Islamabad");
		map.put("NEPAL", "Kathmandu");
		map.put("SRILANKA", "Colombo");
		map.put("USA", "WashingtonDC");
		map.put("FRANCE", "Paris");
		map.put("USA", "NewYork");

		System.out.println(map.isEmpty()); // false
		System.out.println(map.size()); // 6
		System.out.println(map);

		System.out.println(map.containsKey("Paris")); // false
		System.out.println(map.containsValue("Paris")); // true

		Object value = map.get("INDIA");
		System.out.println("Capital of INDIA is : " + value);

		System.out.println("---------------------------------");
		System.out.println(map);
		map.remove("PAKISTAN");
		System.out.println(map);
		System.out.println("---------------------------------");
		
		map.clear();
		System.out.println(map);

	}

}
