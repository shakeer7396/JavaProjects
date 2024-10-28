package day4;

public class FindLargestNum {

	public static void main(String[] args) {
//		int a = 80, b = 40, c = 30 ;
//		if(a>b && a>c) {
//			System.out.println("a is Largest Number  "+a);
//		}
//		else if(b>a && b>c) {
//			System.out.println("b is Largest Number  "+b);
//		}
//		else if(c>a && c>b) {
//			System.out.println("c is Largest Number  "+c);
//		}
		
		// Assignment same write in ternary operator
		//Syntax
		//Variable = (expression) ? result-1 : result-2 ;
		//Print above Assigned variable name if true gave result-1, if false gave result-2;
		
//		 int a=50, b=20;
//		 int out=(a>b)?a:b;
//		 System.out.println("Largest Number is  "+out);
		

        // Using nested ternary operators to find the largest number
		int a=25, b=35, c=45;
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The largest number is: " + largest);
        
//        The outer ternary operator first checks if a is greater than b.
//        If a is greater than b, it then checks if a is greater than c. If true, a is the largest; otherwise, c is the largest.
//        If a is not greater than b, it then checks if b is greater than c. If true, b is the largest; otherwise, c is the largest.
//        The result is stored in the variable largest, which is then printed to the console.
		 
	}

}
