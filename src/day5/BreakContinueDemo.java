package day5;

public class BreakContinueDemo {

	public static void main(String[] args) {
		//break means stop the loop
//		for(int i=1;i<10;i++) {
//			if(i==5) {
//				break;
//			}
//			System.out.println(i);
//			}
		
		//continue means skipping the particular number and print other numbers
		//Skipping the 5th number
//		for(int i=1;i<=10;i++) {
//			if(i==5) {
//				continue;
//			}
//			System.out.println(i);
//			}
		
		//Skip 3,5,8 numbers
		for(int i=1;i<=10;i++) {
			if(i==3 || i==5 || i==8) {
				continue;
			}
			System.out.println(i);
			}
			
		}

	}


