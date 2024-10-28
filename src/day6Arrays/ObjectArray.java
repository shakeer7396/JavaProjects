package day6Arrays;

//Heterogeneous
//Arrays can also store heterogeneous data
public class ObjectArray {

	public static void main(String[] args) {
		
		//int a[] = {100,1.5,'A',"WELLCOME",true}; //All types of data there so not working int 
		Object a[] = {100,1.5,'A',"WELLCOME",true}; // Object is SuperSet or Root class of java pre-defined classes like a String, So it allows to store all types of data
		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		for(Object x:a) {   //First array a data stored in x then print one by one
			System.out.println(x);
		}
	}

}
