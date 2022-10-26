package com.kafein.javacourse.chapters.iooperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IoOperations {

	
	public List<Character> getInputStreamReader() {
		// InputStreamReader class to read input
        InputStreamReader inp = null;
  
        // Storing the input in inp
        inp = new InputStreamReader(System.in);
  
        System.out.println("Enter characters, "
                           + " and '0' to quit.");
        char c = 'a';
        List<Character> charList = new ArrayList<>();
        do {
            try {
				c = (char)inp.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
            charList.add(c);
            System.out.println(c);
        } while (c != '0');
        return charList;
	}
	
	public List<Byte> getFileStream() throws IOException {
		FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
        List<Byte> byteList = new ArrayList<>();
        try {
            sourceStream = new FileInputStream("sorcefile.txt");
            targetStream = new FileOutputStream("targetfile.txt");
  
            // Reading source file and writing
            // content to target file byte by byte
            int temp;
            while ((temp = sourceStream.read()) != -1) {
                targetStream.write((byte)temp);
                byteList.add((byte)temp);
            }
        }
        finally {
            if (sourceStream != null)
                sourceStream.close();
            if (targetStream != null)
                targetStream.close();
        }
        
        return byteList;
	}
	
	
	public static void main(String[] args) {
		IoOperations ioOperations = new IoOperations();
		System.out.println("----------- Case 1 ---------------");
		List<Character> charList = ioOperations.getInputStreamReader();
		for (Character character : charList) {
			System.out.print(character);
		}
		System.out.println("\n----------- Case 2 ---------------");
		List<Byte> byteList = new ArrayList<>();
		try {
			List<Byte> bytes = ioOperations.getFileStream();
			byteList.addAll(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n----------- Byte Value ---------------");
		for (Byte byteValue : byteList) {
			System.out.print(byteValue);
		}
		System.out.println("\n----------- Char Value ---------------");
		byte[] byteArray = new byte[byteList.size()];
		int index = 0;
		for (Byte byteValue : byteList) {
			byteArray[index] = byteValue;
			index++;
		}
		System.out.println("readed value : " + new String(byteArray) );
	}
	
	
	
}
