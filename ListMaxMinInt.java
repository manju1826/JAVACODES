import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class ListMaxMinInt {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(8);
		arr.add(32);
		arr.add(21);
		arr.add(31);
		
		List<Integer> str=new ArrayList<>();
		


		//System.out.println("Maximum is : " + max);
		System.out.println("Minimum is : " + findMinValue(str));
	}

	public static int findMinValue(List<Integer> input) {

		if(input.size()<1)
		{
			throw new RuntimeException("List is null/empty");
		}
		int min = input.get(0);

		for (int i = 1; i < input.size(); i++) {
			if (input.get(i) < min) {
				min = input.get(i);

			}

		}
		return min;
	}
	

}
