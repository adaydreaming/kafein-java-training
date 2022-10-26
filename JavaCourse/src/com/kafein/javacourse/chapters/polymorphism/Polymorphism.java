package com.kafein.javacourse.chapters.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Polymorphism {
	
	public static void printNames(String[] names) {
		for(String value : names) {
			System.out.println(value);
		}
	}
	
	public void printNames(List<String> names, boolean writeLine) {
		if(writeLine) {
			System.out.println("\nWrites line\n");
			for(String value : names) {
				System.out.print(value + " ");
			}
		} else {
			System.out.println("\nWrites one after the other\n");
			for(String value : names) {
				System.out.println(value);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] telcoCompanyBrand = {"Turkcell", "Vodafone", "TurkTelekom","Verizone"};
		printNames(telcoCompanyBrand);
		Polymorphism polymorphism = new Polymorphism();
		List<String> telcoCompanyBrandList = Arrays.asList(telcoCompanyBrand);
		polymorphism.printNames(telcoCompanyBrandList, false);
		polymorphism.printNames(telcoCompanyBrandList, true);
	}

}
