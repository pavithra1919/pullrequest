package com.java;

public class Welcome {
	public static void main(String[] args) {
           String sr= "WeLCome" ;
           
           String sr1 = sr.toUpperCase();
           
           String str="";
           int i;
           
           String tem;
           
           for(i =0;i<sr.length();i++)
           {
              
				if(sr .charAt(i) == sr1.charAt(i))
        		   {
					 tem = ""+sr.charAt(i);
					 str=str+tem.toLowerCase();
        		   }
        		   else
        		   {
        			   tem = ""+sr.charAt(i);
        			   str=str+tem.toUpperCase();
        			   
        		   }
        		   
        		  
        	   }
        	   
           System.out.println(str);
	}
}        
           
           
           
           
           
           
           
           
           
           
           
	        
