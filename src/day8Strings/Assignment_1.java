package day8Strings;

public class Assignment_1 {

	public static void main(String[] args) {
		// check true or false with john with multiple methods
		String name ="John Kendey";
		//System.out.println(name.contains("john")); //false
		System.out.println(name.replace("J"," j").contains("john")); //true  method-1
		System.out.println(name.toLowerCase().contains("john")); //true  method-2  one method combine another method


	}

}
