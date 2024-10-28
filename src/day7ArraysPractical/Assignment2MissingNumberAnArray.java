package day7ArraysPractical;

public class Assignment2MissingNumberAnArray {
	
	//Find Missing Number in array a={1,4,5,3}
	//* Numbers should be in range  *should not have duplicates

	public static void main(String[] args) {
		  int[] a = {1,2, 4, 5, 3,7};  // Array with missing number
	        int n = a.length + 1;    // Total numbers should be length of array + 1 (since one number is missing)

	        // Calculate the sum of first n natural numbers
	        int expectedSum = n * (n + 1) / 2;

	        // Calculate the sum of elements in the array
	        int actualSum = 0;
	        for (int num : a) {
	            actualSum += num;
	        }

	        // The missing number is the difference between the expected sum and the actual sum
	        int missingNumber = expectedSum - actualSum;

	        System.out.println("Missing number: " + missingNumber);

	}

}
