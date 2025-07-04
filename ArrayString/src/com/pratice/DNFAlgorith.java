package com.pratice;

import java.util.Arrays;

public class DNFAlgorith {

	public static void main(String[] args) {
		int[] arr = { 2, 0, 2, 1, 1, 0 };

		int low = 0, mid = 0, high = arr.length - 1;

		while (mid <= high) {

			switch (arr[mid]) {
			case 0: {
				swap(arr, low, mid);
				low++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;

			}
			case 2: {
				swap(arr, mid, high);
				high--;
				break;

			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + arr[mid]);
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
