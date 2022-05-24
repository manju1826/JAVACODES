import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class List_sort {
	public static void main(String[] args) {
		
	
	List<String> li=new ArrayList<>();
	li.add("Tiger");
	
	li.add("dog");
	li.add("lion");
	li.add("dog");
	li.add("cat");
	li.add("elephant");
	li.add("cat");
	li.add("lion");
	
	
	  List_sort ob = new List_sort(); 
	ob.sortMethod(li);
	  //System.out.println();
	 
	
	
	}
	private TreeSet<String> sortMethod(List<String> list)
	{
		TreeSet<String> st=new TreeSet<>();
		for(String sort:list)
		{
			st.add(sort);
			System.out.println(st);
		}
		return st;
	}
}
