package day10;

public class EmployeePrb1 {
	//Global Variables
	int eid;
	String ename;
	String job;
	int sal;

	//Methods
	//Return type is imp, it returns integer put int, String, char, boolean etc. nothing is returning just print then put void
	void display(){ //brackets empty means no passing parameters no input and no output just print the value display is name of the method
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	//There we are comment the main method using all plain classes in another main class
/*
	public static void main (String[]args) {
		//one method inside another method execution is not possible only variables are possible
		//main method is a special method and compulsory for executing other normal methods
		//Objects are only created in methods not in class

		//create multiple objects with same classname 

		EmployeePrb1 emp1 = new EmployeePrb1();
		emp1.eid = 101;
		emp1.ename = "John";
		emp1.job = "Manager";
		emp1.sal = 50000;
		emp1.display();

		EmployeePrb1 emp2 = new EmployeePrb1();
		emp2.eid = 102;
		emp2.ename = "David";
		emp2.job = "Engineer";
		emp2.sal = 30000;
		emp2.display();
	}
	*/
}
