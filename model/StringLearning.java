package model;

public class StringLearning {

	public static void main(String[] args)
	{
		String s="Manju";
		s=s+"tripathi";
		System.out.println(s);
		//sring builder, string buffer
		StringBuilder sb=new StringBuilder();
		sb.append("Manju").append("Tripathi");
		System.out.println(sb.toString());
		
		StringBuffer sf=new 	StringBuffer();//
		sf.append("Manju").append("Tripathi");
		System.out.println(sf.toString());
	}

}
