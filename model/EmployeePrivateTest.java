package model;

public class EmployeePrivateTest extends EmployeePrivate {
	



		public EmployeePrivateTest(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args)
		{
		EmployeePrivate emp1=new EmployeePrivate(26);
	    System.out.println(emp1.getAge());
		EmployeePrivate emp2=new EmployeePrivate("Manju",34);
		EmployeePrivate emp3=new EmployeePrivate("Shantanu",50000,35);
		EmployeePrivate emp4=new EmployeePrivate("IT");
		EmployeePrivate emp5=new EmployeePrivate("Umesh",50000,32);
		//System.out.println("Company and Age of EmployeePrivate1 are "+ " "+EmployeePrivate.companyName+ " and  " +emp1.age);
		//System.out.println("Company ,Name and age of EmployeePrivate2 are "+EmployeePrivate.companyName+ " ," + emp2.name + " and " +emp2.age);
		//System.out.println("company,Name ,Salary and age of EmployeePrivate3 are : "+EmployeePrivate.companyName+ ", " + emp3.name +" ,"+emp3.salary+" and " +emp2.age);
		System.out.println("company and Department of EmployeePrivate4 are: "+EmployeePrivate.companyName+  " and  " + emp4.dept);
		//System.out.println("company,Name ,Salary and age of EmployeePrivate5 are: "+EmployeePrivate.companyName+ " ," + emp5.name +", "+emp5.salary+" and " +emp5.age);
		//List<EmployeePrivatePrivate> emp=new List();
		
		
		
		
		}
		
	}



