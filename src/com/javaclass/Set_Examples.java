package com.javaclass;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Set_Examples {
	
	public static void main(String[] args) {
		
		
		Set<Object> st = new TreeSet<Object>();
		
		st.add(12);
		st.add(14);
		st.add(10);
		
		for (Object object : st) {
			
			System.out.println(object);
			
		}
		
		Iterator<Object> iterator = st.iterator();
		
		
		
		while(iterator.hasNext()) {
			
			Object next = iterator.next();
		
		System.out.println(next);
		
		}
		
		Map<Integer,String> mt = new HashMap<Integer,String>();
		
		mt.put(1, "Java");
		mt.put(2, "Selenium");
		mt.put(3, "Java");//---Duplicate Value---
		mt.put(4, "Project");
		mt.put(4,"Cucumber");//---Duplicate Key---
		mt.put(4, null);//---Overrided value for key 4---
		
		System.out.println(mt);
		
		 Set<Integer> keySet = mt.keySet();
		 
		 System.out.println(keySet);
		 
		 boolean containsValue = mt.containsValue("Java");
		 
		 System.out.println(containsValue);
		 
		 Collection<String> values = mt.values();
		 
		 System.out.println(values);
		 
		 Set<Entry<Integer, String>> entrySet = mt.entrySet();
		 
		 System.out.println(entrySet);
		
		
		
	}
	
	
	

}
