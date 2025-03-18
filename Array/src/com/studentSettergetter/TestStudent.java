package com.studentSettergetter;

public class TestStudent {

	public static void main(String[] args) {
	
		Student s[] = new Student[2];

		 Student s1 = new Student();
	       s1.setRollno(10);
	       s1.setName("aaa");

	    Student s2 = new Student();
	       s2.setRollno(11);
	       s2.setName("ppp");

	        s[0] = s1;
	        s[1] = s2;

	        for(int i =0; i<s.length; i++) {
	        	System.out.println("Roll No: " + s[i].getRollno());
	        	System.out.println("Name: " + s[i].getName());

	        }
	        
	
	}


}