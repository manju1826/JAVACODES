
public class ternary_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=90;
		int y=120;
		int z=33;
		
		int largest_number=x>(y>z?y:z)?x:(z>y?z:y);
		System.out.println(largest_number);
		
		
	}

}
