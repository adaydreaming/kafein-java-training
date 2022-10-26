package com.kafein.javacourse.chapters.datatypes;

public class NonPrimitiveDataTypes {
	
	public static void main (String[] args) {
		System.out.println("----------- Case 1 ---------------");
		int intType = 12;
		System.out.println("int: " + intType);
		System.out.println("----------- Case 2 ---------------");
		byte byteType1 = -128;
		System.out.println("byte 1: " + byteType1);
		System.out.println("----------- Case 3 ---------------");
		byte byteType2 = 127;
		System.out.println("byte 2: " + byteType2);
		System.out.println("----------- Case 4 ---------------");
		float floatType = 0.123456789123456789123456789f;
		System.out.println("float: " + floatType); // yuvarlayarak sonunu 8'den 9 'a tamamlıyor
		System.out.println("----------- Case 5 ---------------");
		double doubleType = 0.123456789123456789123456789;
		System.out.println("double: " + doubleType); 
		System.out.println("----------- Case 6 ---------------");
		long longType = 1234567891234567891l;
		System.out.println("long: " + longType); 
		System.out.println("----------- Case 7 ---------------");
		boolean booleanType = true;
		System.out.println("boolean: " + booleanType); 
		System.out.println("----------- Case 8 ---------------");
		char charType = 's';
		System.out.println("char: " + charType); 
		
	}

}
