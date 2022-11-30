package com.java;

public class Reverse_String {
	
public static void main(String[] args) {
	
	String s = "Welcome";
	String tem = "";
	
    int length = s.length();

for (int i = length-1; i >= 0; i--) {
		
	 tem = tem+s.charAt(i);
}
	System.out.println(tem);
if(s==tem) 
{
System.out.println("given word is palindrome");
}
else
{
	System.out.println("given word is not palindrome");
}
}
}