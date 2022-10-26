package com.kafein.javacourse.chapters.helloworld;

public class Argumants {

	/**
	 * args ise programın çalışması için verilen parametreleri alınmasını sağlar.
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		if(args.length > 0) {
			for(int i = 0; i < args.length; i++) {
				System.out.print(args[i] + " ");
			}
		} else {
			System.out.print("No argument found");
		}
		
	}

}
