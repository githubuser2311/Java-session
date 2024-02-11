package com.training.practice;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print prime numbers till the given number.
		// 2,3,5,7
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i, j = 1;
		int c = 0;
		for (i = 1; i < n; i++) {
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					c++;
					if (c == 1)
						System.out.println(i);
					else
						continue;

				}
			}

			
		}
	}

}
