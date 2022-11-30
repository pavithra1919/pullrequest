package com.java;

public class Fibonacci {

	public static void main(String[] args) {
//0,1,2,3,5,8,......
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=3; i<=10; i++) {//i=3,3<=10,true
			c=a+b;//0=0+1=1 //1=1+1=2
			System.out.println(c);
		    a=b; //a=1
			b=c; //b=1;
			
			
		}
	}

}
