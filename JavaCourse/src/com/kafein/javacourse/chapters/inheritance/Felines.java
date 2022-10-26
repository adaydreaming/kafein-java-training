package com.kafein.javacourse.chapters.inheritance;

public abstract class Felines extends Carnivorous {

	@Override
	public void getMovement() {
		
		System.out.println("Felines user four legs");
		
	}
	
	public void getFur() {
		
		System.out.println("Felines has fur");
	}
}
