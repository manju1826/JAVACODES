import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class set_Test {
public static void main(String[] args) {
	Set<Integer> s=new HashSet<>();
	Set<Integer> lh=new LinkedHashSet<>();
	Set<Integer> t=new TreeSet<>();
	
	for (int i = 0; i <=100; i++) {
		s.add(i);
		
	}
	System.out.println("set value of hashset" + s);
	
	Set name= new LinkedHashSet<>();

	name.add("Manju");
	name.add("anju");
	name.add("Sanju");
	name.add("anju");
	name.add(2);
	name.add(true);
	
	Set<String> n=null;
	n= name;
//name.removeAll(s);
	System.out.println(name);
	//name.
	for(Object data: name)
	{
		System.out.println("set data for name " +data);
		if(data instanceof String) {
			System.out.println("hello");
		}else if(data instanceof Boolean){
			System.out.println("ello");
		}else {
			System.out.println("llo");
		}
		}
	 name.clear();
	}
}

