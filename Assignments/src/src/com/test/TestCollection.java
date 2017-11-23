package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class TestCollection {
	
	public static void main(String[] args){
		List list=new ArrayList();
		//List list=new LinkedList();
		//List list=new TreeSet();
		//Collection list=new HashSet();
		//Collection list=new LinkedHashSet();
		list.add("Orange");
		list.add("Apple");
		list.add("Banana");
		list.add("199");
		Collections.sort(list);
		System.out.println(list.add("Apple"));
		System.out.println(list.add("Grapes"));
		
		//list.add(1, "Grapes");
		
		for(int i=0; i<list.size();i++)
		{
		//	System.out.println(list.get(i));	
		}
			System.out.println("************************");
			
		/*for(Object obj: list)
		{
			String str=(String)obj;
			System.out.println(str+" "+str.length());
		}*/
			System.out.println("************************");
			
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			Object obj=iterator.next();
			System.out.println(obj);
		}
		
		System.out.println("************************");
		
		list.forEach(p->System.out.println(p));
		
		/*
		list.clear();
		System.out.println("size: "+list.size());
		String obj=(String)list.get(2);
		System.out.println("Object at index 2: "+obj);
		*/
	}
}
