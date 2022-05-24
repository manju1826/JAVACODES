import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapIteration {

	public static void main(String[] args) {
		Map<Integer, String> number = new TreeMap<>();
		number.put(1, "one");
		number.put(2, "two");
		number.put(100, "hundred");
		number.put(3, "three");
		number.put(4, "four");
		number.put(5, "five");
		number.put(6, "six");
		number.put(7, "seven");
		number.put(8, "eight");
		number.put(9, "nine");
		number.put(10, "ten");

		// printMap(number);
		// printMapUsingKeySet(number);
		//printMapUsingForEach(number);
		printMapUsingIterator(number);

	}

	private static void printMapUsingIterator(Map<Integer, String> number) {
		Set<Integer> keySet = number.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			String val = number.get(key);
			System.out.println(key + " " +val);
			
			
		}
		
		
	}
	

	private static void printMapUsingForEach(Map<Integer, String> number) {
		number.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
		
		Set<Integer> keySet = number.keySet();
		
		keySet.forEach(x -> {
			System.out.println(x);
		});

	}

	private static void printMapUsingKeySet(Map<Integer, String> number) {

		for (Integer key : number.keySet()) {
			String value = number.get(key);
			System.out.println(key + " " + value);

		}
	}

	public static void printMap(Map<Integer, String> input) {
		for (Map.Entry<Integer, String> entry : input.entrySet()) {
			int key = entry.getKey();
			String val = entry.getValue();
			System.out.println("key: " + key + " ,value :" + val);

		}

	}

}
