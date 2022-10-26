package com.kafein.javacourse.chapters.accessmodifiers;

public class AccessModifiersDefault implements AccessModifiersDefaultInterface{

	@Override
	public void getName() {
		System.out.print("I am AccessModifiersDefault class");
		
	}

	public void getDefaultMethodInClass() {
		getDefaultMethod();
	}
}
