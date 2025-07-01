package com.pratice;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };

		int[] newArr = new int[5];
		int index = 0;

		for (int ele : arr) {
			if (ele != 0) {
				newArr[index++] = ele;
			}
		}

		for (int i = index; i < arr.length; i++) {
			newArr[i] = 0;
		}

		System.out.println(Arrays.toString(newArr));
	}

}
