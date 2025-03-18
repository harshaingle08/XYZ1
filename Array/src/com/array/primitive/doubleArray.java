package com.array.primitive;

import java.util.Scanner;

public class doubleArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		double size= sc.nextDouble();
		Double a[] = new Double[(int) size];
		
		for(int i = 0; i<a.length; i++) {
			System.out.println("Ehter Element");
			a[i] = sc.nextDouble();
		}
		
		for(int i =0;i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
