package com.kafein.javacourse.chapters.classtypes;

public class ClassTypes {

	public static void main (String[] args) {
		System.out.println("----------- Case 1 ---------------");
		for(CarBrandEnum carBrand : CarBrandEnum.values()) {
			System.out.println(carBrand.name());
		}
		
		System.out.println("----------- Case 2 ---------------");
		Mercedes mercedes = new Mercedes();
		mercedes.drive();
		mercedes.horn();
		
		if(!mercedes.isDrift()) {
			System.out.println("Mercedes not a drift car");
		}
	}
}
