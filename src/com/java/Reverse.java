package com.java;

public class Reverse {

	public static void main(String[] args) {
		
		String word ="Welcome to Greens Java Selenium Frameworks";
		String revword="";
        
		 int length = word.length();
		
		for(int i =length-1;i>=0;i--)
		{
			revword =revword+word.charAt(i);
		}
		{
		System.out.println("Reversed string is"+revword);

	}	
		for (int i=length-1;i>0;i--)
	  {
	    	char c = word.charAt(i);
			System.out.print(c);
 
	    
	  }
		
	}

	
}
