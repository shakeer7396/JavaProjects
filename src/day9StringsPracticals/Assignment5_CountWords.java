package day9StringsPracticals;

import java.util.Scanner;

//Count words in a string
public class Assignment5_CountWords {
	public static void main(String[]args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		//	String s = sc.next(); //It prints only first single word what you gave like : Automation
		String s = sc.nextLine(); //It prints full words what you gave like : Automation works with java python
		System.out.println("Entered words are : "+s);
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if((s.charAt(i)==' ') && (s.charAt(i+1) !=' ') ) {
				count++;
			}
		}
		System.out.println("Number of words in a string is : "+count);


	}
}
