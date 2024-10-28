package day9StringsPracticals;

public class Assignment3_RemoveWhiteSpaes {
// How to remove white spaces in a string
	public static void main(String[] args) {
		//replace all method
		String s = "    Ja va       Selen  ium is     a prog ra mming       Lang ua  ge";
		s=s.replaceAll(" ",""); //both same output
		//s=s.replaceAll("\\s",""); 
		System.out.println(s);

	}

}
