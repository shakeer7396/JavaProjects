package day7ArraysPractical;

public class SearchingElementInArray {

	public static void main(String[] args) {
		// Search an element is present in array or not (linear search)
		// We are checking only this element present or not thats it not checking for same multiple elements came then what
		int a[]= {10,20,30,40,50};
		int search_element = 70;
		boolean status =false;		//false - not found  true found
		//For Loop-1
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==search_element) {
//				System.out.println("Element found");
//				status = true;
//				break;
//			}
//		}
		
		//ForEach loop-2
		for(int x:a) {
			if(x==search_element) {
				System.out.println("Element Found");
				status = true;
				break;
			}
		}
		//we can use else there it prints every time if the element is there then only print, if not there going outside the loop 
		//System.out.println("Element not found");
		if(status==false) {
			System.out.println("Element not Found");
		}
	}

}
