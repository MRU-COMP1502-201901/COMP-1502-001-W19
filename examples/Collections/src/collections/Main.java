package collections;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Collection is the broadest interface
		// allows us to add, remove, check size,
		// and check if an element is contained
		System.out.println("Collection");
		Collection<String> stringCollection = new ArrayList<>();
		stringCollection.add("AAA");
		System.out.println(stringCollection);
		System.out.println(stringCollection.size());
		System.out.println(stringCollection.contains("AAA"));
		stringCollection.remove("AAA");
		System.out.println(stringCollection);
		System.out.println(stringCollection.size());
		// contains (and all list operations) use the object's equals method
		System.out.println(stringCollection.contains("AAA"));
		System.out.println();
		
		// list is an interface which adds sequence
		// to the collection, so now we can add 
		// remove, or get from specific points
		System.out.println("Lists");
		List<String> stringList = new ArrayList<>();
		stringList.add("AAA");
		stringList.add("BBB");
		stringList.add("AAA");
		System.out.println(stringList);
		// remove will take the first thing it matches
		stringList.remove("AAA");
		System.out.println(stringList);
		// can set a particular value
		stringList.set(1, "EEE");
		System.out.println(stringList);
		// can get a particular value
		System.out.println(stringList.set(1, "EEE"));
		// can get an index for an object
		System.out.println(stringList.indexOf("EEE"));
		System.out.println();
		
		// set is an interface which does not allow duplicates and has no sequence.
		Set<String> stringSet = new HashSet<>();
		stringSet.add("BBB");
		stringSet.add("AAA");
		stringSet.add("AAA");
		System.out.println(stringSet);
		// can't use get at index, because there is no sequence.
		//stringSet.get(1);
		// cant still check if it is contained.
		System.out.println(stringSet.contains("AAA"));
		// can still check size
		System.out.println(stringSet.size());
		// as with all collections (actually all iteratable classes) you can use a foreach loop 
		for (String s : stringSet) {
			System.out.println("s length=" + s.length());
		}
		System.out.println(stringSet);
		System.out.println();
		
		Map<String, Integer> stringIntMap = new HashMap<>();
		stringIntMap.put("AAA", 5);
		stringIntMap.put("BBB", 5);
		System.out.println(stringIntMap);
		stringIntMap.put("BBB", 10);
		System.out.println(stringIntMap.get("AAA"));
		System.out.println(stringIntMap.get("CCC"));
		System.out.println(stringIntMap);
		
		Map<String, Map<String, String>> bigMap = new HashMap<>();
		bigMap.put("A", new HashMap<>());
		bigMap.get("A").put("B", "What?");
		System.out.println(bigMap);
		
		System.out.println("AAA".hashCode());
		System.out.println("BBB".hashCode());
		Object o = new Object();
		System.out.println(o.hashCode());
		
		//Queue<String> q = new DequeString>();	
	}

}
