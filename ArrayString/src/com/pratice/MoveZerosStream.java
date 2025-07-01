package com.pratice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZerosStream {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };

		int[] nonZeroEle = Arrays.stream(arr).filter(i -> i != 0).toArray();

		int reqLength = arr.length - nonZeroEle.length;

		int[] finalArray = IntStream.concat(Arrays.stream(nonZeroEle), IntStream.generate(() -> 0).limit(reqLength))
				.toArray();

		System.out.println(Arrays.toString(finalArray));
	}

}
