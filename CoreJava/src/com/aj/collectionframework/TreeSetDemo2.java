package com.aj.collectionframework;

import java.util.Comparator;

//Prgram to insert Integer objects in TreeSet in descending sorting order

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComp());
//		for(int i =1; i<=10; i++) {
//			t.add(i);
//		}
		t.add(10);
		t.add(67);
		t.add(3);
		t.add(1);
		t.add(4);
		System.out.println(t);
	}
}

class MyComp implements Comparator{
	public int compare(Object o1, Object o2) {
		Integer i1 =(Integer)o1;
		Integer i2 =(Integer)o2;
		if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		else
		return 0;
	}
	
}