package day7ArraysPractical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment1SortingElements {
	//Sorting elements using For loop a={50,20,40,10,100}  After sorting 10,20,40,50,100

	public static void main(String[] args) {
		/*	
		int a[]= {50,20,40,10,100};
		System.out.println("Before sorting "+Arrays.toString(a));
		Arrays.sort(a);    //using direct inbuilt method
		System.out.println("After sorting "+Arrays.toString(a));
*/
		
		//Using forloop
		 // Initialize the set
        Set<Integer> a = new HashSet<>(Arrays.asList(50, 20, 40, 10, 100));

        // Convert set to a list to allow sorting
        List<Integer> list = new ArrayList<>(a);

        // Sorting using a simple bubble sort for educational purposes
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap the elements
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        // Print the sorted list
        System.out.println("Sorted list: " + list);
	}

}
