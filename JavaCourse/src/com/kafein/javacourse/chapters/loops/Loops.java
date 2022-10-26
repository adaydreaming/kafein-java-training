package com.kafein.javacourse.chapters.loops;

public class Loops {

	public static void main (String[] args) {
		String[] randomWords = {"Kafein", "learn", "Java"};
		System.out.println("----------- Case 1 ---------------");
		for(int i = 0; i < randomWords.length; i ++) {
			System.out.print(randomWords[i] + " ");
		}
		
    	System.out.println("\n----------- Case 2 ---------------");
    	for(int i = randomWords.length - 1; i >= 0; i-- ) {
			System.out.print(randomWords[i] + " ");
		}
    	
    	System.out.println("\n----------- Case 3 ---------------");
    	int index = 0;
    	for(String value : randomWords) {
    		System.out.print("index= " + index + " value = " + value + " " );
    		index ++;
		}
    	
    	System.out.println("\n----------- Case 4 ---------------");
    	index = 0;
    	while(randomWords.length > index) {
    		System.out.print("index= " + index + " value = " + randomWords[index] + " " );
    		index ++;
    	}
    	
    	System.out.println("\n----------- Case 5 ---------------");
    	index = 0;
    	do{
    		System.out.print("index= " + index + " value = " + randomWords[index] + " " );
    		index ++;
    	} while(randomWords.length > index);
	}
}
