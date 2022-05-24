import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_Prog {
	public static void main(String[] args) {

		List<String> li = new ArrayList<>();
		li.add("Tiger");
		li.add("dog");
		li.add("lion");
		li.add("dog");
		li.add("cat");
		li.add("elephant");
		li.add("cat");
		li.add("lion");
		String findFirstDuplicate = findFirstDuplicate(li);
		System.out.println(findFirstDuplicate);

	}

	private static String findFirstDuplicate(List<String> input) {
		Set<String> name = new HashSet<>();
		for (String value : input) {
			boolean duplicate = !name.add(value);
			if (duplicate) {
				return value;

			}
		}

		return "No duplicate found";

	}
}
