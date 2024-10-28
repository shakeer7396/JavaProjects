package day3;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		//ternary operator / condition operator
		
//		int a= 20,  b=10;
//		int x=(a<b)?a:b;
//		System.out.println(x);//10

//		int x=(1==1)?200:100;
//		System.out.println(x); //200
		
		// If the expression is true prints first statement or else print second,
		
		int person_Age =25;
		String res = (person_Age > 18)? "elegible for vote": "not elegible for vote";
		System.out.println(res);
	}

}
