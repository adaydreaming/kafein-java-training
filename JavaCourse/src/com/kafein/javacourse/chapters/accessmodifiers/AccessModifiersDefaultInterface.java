package com.kafein.javacourse.chapters.accessmodifiers;

public interface AccessModifiersDefaultInterface {

	
	default void getDefaultMethod() {
		System.out.println("I am a Default method :) ");
	}
	
	public void getName();
}
