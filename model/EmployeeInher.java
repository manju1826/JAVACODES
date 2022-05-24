package model;

public class EmployeeInher {
	
	String empName;
	String dept;
	String companyName;
	
	void companyDetails(String companyName)
	{
		System.out.println("Company name from superclass"+ " "+companyName );
	}
	
	void getdetails(String empName)
	{
		System.out.println("employee of superclass" + " :"+empName);
	}

}
