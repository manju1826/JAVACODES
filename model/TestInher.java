package model;

public class TestInher {

	public static void main(String [] args)
	{
		EmployeeInher emp= new EmployeeInher();
		emp.companyDetails("Accenture");
		emp.getdetails("Manju");
		EmployeeInher emp1=new PermanentEmployeeInh();
		emp1.companyDetails("Accenture");
		emp1.getdetails("Pankaj");
		
		PermanentEmployeeInh  perm= new PermanentEmployeeInh();
		perm.getdetails("pankaj");
		perm.companyDetails("Accenture");
		EmployeeInher emp2= new ContractEmpInh();
		emp2.getdetails("kkk");
		emp2.companyDetails("Acc");
	
		ContractEmpInh contr =new ContractEmpInh();
		contr.companyDetails("aa");
		contr.contractDuration(10);
		

	}
}
