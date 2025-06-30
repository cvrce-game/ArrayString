package com.pratice;

import java.util.stream.IntStream;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		int[] op = IntStream.range(0, arr.length).map(i -> arr[arr.length - i - 1]).toArray();

		IntStream.range(0, op.length).forEach(System.out::println);
	}
}
