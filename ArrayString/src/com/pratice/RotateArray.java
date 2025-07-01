package com.pratice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int k = 3;

		int[] revArray = IntStream.range(0, arr.length).map(i -> arr[arr.length - i - 1]).toArray();

		int[] part1 = Arrays.copyOfRange(revArray, 0, k);
		int[] reversePart1 = IntStream.range(0, part1.length).map(i -> part1[part1.length - i - 1]).toArray();

		int[] part2 = Arrays.copyOfRange(revArray, k, revArray.length);
		int[] reversePart2 = IntStream.range(0, part2.length).map(i -> part2[part2.length - i - 1]).toArray();

		int[] result = IntStream.concat(Arrays.stream(reversePart1), Arrays.stream(reversePart2)).toArray();

		System.out.println(Arrays.toString(result));

	}

}
