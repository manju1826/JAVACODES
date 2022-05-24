import java.util.ArrayList;
import java.util.List;

public class ToSum {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(2);
		values.add(7);
		values.add(11);
		values.add(15);
	// boolean sumof9 = sum(values, 9);
	 boolean sumof18 = sum(values, 19);
	 //System.out.println(sumof9);
	 System.out.println(sumof18);
	}

	public static boolean sum(List<Integer> value, int target) {
		for (int i = 0; i < value.size(); i++) {
			
			for (int j = i+1; j < value.size(); j++) {
				int sum=value.get(i)+value.get(j);
				if(sum==target)
				{
					return true;
					
				}
				
				
			}
			
		}
		
		return false;
	}
}
