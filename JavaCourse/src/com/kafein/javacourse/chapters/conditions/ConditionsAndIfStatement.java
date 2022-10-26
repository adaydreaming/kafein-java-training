package com.kafein.javacourse.chapters.conditions;

public class ConditionsAndIfStatement {

	public static void main (String[] args) {
		//less and less equal
		int smallValue = 10;
		int equalValue = 10;
		int bigValue = 20;
		System.out.println("----------- Case 1 ---------------");
		if(smallValue < bigValue) {
			System.out.println("It is small !");
			System.out.println("Operator return value = " + (smallValue < bigValue));
		}
		System.out.println("----------- Case 2 ---------------");
		
		if(smallValue == equalValue) {
			System.out.println("It is equal !");
			System.out.println("Operator return value = " + (smallValue == equalValue));
		}
		System.out.println("----------- Case 3 ---------------");
		
		if(smallValue <= bigValue && smallValue <= equalValue) {
			System.out.println("It is less or equal !");
			System.out.println("Operator return value = " + (smallValue <= bigValue && smallValue <= equalValue) );
		}
		System.out.println("----------- Case 4 ---------------");
		
		if(smallValue > bigValue) {
			System.out.println("It is big !");
			System.out.println("Operator return value = " + (smallValue > bigValue));
		} else {
			System.out.println("It is small !");
			System.out.println("Operator return value = " + (smallValue > bigValue));
		}
		System.out.println("----------- Case 5 ---------------");
		
		if(smallValue >= equalValue || smallValue > equalValue) {
			System.out.println("It is big equal or big!");
			System.out.println("Operator return value = " + (smallValue >= equalValue || smallValue > equalValue) );
		} 
		System.out.println("----------- Case 6 ---------------");
		
		if(smallValue >= equalValue && smallValue > equalValue) {
			System.out.println("It is big equal and big!");
			System.out.println("Operator return value = " + (smallValue >= equalValue || smallValue > equalValue) );
		} else if(smallValue >= equalValue || smallValue > equalValue) {
			System.out.println("It is big equal or big!");
			System.out.println("Operator return value = " + (smallValue >= equalValue || smallValue > equalValue) );
		} 
		 
	}
}
