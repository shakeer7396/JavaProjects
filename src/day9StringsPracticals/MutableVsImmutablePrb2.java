package day9StringsPracticals;

import java.util.Arrays;

public class MutableVsImmutablePrb2 {

	public static void main(String[] args) {
		// Mutable example
/*			//Arrays
		int a[] = {10,50,20,60,30,40};
		System.out.println("Before Sorting "+Arrays.toString(a)); //[10, 50, 20, 60, 30, 40]
		Arrays.sort(a);  //Its mutable so this changed original array
		System.out.println("After sorting "+Arrays.toString(a)); //[10, 20, 30, 40, 50, 60]
*/
		//Immutable example
/*		 //String
		String s ="welcome";  //you use String s= new String("welcome") this also same
		System.out.println("Before Concat "+ s); //welcome
		s.concat("to java");
		System.out.println("After Concat directly "+ s); //welcome (Its immutable so not changed original string directly)
		String concatString = s.concat(" to java");
		System.out.println("After Concat with creating another string "+ concatString); //welcome to java
*/
		//StringBuffer Its also mutable  (concat method is not working in below classes)
		StringBuffer s = new StringBuffer("Welcome ");
		s.append("to Selenium"); //Its a method only work in StringBuffer & StringBuilder it changed the original string
		System.out.println(s); //Welcome to Selenium
		
		//StringBuilder Its also mutable
				StringBuilder st = new StringBuilder("Welcome ");
				st.append("to Java"); //Its a method only work in StringBuffer & StringBuilder it changed the original string
				System.out.println(st); //Welcome to Selenium
	}

}
