
public interface InterfaceTest {

	public void getEmployeeDetails();
	
		//interface is a contract which say whoever implements 
		//this contract has to give implementation to all its methods
	 public void getCompanydetails();
	

}

 class Employee implements InterfaceTest{
	
	public void getEmployeeDetails()
	{
		System.out.println("Employee details from interface implements to this class ");
	}
	 
	public void getCompanydetails() {
		System.out.println("company for all employee of this class belongs to Accenture ");
	}
}
