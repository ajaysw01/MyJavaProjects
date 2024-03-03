package com.aj.java8.flatmapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int sid;
	String sname;
	char grade;
	
	Student(int sid,String sname, char grade){
		this.sid=sid;
		this.sname= sname;
		this.grade=grade;
	}
}

public class FlatMapDemo2 {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(101,"Ajay",'A'));
		studentList.add(new Student(102,"Akshay",'B'));
		studentList.add(new Student(103,"Akash",'C'));
		
		List<Student> studentList2 = new ArrayList<Student>();
		studentList2.add(new Student(201,"Govind",'D'));
		studentList2.add(new Student(202,"Nilesh",'E'));
		studentList2.add(new Student(203,"Mahadev",'F'));
		
		
		List<List<Student>> totalStudents = Arrays.asList(studentList,studentList2);
		
		
		//berfore java8
	/*	for(List<Student> lst:totalStudents) {
			for(Student student: lst) {
				System.out.println(student.sname);
			}
		}
*/
		
		//using flatmap
		
		List<String> student = 
				totalStudents.stream()
					.flatMap(s->s.stream()
					.map(stu->stu.sname))
					.collect(Collectors.toList());
		
		System.out.println(student);
		
		
	}

}
