package com.java;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
String sr ="silent";//string
String sr1 ="listen";

char a[] = sr.toCharArray();
char b[] = sr1.toCharArray();

Arrays.sort(a);
Arrays.sort(b);

Boolean r =Arrays.equals(a,b);
if(r==true)
{
	System.out.println("given word is Anagram");
}
else
{
	System.out.println("given word is not Anagram");
}
	}

}
