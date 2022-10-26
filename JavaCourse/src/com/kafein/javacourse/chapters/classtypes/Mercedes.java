package com.kafein.javacourse.chapters.classtypes;

public class Mercedes extends CarAbstractClass{

	@Override
	public void drive() {
		System.out.println("Gives the feel of a ship when you drive");
	}

	@Override
	public void horn() {
		System.out.println("Honk gently.");
	}

	@Override
	public boolean isDrift() {
		return false;
	}

	

}
