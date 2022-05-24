import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class listTest {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			arrayList.add(i);

		}
		String[] ss={"Manju","Anju"};
		   List l=        Arrays.asList(ss);
		   System.out.println(l);
		System.out.println("values of i in list are " + "" + arrayList);

		arrayList.add(45);
		arrayList.add(44);
		arrayList.add(12);
		arrayList.add(22);
		arrayList.add(100);
		arrayList.add(45);
		System.out.println(arrayList.add(0));//returns true
		for (int list : arrayList)

		{
			
		}
		System.out.println(arrayList);
		List<String> ll=new LinkedList<String>();
		
		 ll.add("Manju");
		 ll.add("Anju");
		// ll.add("Anju");
		 ll.add("Shantanu");
		 ll.add("Umesh");
		 
		 List<String> l2=new LinkedList<String>();
		 l2.add("Manju");
		 l2.add("Anju");
		 l2.add("Pankaj");
		 
		 //ll.retainAll(l2);
		 boolean removeAll = l2.removeAll(ll);
		 System.out.println(removeAll);
		 System.out.println(l2);
		//ll.remove(2);
		
		/*
		 * System.out.println(ll.get(2));
		 * //System.out.println(ll.retainAll(ll));//returns false
		 * 
		 * for(String s: ll) { System.out.println(s); }
		 */
	}
	
	 
	 
	

}
