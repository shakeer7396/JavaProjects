package day7ArraysPractical;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWrittingDataIntoAnArray {
// Reading And Writing Data and adding Into An Array using Scanner class
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a [] = new int[5];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a value for the position "+i+" :");
			a[i]=sc.nextInt();
					}
		
		System.out.println("Printing an elements into an Array "+Arrays.toString(a));

	}

}
