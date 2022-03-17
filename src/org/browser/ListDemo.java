package org.browser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDemo {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.add(20);
	l.add(50);
	
	//index value
	Object value = l.get(3);
	System.out.println(value);
	//size
	int size = l.size();
	System.out.println(size);
	
	//print all values from list
	for(int i=0; i<=size-1;i++)
	{
	System.out.println(l.get(i));	
	}
	
	
	System.out.println("print first 5 values in list");
	for(int i=0; i<=size-3;i++) {
		System.out.println(l.get(i));
	}
	
	
	System.out.println("print last 5 values in list");
	for(int i=size-1; i>=size-5;i--) {
		System.out.println(l.get(i));
	}
	
	
	
	System.out.println("Enhanced for loop");
	for (Object x : l) {
		System.out.println(x);
	}
	
	
	System.out.println("Alternate number in list");
	int i=0;
	while(i<=size-1)
	{
		System.out.println(l.get(i));
		i=i+2;
	}
	
	Set set=new HashSet();
	set.add(100);
	set.add(200);
	System.out.println(set);
	System.out.println("set to list");
	l.addAll(set);
	System.out.println(l);
	System.out.println("list to set");
	set.addAll(l);
	System.out.println(set);
	
	
}
}
