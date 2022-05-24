import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//list of string return all unique value with sorting order

public class UniqueSortValue {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>();
		li.add("tiger");
		li.add("dog");
		li.add("lion");
		li.add("dog");
		li.add("cat");
		li.add("elephant");
		li.add("cat");
		li.add("lion");
		Set<String> findUniqueSort = findUniqueSort(li);
		System.out.println(findUniqueSort);
		
		
	
		
		
	}
	public static Set<String> findUniqueSort(List<String> input)
	{
		Set<String> value=new TreeSet<>();
		for(String unique:input)
		{
			value.add(unique);
			
		}
		return value;
		
	}
}
