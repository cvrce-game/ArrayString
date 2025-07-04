package com.pratice;

import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] nums = { 100, 4, 200, 1, 3, 2 };

		HashSet<Integer> orderedSet = new HashSet<>();

		for (int val : nums) {
			orderedSet.add(val);
		}
		int longest = 0;

		for (int val : nums) {
			if (!orderedSet.contains(val - 1)) {
				int curentNum = val;
				int count = 1;

				while (orderedSet.contains(curentNum + 1)) {
					curentNum++;
					count++;
				}
				longest = Math.max(count, longest);
			}
		}
		System.out.println(longest);
	}

}
