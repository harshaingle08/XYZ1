package com.student;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s [] = new Student[2];
		
		Student s1 = new Student();
		s1.rollno =  10;
		s1.name = "xyz";
		
		Student s2 = new Student();
		s2.rollno= 20;
		s2.name = "pqr";
		
		s[0]=s1;
		s[1]=s2;
		
		for(int i =0; i<s.length ; i++) {
			Student student = s[i];
			System.out.println(student.rollno);
			System.out.println(student.name);
		}
	}

}
