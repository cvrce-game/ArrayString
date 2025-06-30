package com.pratice;

import java.util.stream.IntStream;

public class IsArraySorted {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		boolean ops = IntStream.range(0, arr.length - 1).allMatch(i -> arr[i] <= arr[i + 1]);

		System.out.println(ops);

	}

}
