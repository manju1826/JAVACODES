import java.util.Scanner;

public class readNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		 Scanner sc=new Scanner(System.in);
		 
		 String s =sc.nextLine();
	        System.out.println("Print value of string "+s);
		 
		 number=sc.nextInt();
         System.out.println("print value of number "+ number );
         
        float f =sc.nextFloat();
        System.out.println("Print value of float "+ f);
        
        float d=number*f;
        System.out.println(d);
        
	}

}
