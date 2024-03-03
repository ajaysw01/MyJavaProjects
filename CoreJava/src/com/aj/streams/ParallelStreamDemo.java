package com.aj.streams;

import java.util.Arrays;
import java.util.List;

class Student{
	String name;
	int score;
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
}
public class ParallelStreamDemo {
	public static void main(String[] args) {
		
		List<Student> studentList =Arrays.asList(
				new Student("Harry", 70),
				new Student("Ron", 60),
				new Student("Hermoine", 99),
				new Student("Neville", 86),
				new Student("malfoy", 96),
				new Student("Luna", 76)


				);
		
		//normal sttream : sequential 
		studentList.stream()
		.filter(s-> s.getScore()>=80)
		.limit(3)
		.forEach(stu->System.out.println(stu.getName()+" " +stu.getScore()));
		
		//using parallel stream
		studentList.parallelStream()
			.filter(s->s.getScore()>=80).limit(2)
				.forEach(stud->System.out.println(stud.getName()+" "+stud.getScore()));
		
		//convert normal stream into parallel stream we use parallel()
		studentList.stream()
		.parallel()
		.filter(s-> s.getScore()>=80)
		.limit(3)
		.forEach(stu->System.out.println(stu.getName()+" " +stu.getScore()));
		
	}

}
