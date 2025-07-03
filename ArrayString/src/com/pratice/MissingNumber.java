package com.pratice;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5 };
		int N = 5;

		int expectedSum = (N * (N + 1)) / 2;
		int actualSum = Arrays.stream(arr).sum();

		System.out.println("Missing elemement is: " + (expectedSum - actualSum));

	}

}
