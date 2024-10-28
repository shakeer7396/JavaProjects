package day6Arrays;

public class Assignment_3_Prime {

	public static void main(String[] args) {
		//Print Prime numbers
		int num = 7;
		boolean isPrime = true;
		if(num <= 1) {
			isPrime = false;
		}
		else {
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num%i==0) {
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num + " is a not prime number");
		}

	}
}

