package com.javaclass;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al =new ArrayList();

al.add(10);
al.add(35);
al.add(67);
al.add(98);
al.add("dog");
al.add("toy");
al.get(4);
al.get(5);
al.add("god");




System.out.println(al);
System.out.println(al.get(4));
System.out.println(al);
System.out.println(al.remove(4));
System.out.println(al);
System.out.println("index"+al.indexOf("dog"));
System.out.println("index"+al.indexOf("god"));
System.out.println("index"+al.indexOf(5));



	}

}
