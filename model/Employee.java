package model;

public class Employee {
	int age;
	String name;
	int salary;
	String dept;
	String address;
	private String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	static String companyName = "Accenture";

	public Employee(int age) {
		this.age = age;
		// System.out.println("Age of employee is " + age);

	}

	public Employee(String dept) {
		this.dept = dept;
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
		// System.out.println("Name of employee is " + name +" and age: " + age);

	}

	public Employee(String name, int salary, int age) {
		this.name = name;
		this.age = age;
		this.salary = salary;

		// System.out.println("Name of employee is " +name+ ",salary :" + salary + " and
		// age : "+age);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		super.toString();
		return name + " " + age + " " + salary;
	}

}
