package day9StringsPracticals;
//Remove duplicates from this string
public class Assignment6_RemoveDuplicates {
	public static void main (String [] args) {
	String s = "abbbccddeeffghhjiikkkmmll";
	 String result = "";
     
     // Iterate through the string
     for (int i = 0; i < s.length(); i++) {
         char currentChar = s.charAt(i);
         boolean isDuplicate = false;
         
         // Check if the current character is already in the result
         for (int j = 0; j < result.length(); j++) {
             if (currentChar == result.charAt(j)) {
                 isDuplicate = true;
                 break;
             }
         }
         
         // If it's not a duplicate, add it to the result
         if (!isDuplicate) {
             result += currentChar;
         }
     }
     
     // Display the string without duplicates
     System.out.println("String without duplicates: " + result);
	
}
}