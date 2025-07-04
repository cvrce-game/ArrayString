package com.pratice;

import java.util.HashSet;

public class findFirstRepeating {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };

		int op = arr[arr.length - 1];
		HashSet<Integer> seen = new HashSet<>();

		for (int i = arr.length - 1; i > 0; i--) {

			if (seen.contains(arr[i])) {
				op = arr[i];
			} else {
				seen.add(arr[i]);
			}
		}
		System.out.println(op);
	}

}
