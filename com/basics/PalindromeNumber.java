package com.basics;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int val = in.nextInt();
		isPalindromReverse(val);
		if (isPalindromGeneric(val))
			System.out.println("Palindrome!!!");
		in.close();
	}

	public static void isPalindromReverse(int val) {
		/*
		 * Reversing and comparing with original. Not generic as some languages
		 * might overflow
		 */
		int temp = val;
		int reverse = 0;
		while (val != 0) {
			reverse = reverse * 10 + val % 10;
			val = val / 10;
		}
		System.out.println(reverse + " " + val);
		if (reverse == temp)
			System.out.println("Given Number is Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

	public static boolean isPalindromGeneric(int val) {
		if (val == 0 || val / 10 == 0)
			return true;
		int div = 1;
		int left = 0, right = 0;
		while (val / div >= 10) {
			div = div * 10;
		}
		while (val != 0) {
			left = val / div;
			right = val % 10;
			if (left != right)
				return false;
			val = (val % div) / 10;
			div = div / 100;
		}
		return true;
	}
}
