package com.java;

public class Amstrong_Number {

	public static void main(String[] args) {
     //153=1^3 +5^3+3^3=1+125+27= 153
		
		int n =153;
		int i,j=0;
		int a=n;
		
		while (a>0) {//153>0 //15>0  //1>0
			
			i=a%10;   // 0=153%10 //3=15%10 //to split last num v use modus bal=//3//5//1
			j=j+(i*i*i);//0=0+(3*3*3)      //27//152//153
			a=a/10;  //153=153/10  //15//15=15/10        //15  //1 //0
			
		}
		 if(n==j) {
			 System.out.println("Given number is Amstrong");
		 }
		 else {
			 System.out.println("Not an armstrong");
		 }
		
		
		
	}
//   fibonacii series a 0
	//b 1 c=a+b  ;
}
