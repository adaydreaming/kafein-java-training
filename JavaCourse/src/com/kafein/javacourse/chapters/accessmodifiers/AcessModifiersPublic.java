package com.kafein.javacourse.chapters.accessmodifiers;

public class AcessModifiersPublic {

	private static String kafein = "Kafein";

	public String getKafein() {
		return kafein;
	}

	public void setKafein(String kafein) {
		AcessModifiersPublic.kafein = kafein;
	}
	
}
