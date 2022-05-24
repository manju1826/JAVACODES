package model;
public class StudentTest extends Student {

	public static  void main(String[] args)

	{
 Student manju=new Student("anju");
 System.out.println(manju.getName());
 //manju=null;
 Student manju2=new Student("Sanjeev");
 //manju2=manju;
 manju=null;
 System.out.println(manju2.schoolName);
 System.out.println(manju.schoolName);
	}
}
