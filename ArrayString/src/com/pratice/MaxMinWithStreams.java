package com.pratice;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxMinWithStreams {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 7, 1, 9, 3 };

		OptionalInt max = Arrays.stream(arr).max();
		OptionalInt min = Arrays.stream(arr).min();

		max.ifPresent(System.out::println);
		min.ifPresent(System.out::println);

	}

}
