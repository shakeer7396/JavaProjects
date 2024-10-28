package day7ArraysPractical;

public class Assignment4FindLowestNumber {

	public static void main(String[] args) {
		int a[] = {-5,1,2,3,4,44,5,77};

		int smallest = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest = a[i];
			}
		}
		System.out.println("Smallest number is "+ smallest);
	}

}
