package model;

public class EmployeePrivate {
 private int age;
 String name;
 int salary;
 static String companyName="Accenture";
 String dept;
 
 public EmployeePrivate(int age)
 {
	 this.age=age;
	// System.out.println("Age of employee is " + age);
	 
 }
  public EmployeePrivate (String name,int age)
  {
	  this.name=name;
	  this.age=age;
	  //System.out.println("Name of employee is " + name +" and age:  " + age);
	  
  }
 public EmployeePrivate (String name,int salary,int age)
 {
	 this.name=name;
	  this.age=age;
	  this.salary=salary;
	  
	 // System.out.println("Name of employee is " +name+ ",salary :" + salary + " and age : "+age);
 }
 public EmployeePrivate(String dept)
 {
	 this.dept=dept;
 }
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
 
 
}
