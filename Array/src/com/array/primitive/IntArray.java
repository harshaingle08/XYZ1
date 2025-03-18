package com.array.primitive;

import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size = sc.nextInt();
		int a[] = new int [size];
		
		for(int i = 0;i<a.length;i++) {
			System.out.println("Enter Element");
			a[i]=sc.nextInt();
		}
		
		for(int i =0;i<a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
