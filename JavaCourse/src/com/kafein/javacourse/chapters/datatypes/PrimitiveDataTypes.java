package com.kafein.javacourse.chapters.datatypes;

public class PrimitiveDataTypes {
	
	public static void main (String[] args) {
		System.out.println("----------- Case 1 ---------------");
		Integer integerType = 12;
		System.out.println("Integer: " + integerType);
		int intType = 12;
		System.out.println("Integer eq int: " + (intType == integerType));
		Integer integerType2 = new Integer(12);
		System.out.println("integerType2: " + integerType);
		System.out.println("Integer eq Integer2: " + (integerType2 == integerType));
		System.out.println("Integer eq function Integer2: " + (integerType2.equals(integerType)));
		Integer integerType3 = intType;
		System.out.println("integerType3: " + integerType3);

		
		System.out.println("----------- Case 2 ---------------");
		
		
		Long longType = new Long(123);
		long pimitiveLongType = 123;
		System.out.println("longType eq pimitiveLongType: " + (longType == pimitiveLongType));
		Long longType2 = new Long(123);
		System.out.println("longType eq longType2: " + (longType == longType2));
		System.out.println("longType eq function longType2: " + (longType.equals(longType2)));
		Long longTypeCast = (long)intType;
		System.out.println("longTypeCast: " + longTypeCast);

		System.out.println("----------- Case 3 ---------------");
		
		
		String stringType = "Java Öğreniyorum";
		System.out.println("String: " + stringType);
		char[] charArray = stringType.toCharArray(); // Arrays
		System.out.print("String Array : ");
		for(int i = 0; i < charArray.length; i++ ) {
			System.out.print(charArray[i]);
		}
		System.out.println();

		System.out.println("----------- Case 4 ---------------");
		
		
		Boolean bolleanType = null;
		System.out.println("Boolean null " + bolleanType);
		bolleanType = true;
		System.out.println("Boolean true " + bolleanType);
		
		
	}

}
