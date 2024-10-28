package day9StringsPracticals;

public class Assignment2_RemoveSpecChars {
	// Remove Junk or Special Characters in String
	// Using Replace method
	public static void main(String[] args) {
	/*	
		String s = "Hello!@~# Hai How$%   ^&* Are You()_-=+";
		String Special_Char=s.replaceAll("[a-zA-Z0-9]", ""); //!@~#  $%   ^&*  ()_-=+
		String Text=s.replaceAll("[^a-zA-Z0-9]", ""); //HelloHaiHowAreYou
		System.out.println(Special_Char);
		System.out.println(Text);
	*/
		
		//Without Using Replace method
		
		String s = "Hello!@~# Hai How$%   ^&* Are You()_-=+";
		String CleanStr ="";
		
		// Iterate through each character of the string
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			// Append to the new string if character is a letter, digit, or space
			if(Character.isLetterOrDigit(ch) || Character.isWhitespace(ch) ) {
				CleanStr += ch; // Concatenating to the string
			}
		}
		System.out.println("Original String: " + s);
		System.out.println("Special Characters are "+CleanStr); //Hello Hai How    Are You
		
        
	}

}
