package day7ArraysPractical;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {

		Scanner inputTaking=new Scanner(System.in); //It is a in-build java class, Scanner class used for taking input from keyboard (In console)
		
//		System.out.println("Its a message Please enter number in console");
//		int num = inputTaking.nextInt(); //based on what type of data you want to capture like int,string,char,boolen etc,		//they store data in this variable, It takes the input from console
//		System.out.println("Given number is : "+num);
		
		
		//Taking a decimal number 
//		System.out.println("Please enter decimal number : ");
//		double num = inputTaking.nextDouble(); // You want to change which type of data you expecting based it
//		System.out.println("Enterd number is : "+num);
		
		//Taking in String
		System.out.println("Please enter text");
		String city = inputTaking.next();
		System.out.println("Enterd city is : "+city);
		
		
	}

}
