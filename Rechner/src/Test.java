/*
 * Copyright (c) 2015 Ergon Informatik AG
 * Kleinstrasse 15, 8008 Zuerich, Switzerland
 * All rights reserved.
 */

/**
 * 
 */
public class Test {

	public static void main(String[] args) {
		String test = "1+2+3+4";
		
		for(int i = 0; i<3; i++){
		int[] index1 = new int[100];
		String[] text = new String[100];
		index1[i] = test.indexOf('+');
		System.out.println("index" + i + "=" + index1[i]);
		test = test.substring( index1[i] + 1);
		text[i] = test.substring(0, index1[i]);
		System.out.println(test);
		System.out.println(text[i]);
		}
	}
}
