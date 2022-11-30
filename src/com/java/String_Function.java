package com.java;

public class String_Function {
	
	public static void main(String[] args) {
		
		String str = "Welcome To Greens";
		
		String[] split = str.split(" ");
		
		System.out.println(split[2]);
		
		System.out.println(str);
		
		String trim = str.trim();
		
		System.out.println(trim);
		
		String str1 = "Welcome To Greens";
		
		int compareTo = str.compareTo(str1);
		
		System.out.println(compareTo);
		
		
		
	}
	
	

}
