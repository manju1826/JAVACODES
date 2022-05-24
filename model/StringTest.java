package model;

public class StringTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s =new String("Manju");
String s1 =new String("Manju");
System.out.println(s==s1);
s=s1;
System.out.println(s1==s);
String s2="Manju";
String s3="Manju";
System.out.println(s.hashCode());
System.out.println(s1.hashCode());


 System.out.println(s1==s);
 System.out.println(s1.equals(s));
 System.out.println("s1 is equal to s2 :" +" "+ s1==s2);
 System.out.println("++++++++++++++++++++++++++++");
 System.out.println(s==s2);
 System.out.println(s2==s3);
 s3=s2.toUpperCase();
 
 System.out.println(s2);
 System.out.println(s3);
 
 char[] charArray = s1.toCharArray();
 int counter=0;
 for(char c: charArray) {
	if(c=='a' || c=='A' )
	{
		counter++;
	}
	 System.out.println(c);
 }
 System.out.println(counter );
	}
	

}
