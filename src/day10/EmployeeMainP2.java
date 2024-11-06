package day10;

public class EmployeeMainP2 {
public static void main (String[]args) {
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
}
