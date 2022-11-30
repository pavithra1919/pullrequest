package com.java;

public class String_Types {
	
	public static void main(String[] args) {
		
		String s = "Welcome";
		
		String s1 = " Greens";
		
        String s2 = s+" to";
        
       String s4 = s+s1;
       
       //==========Mutable String====
       
       StringBuffer sb = new StringBuffer("Courtallam");
       
       StringBuffer sb1 = new StringBuffer("Tenkasi");
       
       System.out.println(sb);
       
       sb.append(sb1);
       
       System.out.println(sb);
		
		
		
	}

}
