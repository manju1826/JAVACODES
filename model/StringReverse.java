package model;

public class StringReverse {
 public static void main(String[]args) {
	 

String name="Manju";
char ch[]=name.toCharArray(); 
 String rev="";
 StringBuilder rev1=new StringBuilder();
 for (int i=ch.length-1;i>=0;i--)
 {
	 rev+=ch[i];
	 rev1.append(ch[i]);
	 
 }
 System.out.println(rev);
 System.out.println(rev1);
}

}
