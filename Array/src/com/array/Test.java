package com.array;

public class Test {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		
		int []arr2 = {10,20,30,40,50};
		
		int arr3[] = {10,20,30,40,50};
		
		int arr4[] = new int [5];
		arr4[0] = 101;
		arr4[1] = 102;
		arr4[2] = 103;
		System.out.println("Befor update"+arr4[2]);
		arr4[3] = 104;
		arr4[4] = 105;
		arr4[5] = 106;
		
		arr4[2]= 333;
		System.out.println("After update"+arr4[2]);
		
		
		System.out.println( arr1[0]);
		
		System.out.println(arr4[0]);

	}

}
