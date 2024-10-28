package day6Arrays;

//Arrays is a collection of elements of same data types (Homogeneous data).We can store multiple values into a single variable
//Syntex :- int a[] = new int[5]
//Types of arrays 1) Single Dimensional Arrays 2)Two dimensional / Multi-dimensional arrays

//1) Single Dimensional Arrays
//--------------------------------------------------------------------
//1)Declare an array
//2)Add values into array
//3)Find length of an array
//4)Read single value from an array
//5)Read multiple values from an array

//Any Programming language starting with 0 index value in an array;

public class Arrays_1 {

	public static void main(String[] args) {
		//Declaring array 
		//Approach-1 
		//It is a fixed approach, you know already how many values is came in further you don't add anything, then we can use this approach
//		int a[]=new int[5];
//		a[0]=10;  //Assign the array
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
		
		//Approach -2
		//It is not fixed its a dynamic you can add and remove values whenever you want
		int a[]= {10,20,30,40,50};
		
		//Find length of an array
		//System.out.println("Length of an array is "+a.length );
		
		//Read the single value from an array
		//System.out.println(a[4]); //here 4 is index, output is 50
		
		//Read multiple values from an array
//		for(int i=0;i<a.length;i++) {   // conditions i<=4 -->last index,	i<5,		i<=a.length-1,		i<a.length
//			System.out.println(a[i]);
//		}
		
		//Enhanced for loop / forEach loop
		for(int x:a) {
			System.out.println(x);
		}
		

	}

}
