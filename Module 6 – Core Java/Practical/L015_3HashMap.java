package java_lab;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class L015_3HashMap {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();

		// ✅ Store key-value pairs
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Mango");

		// ✅ Retrieve value by key
		System.out.println("Value for key 2: " + map.get(2));

		// ✅ Iterate through all key-value pairs
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
//			System.out.println(itr.next());
			Map.Entry entry = (Entry) itr.next();
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
		}
	}
}
