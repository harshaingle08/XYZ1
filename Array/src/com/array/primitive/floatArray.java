package com.array.primitive;

import java.util.Scanner;

public class floatArray {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		float size = sc.nextFloat();
		float[] a = new float [(int) size];
		
		for(int i = 0;i<a.length;i++) {
			System.out.println("Enter Element");
			a[i]=sc.nextInt();
		}
		
		for(int i =0;i<a.length; i++) {
			System.out.println(a[i]);
		}

}
}