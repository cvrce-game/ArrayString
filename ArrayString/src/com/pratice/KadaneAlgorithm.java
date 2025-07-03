package com.pratice;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println("Maximum Subarray Sum is: " + maxSubArraySum(nums));
	}

	private static int maxSubArraySum(int[] nums) {
		int sum = 0;
		int maxSum = nums[0];

		for (int num : nums) {

			sum = sum + num;
			if (sum < 0) {
				sum = 0;
			}

			if (sum > maxSum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}

}
