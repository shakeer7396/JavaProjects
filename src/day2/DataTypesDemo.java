package day2;

public class DataTypesDemo {

	public static void main(String[] args) {
		// Primitive Data Types Numeric data types byte,short,int,long;
			
		byte byt = 125;
		System.out.println(byt);//small value whole numbers -128 to 127 -1byte
		
		short sht =3535;
		System.out.println(sht);//>small value whole numbers -32,768 to 32767 -2bytes
		
		int a=100, b=200;//medium value  whole numbers -2,147,483,648 to 2,147,483,647 -4bytes
		System.out.println("The value of a is : "+a);
		System.out.println("The value of b is : "+b);
		System.out.println("The value of a+b is : "+a+b);//100200 is output
		System.out.println("The value of a+b is : "+(a+b));//300 is output
		
		long lng =1234565578L;//put capital L or small l compulsory
		System.out.println(lng);//Long value  whole numbers more than int -8bytes
		
		//Decimal data types float, double;
		
		float flot = 15.5F;//put capital F or small f compulsory Fractional numbers 7 decimals -4bytes
		System.out.println(flot);
		
		double dbl = 12454.54545454; // Fractional numbers 15 decimals -8bytes
		System.out.println(dbl);
		
		char grade = 'A';//char works only single character with single quoutes 'A' letter; -2bytes
		System.out.println(grade);
		
		String name = "Srinivasulu"; //String works single or more characters with double quotes only
		System.out.println(name);
		
		boolean bln = false; // It works only true,false used for -1bit
		System.out.println(bln);
		
		System.out.println(Short.SIZE/8); // Java will tell which variable contains how many bytes by default with Size/8
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);// Java will tell which variable contains how much memory capacity 

	}

}
