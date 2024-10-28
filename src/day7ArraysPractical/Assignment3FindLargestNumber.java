package day7ArraysPractical;

public class Assignment3FindLargestNumber {

	public static void main(String[] args) {
	int a[] = {-5,1,2,3,4,44,5,77};
		int largest =a[0];
		
	for(int i=0;i<a.length;i++) {
		if(a[i]>largest) {
			largest=a[i];
		}
	}
	System.out.println("Largest number is "+ largest);

	}

}
