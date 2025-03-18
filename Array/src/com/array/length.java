package com.array;

public class length {

	public static void main(String[] args) {
		
		int arr4[] = new int[5];
		
		arr4[0] = 101;
		arr4[1] = 102;
		arr4[2] = 103;
		arr4[3] = 104;
		arr4[4] = 105;
		
		int length = arr4.length;
		
		System.out.println(length);
		
		for (int i =0; i<= length-1; i++) {
			
			System.out.println(arr4[i]);
		}

		arr4[3] = 333;
	}

}
