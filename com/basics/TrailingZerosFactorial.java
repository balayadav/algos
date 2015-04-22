package com.basics;

public class TrailingZerosFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countZeros(100));
	}

	public static int countZeros(int num) {
		/*
		 * 0's are contributed by 5 x 2, also note 5x5 contributes 2 5's
		 */
		if (num < 0)
			return 0;
		int count = 0;
		for (int i = 5; num / i > 0; i = i * 5) {
			count = count + num / 5;
		}
		return count;
	}
}
