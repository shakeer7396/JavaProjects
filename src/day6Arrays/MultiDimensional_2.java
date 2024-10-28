package day6Arrays;

//2) Multi-Dimensional /Two Dimensional Arrays
//--------------------------------------------------------------------
													// Indexes for Dimensional array
													//		0	  1
//1)Declare an array								// 0  [0,0] [0,1]
//2)Add values into array							// 1  [1,0] [1,1]
//3)Find length of an array							// 2  [2,0] [2,1]
//4)Read single value from an array					
//5)Read multiple values from an array

public class MultiDimensional_2 {

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
		
		//Find length of an array
		//System.out.println("Length of rows is "+a.length );
		//System.out.println("Length of the columns is "+a[0].length);
				
		//Read the single value from an array
		//System.out.println(a[2][1]); // indexes, output is 60
		
		//Read multiple values from an array
	//	normal for loop
		
//		for(int r=0;r<a.length;r++) {				//It is running in rows inner
//			for(int c=0;c<a[r].length;c++) {		//It is running in columns
//				System.out.print(a[r][c]+ " ");
//			}
//			System.out.println();  // this is using for data show in table format it taken next line for every iteration
//		}
		
		//Enhanced for loop
		for(int arr[]:a) {		//Its taking entire array going row by row and storing data in empty arr and giving for inner forloop
			for(int x:arr) {	//x will take stored data in empty array which is first it print then next this iteration is running col by col
				System.out.print(x+ " ");
			}
			System.out.println(); // this is using for data show in table format it taken next line for every iteration
		}
		
		

	}

}
