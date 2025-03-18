package com.array.primitive;

import java.util.Scanner;

public class ByteArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		Byte size = sc.nextByte();
		Byte a[] = new Byte[size];
		
		for(int i = 0;i<a.length;i++) {
			System.out.println("Enter Element");
			a[i]=sc.nextByte();
		}
		
		for(int i =0;i<a.length; i++) {
			System.out.println(a[i]);
		}
		

	}

}
