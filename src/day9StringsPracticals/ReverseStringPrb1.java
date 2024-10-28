package day9StringsPracticals;

public class ReverseStringPrb1 {

	public static void main(String[] args) {
		// Approach-1 				with using 2 methods 1-length() & 2-charAt() for finding with the index value
/*
		String s= "welcome";
		String rev = "";
		
		for(int i = s.length()-1;i>=0;i--) {
			//System.out.println(i); // printing indexes in reverse step by step
			//System.out.println(s.charAt(i)); //Printing the string values in reverse step by step
			rev=rev+s.charAt(i);  //Storing the values into empty string
		}
		System.out.println("Reverse String is "+rev);
*/	
		
		
		//Approach-2 				without using length() & charAt() methods using toCharArray() method.
/*		String s = "welcome";
		String rev = "";
		
		char a[]=s.toCharArray(); //It converts String into an Array[W,e,l,c,o,m,e] 
		for(int i=a.length-1;i>=0;i--) { //This length is a array method and finding the last index value of the array
			rev=rev+a[i];
		}
 	System.out.println("Reverse String is "+rev);
*/
		
		
		//Below classes are mutable objects but string is immutable object you can use directly or using new String key
		//mutable means it can be changed or modified but immutable it can't be changed or modified
		
		//Approach-3 					using StringBuffer Class 
//		StringBuffer s = new StringBuffer("welcome");
		//System.out.println(s); //welcome
//		System.out.println("Reverse String is "+s.reverse()); //this method contains direct string reverse power
		
		
		
				//Approach-4 					using StringBuilder Class 
				StringBuilder s = new StringBuilder("welcome");
				//System.out.println(s); //welcome
				System.out.println("Reverse String is "+s.reverse()); //this method contains direct string reverse power
				
	}

}
