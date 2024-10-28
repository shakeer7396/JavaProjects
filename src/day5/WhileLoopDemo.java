package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		//In while loop first check the condition it satisfied then only statement will be executed
		
		//Print 1 to 10 numbers
//		int i=1; 					//initialization
//		while(i<=10) { 				//condition
//			System.out.println(i);  // Statement
//			i++;   					//Increment
//		}
		
		//Print Hello Message 10 times
//		int i=1;
//		while(i<=10) {
//			System.out.println("Hello "+i);
//			i++;
//		}
		
		//Print Even Numbers between 1 to 10
		//Approach-1
//		int i=2;
//		while(i<=10) {
//			System.out.println(i);
//			i+=2;
//		}
		
		//Approach-2
//				int i=1;
//				while(i<=10) {
//					if(i%2==0) {
//					System.out.println(i);
//					}
//					i++;
//				}
		
		
		//Print Even and Odd Both
//				int i=0;
//				while(i<=10) {
//					if(i%2==0) {	
//						System.out.println(i+" is a Even Number");
//					}
//					else if(i%2==1) {
//						System.out.println(i+" is a Odd Number");
//					}
//					i++;
//				}
		
		//Print Descending numbers 10 To 1.
//		int i=10;
//		while(i>=1) {
//			System.out.println(i);
//			i--;
//		}
		
		//Printing without knowing end number
		int i=1;
		while(true) {
			System.out.println(i);
			i++;
			if(i==10) {
				break;
			}
		}
	
		

	}

}
