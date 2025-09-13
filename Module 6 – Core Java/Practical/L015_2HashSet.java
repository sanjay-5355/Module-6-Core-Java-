package java_lab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L015_2HashSet {

	public static void main(String[] args) {
		// ✅ Create a List with duplicate values
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Apple"); // duplicate
		list.add("Banana"); // duplicate

		System.out.println("Original List: " + list);

		// ✅ Use HashSet to remove duplicates
		Set<String> set = new HashSet<>(list);


		System.out.println("List after removing duplicates: " + set);
	}
}
