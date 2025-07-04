package com.pratice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class findFirstRepeatingStream {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };

		Map<Integer, Long> op = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap<Integer, Long>::new, Collectors.counting()));

		Optional<Map.Entry<Integer, Long>> mostFrequent = op.entrySet().stream()
				.sorted(Map.Entry.<Integer, Long>comparingByValue().reversed()).findFirst();

		mostFrequent.ifPresentOrElse(System.out::print, () -> System.out.println("No value"));

	}

}
