package com.hutech.unittest;

public class PrintLengthMoreThanFourChar {
	public static void print() {
		String[] s1 = { "Ramesh", "Aajy", "Abhishek", "Smita", "Jay", "Amit", "Roja" };
		for (int i = 0; i < s1.length; i++) {
			while (s1[i].length() > 4) {
				System.out.println(s1[i] + " ---- >" + s1[i].length());
				break;
			}
		}
	}
}
