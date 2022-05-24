import java.util.ArrayList;
import java.util.List;

public class Testunique {

	//find all element which present in first list not in second list
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<>();
		l1.add("Test");
		l1.add("Install");
		l1.add("Verify");
		l1.add("Sanity");
		
		List<String> l2=new ArrayList<>();
		l2.add("functional");
		l2.add("Integration");
		l2.add("Verify");
		l2.add("Sanity");
		
		l1.removeAll(l2);
		
		System.out.println("Common values from first list are " + l1);
		

	}

}
