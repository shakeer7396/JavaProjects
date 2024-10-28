package day9StringsPracticals;

import java.util.Arrays;

public class Assignment4_CountRepeteNum {
//Count Repeated characters in a string
	public static void main(String[] args) {
	
		//Single Character count
/*		
		String s = "abbbccddeeffghhjiikkkmmll";
		int totalCount = s.length();
	// System.out.println(totalCount); //25
		int totalCount_afteRemove = s.replace("b","").length();
	//	System.out.println(totalCount_afteRemove); //22
		int count = totalCount-totalCount_afteRemove;
		System.out.println("Count of b is : "+count); //3	
		*/
		
		//Multiple Characters count
/*		
		 String s = "abbbccddeeffghhjiikkkmmll";
	        
	        // Create an array to store the frequency of each character (256 for extended ASCII)
	        int[] charCount = new int[256];
	        
	        // Iterate through the string and count occurrences of each character
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            charCount[ch]++;  // Increment the count based on ASCII value
	        }

	        // Display characters that have more than one occurrence (repeated characters)
	        System.out.println("Repeated characters and their counts:");
	        for (int i = 0; i < 256; i++) {
	            if (charCount[i] > 1) {
	                System.out.println((char) i + " : " + charCount[i]);
	            }
	        }
*/
	
	//	Another approach Brootforce
/*		
		        String s = "abbbccddeeffghhjiikkkmmll";
		        
		        // Convert the string to a character array
		        char[] chars = s.toCharArray();
		        
		        // Sort the character array
		        Arrays.sort(chars);
		        
		        System.out.println("Repeated characters and their counts:");
		        
		        // Traverse the sorted array and count consecutive occurrences
		        int count = 1;
		        for (int i = 1; i < chars.length; i++) {
		            if (chars[i] == chars[i - 1]) {
		                count++;
		            } else {
		                if (count > 1) {
		                    System.out.println(chars[i - 1] + " : " + count);
		                }
		                count = 1; // Reset count for the new character
		            }
		        }
		        
		        // Handle the last character group
		        if (count > 1) {
		            System.out.println(chars[chars.length - 1] + " : " + count);
		        }
*/	
		

		//Each Character count ASCII aporach-1
		
/*		 String s = "abbbccddeeffghhjiikkbkmmkll";
	        
	        // Create an array to store the frequency of each character (256 for extended ASCII)
	        int[] charCount = new int[256];
	        
	        // Iterate through the string and count occurrences of each character
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            charCount[ch]++;  // Increment the count based on ASCII value
	        }

	        // Display each character and its count
	        System.out.println("Character counts:");
	        for (int i = 0; i < 256; i++) {
	            if (charCount[i] > 0) {
	                System.out.println((char) i + " : " + charCount[i]);
	            }
	        }
*/	        
	        //Another  Brootforce Apporach
/*	     
	                String s = "abbbccddeeffghhjiikkbkmmkll";
	                String checkedChars = "";  // To store characters that have been counted

	                System.out.println("Character counts:");
	                
	                // Outer loop: iterate through each character in the string
	                for (int i = 0; i < s.length(); i++) {
	                    char currentChar = s.charAt(i);
	                    
	                    // If the character has already been counted, skip it
	                    if (checkedChars.indexOf(currentChar) != -1) {
	                        continue;
	                    }
	                    
	                    int count = 1;  // Start the count at 1 for the current character
	                    
	                    // Inner loop: count how many times the current character appears in the string
	                    for (int j = i + 1; j < s.length(); j++) {
	                        if (s.charAt(j) == currentChar) {
	                            count++;
	                        }
	                    }

	                    // Print the character and its count
	                    System.out.println(currentChar + " : " + count);
	                    
	                    // Add the character to the checked characters string
	                    checkedChars += currentChar;
	
	                }
	    */
	            }
	        }

		
	
