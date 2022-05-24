import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Test2 {

	public static void main(String[] args) {
		
		List<String> ll=new LinkedList<>();
		for(int i=0;i<=100000;i++) {
			ll.add(String.valueOf(i));
			
			
		}
		long start=System.currentTimeMillis();
		ll.remove(3);
		long end=System.currentTimeMillis();
		long processingTime=start-end;
		System.out.println("Processing time for linklist is "+ processingTime);
		

		List<String> al=new ArrayList<>();
		for(int i=0;i<=100000;i++) {
			al.add(String.valueOf(i));
			
			
		}
		long startal=System.currentTimeMillis();
		ll.remove(3);
		long endal=System.currentTimeMillis();
		long processingTimeal=startal-endal;
		System.out.println("Processing time for Arraylist is "+ processingTimeal);
		
}
}