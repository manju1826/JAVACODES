import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//find all duplicate in list

public class Duplicate_List {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Manju");
		l.add("Anju");
		l.add("Sanjeev");
		l.add("Manju");
		l.add("Manju");
		l.add("Anju");

		Set<String> duplicate = new HashSet<>();
		Set<String> unique = new HashSet<>();
		for (String s : l) {
			if (!duplicate.add(s)) {
				unique.add(s);
				
			}

		}

		System.out.println(unique);

		/*
		 * String value=duplicate(l); System.out.println(value);
		 */

	}

}
