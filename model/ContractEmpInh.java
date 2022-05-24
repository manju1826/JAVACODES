package model;

public class ContractEmpInh extends PermanentEmployeeInh {
	
	int duration;
	//void getdetails(String empName)
	//{
	//	System.out.println("employee of second superclass"+"" +empName);
	//}

	
	void contractDuration(int duration)
	{
		System.out.println("contract duration is " + " "+ duration);
	}
}
