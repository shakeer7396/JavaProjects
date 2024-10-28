package day5;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		// Syntax
		//int i=1;
//		do{
//			statement;
//		inc/dec
//		}
//		while(condition);

		//In Do while loop first execute the statement once then check the condition
		//print 1 to 10 numbers
//		int i=1;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<=10);
		
		//print 10 to 1 numbers
		int i=10;
		do {
			System.out.println(i);
			i--;
		}while(i>0); //or i>=1 both same
	}

}
