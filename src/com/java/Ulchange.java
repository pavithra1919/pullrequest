package com.java;

public class Ulchange {

	public static void main(String[] args) {
		String sr = "WeLcOmE";
		String csr = "";
		String tem;
		
		
		String upc = sr. toUpperCase();
		
		for(int i=0; i<sr.length();i++) 
		{
			if (sr.charAt(i)==upc.charAt(i))
			{
				tem =""+sr.charAt(i);
				csr =csr +tem.toLowerCase();	
			}
			else
			{
				tem =""+sr.charAt(i);
				csr =csr+tem.toUpperCase();
			}
	}
		System.out.println(csr);
	}
}
