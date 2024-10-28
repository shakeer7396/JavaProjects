package day5;

public class Assigmnent {

	public static void main(String[] args) {
		
		//1.Reverse numbers
		
//		int rev =1234;
//		 int reversedNumber = 0;
//	        
//	        while (rev != 0) {
//	            int digit = rev % 10;  // Extract (Catch out) the last digit
//	            reversedNumber = reversedNumber * 10 + digit;  // Append the digit to the reversed number
//	            rev = rev / 10;  // Remove the last digit
//	        }
//	        System.out.println("Reversed number is: " + reversedNumber);
		
			
		//2.Palindrome input=121 after reversing output =121
		
/*
		int num = 321;
		int originalNum=123;
		int reversedNum = 0;
		
		// Reverse the number
		while(num!=0) {
		int digit = num%10;
		System.out.println("digit is "+digit);
		reversedNum=reversedNum*10+digit;
		System.out.println("reversedNum-1 is "+reversedNum);
		num/=10;
		System.out.println("num is "+num);
		}
		System.out.println("reversedNum-2 is "+reversedNum);
		
		// Check if the original number is equal to the reversed number
		if(originalNum==reversedNum) {
			System.out.println("Its a Palindrome");
		}else {
			System.out.println("Its not a Palindrome");
		}
		*/
		
		//3.Count number of digits in a number input=423424 output=6
		
/*		int num = 423424;
		int count=0;
		while(num!=0) {
			num/=10;
			System.out.println(num);
			count++;
		}
		System.out.println("Count is "+count);
*/		
		
		
		//4.Count number of Even and Odd digits in a Number input=23456 output=3-Even 2-Odd
		
//		 int num = 23456;
//	        int evenCount = 0;
//	        int oddCount = 0;
//	        
//	        while (num != 0) {
//	            int digit = num % 10;  // Extract the last digit
//	            if (digit % 2 == 0) {  // Check if the digit is even
//	                evenCount++;
//	            } else {  // If the digit is not even, it is odd
//	                oddCount++;
//	            }
//	            num /= 10;  // Remove the last digit
//	        }
//	        
//	        System.out.println("Even Count is " + evenCount);
//	        System.out.println("Odd Count is " + oddCount);
//		
		
		//5.Find sum of digits in a number input=12345 output=15 
		
///*
 		int num = 12345;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;  // Extract the last digit
            System.out.println("Extracting point step-1 "+digit);
            sum += digit;          // Add the digit to the sum
            System.out.println("Adding digit step-2 "+sum);
            num /= 10;             // Remove the last digit
            System.out.println("Removing step-3 "+num);
        }

        System.out.println("Sum of digits: " + sum);  // Print the sum
//*/
	}

}
