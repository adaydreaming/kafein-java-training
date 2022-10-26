package com.kafein.javacourse.chapters.inheritance;

public class Lions extends Felines {

	@Override
	public void getGrow() {
		
		System.out.println("Lions are grow");
		
	}
	
	public boolean isItaHunter(){
		System.out.println("Lions are hunter");
		return true;
	}
	
	@Override
	public void getSound() {
		System.out.println("lions are roar");
	}

}
