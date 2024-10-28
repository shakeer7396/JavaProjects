package day4;

public class NestedIf {

	public static void main(String[] args) {
		//		if(true) {//if true then only go another if and print or if false print else same as first if also
		//			if(true) {
		//				System.out.println("abc");
		//			}
		//			else {
		//				System.out.println("xyz");
		//			}
		//		}
		//		else {
		//			System.out.println("123");
		//		}

		//Print Week Names
		int day=3;
		
		if(day==1) {
			System.out.println("Monday");
		}
		else if(day==2) {
			System.out.println("Tuesday");
		}
		else if(day==3) {
			System.out.println("Wednesday");
		}
		else if(day==4) {
			System.out.println("Thursday");
		}
		else if(day==5) {
			System.out.println("Friday");
		}
		else if(day==6) {
			System.out.println("satday");
		}
		else if(day==7) {
			System.out.println("sunday");
		}
		else {
			//For invalid number
			System.out.println("Its a iNvalid number");
		}
		
	}
}
