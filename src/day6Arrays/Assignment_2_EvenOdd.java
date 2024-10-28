package day6Arrays;

public class Assignment_2_EvenOdd {

	public static void main(String[] args) {
		// Print Even and Odd numbers from array  // output even-3 odd-3
		int a[]= {1,2,3,4,5,6};
		int evenCount=0;
		int OddCount=0;
		

		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
			evenCount++;
			}
	
			else if(a[i]%2==1) {
				OddCount++;
			}
		
		}
		System.out.println("Even Numbers are "+ evenCount);
		System.out.println("Odd Numbers are "+OddCount);
	}

}
