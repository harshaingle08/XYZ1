package com.array.primitive;

import java.util.Scanner;

public class BooleanArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int  size = sc.nextInt();
		boolean a[] = new boolean[size];
		
		for(int i=0; i<a.length ;i++) {
			System.out.println("Enter Element");
			a[i]= sc.nextBoolean();
		}
		
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

	}


