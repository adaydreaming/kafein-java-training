package com.kafein.javacourse.chapters.inheritance;

public abstract class Carnivorous extends LungBreathing {

	@Override
	public void getNutrition() {
		System.out.println("Carnivorous eat meat");
	}
	
	public void getSound() {
		System.out.println("Carnivorous make sound");
	}
}
