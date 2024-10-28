package day7ArraysPractical;

public class MultiDimensionalArraysSearching {

	public static void main(String[] args) {
		/*Declaring array
		Approach-1
		It is a fixed approach, you know already how many values is came in further you don't add anything, then we can use this approach
		*/
		
		/*int a[][] = new int[3][2]; 	//Declaring syntexes 3 ways
		//int [][]a = new int [3][2];
		//int []a[] = new int [3][2];

		a[0][0]=10;
		a[0][1]=20;

		a[1][0]=30;
		a[1][1]=40;

		a[2][0]=50;
		a[2][1]=60;
	*/	
	
		//Approach-2
		//It is not fixed its a dynamic you can add and remove values whenever you want
		int a[][] = { {10,20}, {30,40}, {50,60} };
		int searchElement = 20;
		boolean status = false;
		
	//	normal for loop
		
//		for(int r=0;r<a.length;r++) {				//It is running in rows inner
//			for(int c=0;c<a[r].length;c++) {		//It is running in columns
//				if(a[r][c]==searchElement) {
//					System.out.print("Element Found");
//					status = true;
//					break;
//				}
//			}			
//		}
//		if(status == false) {
//			System.out.println("Element not Found");
//		}
		
		//Enhanced for loop
		
		for(int row[]:a) {		
			for(int col:row) {	
				if(col==searchElement) {
					System.out.print("Element Found");
					status = true;
					break;
				}
			}			
		}
		if(status==false) {
			System.out.println("Element not Found");
		}
		

	}

}
