package com.studentconstructor;

public class TestStudent {

	public static void main(String[] args) {
		Student s[] = new Student [2];
		
		s[0] = new Student(10,"Harsha");
		s[1] = new Student(11,"mona");
		
		for(int i = 0; i<s.length; i++) {
			System.out.println("Roll no:" +s[i].rollno);
			System.out.println("Name:" +s[i].name);
		}
		
	}

}
