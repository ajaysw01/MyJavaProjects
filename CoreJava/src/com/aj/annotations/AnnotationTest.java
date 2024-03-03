package com.aj.annotations;
import java.util.*;


/** Class to show annotaions for programming
* @author ajay
* @since 1.0
* @see java.lang.Object
*/
@SuppressWarnings(value={"unchecked","deprecation"})
public class AnnotationTest{
	public static void main(String[] args){
		List list = new ArrayList();
		list.add(10);
		System.out.println("element are "+list);
		
		Date d = new Date();
		System.out.println(d.getMonth());
	}
	
}