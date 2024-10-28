package day4;

public class SwitchStatements {

	public static void main(String[] args) {
		//Syntax
		//same as if and else if
		// Variable is imp because variable is storing the data and maintaining the data
//		switch(variable) {
//		case value1 : statement;
//		case value2 : statement;
//		case value3 : statement;
//		default : statement
//		}
		
		//Print WeekDays with numbers
		int day=1;
		switch(day) {
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		case 7: System.out.println("Sunday"); break;
		default : System.out.println("Invalid Number");
		}
		
		//Print WeekDays with day name
//		String day = "Saturday";
//		switch(day) {
//		case "Monday": System.out.println(1); break;
//		case "Tuesday": System.out.println(2); break;
//		case "Wednesday": System.out.println(3); break;
//		case "Thursday": System.out.println(4); break;
//		case "Friday": System.out.println(5); break;
//		case "Saturday": System.out.println(6); break;
//		case "Sunday": System.out.println(7); break;
//		default : System.out.println("Invalid Day");
//		
//		}
		
		
	}

}
