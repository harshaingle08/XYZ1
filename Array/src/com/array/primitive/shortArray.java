package com.array.primitive;

import java.util.Scanner;

public class shortArray {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		short size = sc.nextShort();
		short a[] = new short [size];
		
		for(int i = 0;i<a.length;i++) {
			System.out.println("Enter Element");
			a[i]=sc.nextShort();
		}
		
		for(int i =0;i<a.length; i++) {
			System.out.println(a[i]);
		}

	
}
}