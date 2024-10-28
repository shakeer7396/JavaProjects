package day7ArraysPractical;

import java.util.Arrays;

public class SortingElements {

	public static void main (String[]args) {
		int a[] = {10,60,20,40,30,50};
		System.out.print("Before Sorting the array ");
	 System.out.println(Arrays.toString(a)); // [10, 60, 20, 40, 30, 50] Printing the all elements in the array without running the loop [Inbult Method]
//		for(int value : a) {
//			System.out.println(value);
//		}
		Arrays.sort(a);
		System.out.print("After Sorting the array ");
		System.out.println(Arrays.toString(a));

	}
}
