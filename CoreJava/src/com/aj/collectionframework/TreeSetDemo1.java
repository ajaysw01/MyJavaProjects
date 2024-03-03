package com.aj.collectionframework;

//Program to insert String objects in TreeSet in Descending/Ascending order
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add("A");
		t.add("J");
		t.add("A");
		t.add("Y");
		t.add("B");
		System.out.println(t);
	}

}

class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2) {
		String s1 = (String)obj1;
		String s2 = (String)obj2;
		// return s1.compareTo(s2); //[A, B, J, Y]
		// return s2.compareTo(s1); //[Y, J, B, A]
		// return -s1.compareTo(s2); //[Y, J, B, A]
		return s1.compareTo(s1);	
	}
}
