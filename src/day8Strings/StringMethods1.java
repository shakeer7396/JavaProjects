package day8Strings;

import java.util.Arrays;

public class StringMethods1 {
public static void main(String[]args) {
	//2 different ways to create a string both are same they store data in database its different
//	String s= "Hello";
//	String str = new String("Welcome");
//	System.out.println("s is- "+ s + " and str is- "+str);
	
	//Length()  return length of the string(number of characters)
	
/*	//s.length();   //Its a inbuilt method
	String s = "Hello World";
	System.out.println("Length is "+s.length());
	System.out.println("Welcome ".length()+" is the Full length"); //Single line using length
*/
	
	//Direct method 
/*	String s = "Hello--World";
	int length = 0;
	//Running and count
	for(char c:s.toCharArray()) {
		length++;
	}
	System.out.println("length is "+length);
	*/
	
	//concat()  Joining the multiple strings into single
/*	
	String s1 = "Welcome";
	String s2 = "to Java";
	String s3 = " Selenium";
	System.out.println(s1+s2+s3); //use this also or
	System.out.println(s1.concat(s2).concat(s3));// using inbuilt its takes 2 string only now 3 Strings there so add again .concat()
	System.out.println("Welcome "+ "to Java"); // It works only text 
	System.out.println("Welcome to".concat(s3));
*/
	
	//Trim()  Remove spaces from right and left of the string;
	/*
	String s = "   Welcome   ";
	System.out.println(s); //   Welcome   
	System.out.println("before trim length is : "+s.length()); //13
	System.out.println(s.trim()); //Welcome
	System.out.println("After trim length is : "+s.trim().length()); //7
	*/
	
	//charAt() -Returns a character from a string based on index
	//index starts from 0
//	String s = "welcome";
//	System.out.println(s.charAt(0)); //w
//	System.out.println(s.charAt(3)); //c
	
	//contains()  -Returns true/false only   [string is case sensitive it check only same, capital and sequence missing (false)]
	//It checks checking string is part of main string or not 
	/*
	String s = " welcome";
	System.out.println(s.contains("wel")); //ture
	System.out.println(s.contains("Wel")); //false
	System.out.println(s.contains("WEL")); //false
	System.out.println(s.contains("com")); //true
	System.out.println(s.contains("wecom")); //false
*/
	
	//equals(), & equalsIgnoreCase() -Both are using comparing the strings
	/*
	String s1 = "welcome";
	String s2 = "welcome";
	System.out.println(s1==s2); //true
	System.out.println(s1.equals(s2)); //true
	System.out.println(s1.equals("Welcome")); //false
	System.out.println(s1.equalsIgnoreCase("Welcome")); //true
 */
	
	//replace() -Replace the single/multiple [but(sequence)order] of characters in a string
//	String s = "learning java selenium python selenium c# selenium automation";
//	System.out.println(s.replace('e', 'A')); // replace single character
//	System.out.println(s.replace("selenium", "programing")); // replace multiple character with sequence
	
	
	//substring() -Extract substring with the main string
	//starting takes base on index value  - 0		//ending taken base on length value 
			//  01234567
//	String s = "Selenuim";
//			//  12345678
//	System.out.println(s.substring(0, 4)); //Sele
//	System.out.println(s.substring(4,7)); //nui
	
	
//	//toUpperCase()-converting small to Capital   toLowerCase()-converting Capital to Small
//	String s = "WeLLcome To BEnglore";
//	System.out.println(s.toUpperCase()); //WELLCOME TO BENGLORE
//	System.out.println(s.toLowerCase()); //wellcome to benglore
	
	
	//split() -Split the sting into multiple parts based on delimeter(Special characters or any except [*,%,^,&,()])
//	String s = "abcd@gmail.com";
//	String a[] = s.split("@");
//	System.out.println(Arrays.toString(a)); //[abcd, gmail.com]
//	System.out.println(a[0]); //abcd
//	System.out.println(a[1]); //gmail.com
	
	//ex-1
	//You have to seperate this abc 123@gmail.com into abc 123 gmail.com
	String s = "abc 123@gmail.com";
	String arr1[]= s.split(" ");
	System.out.println(Arrays.toString(arr1)); //[abc, 123@gmail.com]
	String arr2[]= arr1[1].split("@");
	System.out.println(Arrays.toString(arr2)); //[123, gmail.com]
	System.out.println((arr1[0]+arr2[0])+arr2[1]); //abc123gmail.com
		
}
}
