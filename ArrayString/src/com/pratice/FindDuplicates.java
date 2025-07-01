package com.pratice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 1, 5 };

		Map<Integer, Long> ops = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));

		System.out.println(ops);

		ops.entrySet().stream().filter(ent -> ent.getValue() > 1).forEach(ent -> System.out.println(ent.getKey()));

	}

}
