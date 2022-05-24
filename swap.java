
public class swap {

	public static void swap(int m,int n)
	{
		int temp=0;
		temp=n;
		
		n=m;
		m=temp;
		
		System.out.println("value of m " + m);
		System.out.println("value of n " + n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swap(6,8);
	

	}

}
