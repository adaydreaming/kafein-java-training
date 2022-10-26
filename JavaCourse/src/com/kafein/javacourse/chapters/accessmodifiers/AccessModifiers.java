package com.kafein.javacourse.chapters.accessmodifiers;

public class AccessModifiers {

	
	public static void main (String[] args) {
		
		System.out.println("----------- Case 1 ---------------");
		AcessModifiersPublic acessModifiersPublic = new AcessModifiersPublic();
		System.out.println(acessModifiersPublic.getKafein());
		
		System.out.println("----------- Case 2 ---------------");
		AcessModifiersPrivate acessModifiersPrivate = new AcessModifiersPrivate();
		//System.out.println(acessModifiersPrivate.getKafein());
		System.out.println(acessModifiersPrivate.getKafeinWithGetMethod());
		
		System.out.println("----------- Case 3 ---------------");
		AccessModifiersProtected accessModifiersProtected = new AccessModifiersProtected();
		accessModifiersProtected.protectedMethod();
		
		System.out.println("----------- Case 4 ---------------");
		AccessModifiersDefault accessModifiersDefault = new AccessModifiersDefault();
		
		accessModifiersDefault.getDefaultMethodInClass();
		accessModifiersDefault.getDefaultMethod();
	}
}
