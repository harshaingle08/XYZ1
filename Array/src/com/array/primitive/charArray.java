package com.array.primitive;

import java.util.Scanner;

public class charArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int  size = sc.nextInt();
		char a[] = new char[size];
		
		for(int i=0; i<a.length ;i++) {
			System.out.println("Enter Element");
			a[i]= sc.next().charAt(0);
		}
		
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}
