package com.kafein.javacourse.chapters.acccessmodifiersprodected;

import com.kafein.javacourse.chapters.accessmodifiers.AccessModifiersProtected;


public class ProdectedClass {
	public static void main (String[] args) {
		
		AccessModifiersProtected accessModifiersProtected = new AccessModifiersProtected();
		//accessModifiersProtected.protectedMethod();  --> Erişilemez hata verir
		accessModifiersProtected.getProtectedMethod();
		
	}
}
