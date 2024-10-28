package day7ArraysPractical;
import java.util.Scanner;

public class TakingMultipleInputsFromConsole {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // object
	/*	
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		System.out.println("Add num1 and num2 = "+(num1+num2));
*/
		//Using with mixed data types
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Your name is "+ name);
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Your age is "+ age);
		
		System.out.println("Enter Unknown data type value");
		Object values=sc.next();
		System.out.println("You entered value is "+values);


		
	}

}
