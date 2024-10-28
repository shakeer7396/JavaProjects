package day9StringsPracticals;

import java.util.Scanner;

public class Asignment1_Palindrome {
	public static void main (String []args) {
	//	1)Check string is palindrome are not 
		
	// String value taken manually
	/*	String s = "MADAM";
		String pal ="";
		for(int i=s.length()-1;i>=0;i--) {
			//System.out.println(s.charAt(i));
			pal=pal+s.charAt(i);
		}
		if(s.equals(pal)) {
			System.out.println("Its a Palindrome");
		}
		else {
			System.out.println("Its not a Palindrome");
			}
*/
		
		//String value taken from console
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter string value");
		String originalStr=sc.next();
		//System.out.println(originalStr);
		String rev ="";
		
		for(int i=originalStr.length()-1;i>=0;i--) {
			rev = rev+originalStr.charAt(i);
		}
		//System.out.println("Revesersed String is "+rev);
		if(originalStr.equals(rev)) {
			System.out.println("Its a Palindrome");
		}
		else {
			System.out.println("Its not a Palindrome");
		}
	}

}
