import java.util.Scanner;

public class evenOdd {
 public static void main (String[] args)
 {
	 int n;
	 Scanner sc= new Scanner(System.in);
	 n=sc.nextInt();
	 if(n/2==0)
	 {
		 System.out.println("number is even"+ n );
	 }
	 else 
		 System.out.println("number is odd " +n);
 }
}
