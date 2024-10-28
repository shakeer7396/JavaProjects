package day7ArraysPractical;

public class FindDuplicates {
//Find Number of Repetations
	
	public static void main(String[] args) {
		int a[] = {10,80,30,80,50,80,60,60,70};
		int num=70;
		int Count =0;
		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==num) {
//				Count++;
//			}
//		}
		for(int value:a) {
			if(value==num) {
				Count++;
			}
		}
		System.out.println("Count is "+ Count);

	}

}
