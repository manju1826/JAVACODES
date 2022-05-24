package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(26);
		Employee emp2 = new Employee("Manju", 34);
		Employee emp3 = new Employee("Shantanu", 50000, 35);
		Employee emp4 = new Employee("IT");
		Employee emp5 = new Employee("Umesh", 50000, 32);
		System.out.println("Company and Age of employee1 are " + " " + Employee.companyName + " and  " + emp1.age);
		System.out.println("Company ,Name and age of employee2 are " + Employee.companyName + " ," + emp2.name + " and "
				+ emp2.age);
		System.out.println("company,Name ,Salary and age of employee3 are : " + Employee.companyName + ", " + emp3.name
				+ " ," + emp3.salary + " and " + emp2.age);
		System.out.println("company and Department of employee4 are: " + Employee.companyName + " and  " + emp4.dept);
		System.out.println("company,Name ,Salary and age of employee5 are: " + Employee.companyName + " ," + emp5.name
				+ ", " + emp5.salary + " and " + emp5.age);
		// List<Employee> emp=new List();

		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);

		for (Employee e : list)

		{

			System.out.println(e);
		}

	}
}
