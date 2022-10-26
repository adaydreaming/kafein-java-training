package com.kafein.javacourse.chapters.accessmodifiers;

public class AcessModifiersPrivate {

	private static String kafein = "Kafein";

	private String getKafein() {
		return kafein;
	}

	private void setKafein(String kafein) {
		AcessModifiersPrivate.kafein = kafein;
	}
	
	public String getKafeinWithGetMethod() {
		return getKafein();
	}
}
