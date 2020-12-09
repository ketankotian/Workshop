package demo;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit : ");
		int num = sc.nextInt();
		sum(num);
		evenOdd(num);
		prime(num);

	}

	static void sum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
			System.out.print(i + " ");

		}
		System.out.println("\nSum : " + sum);

	}

	static void evenOdd(int num) {
		int evenSum = 0, oddSum = 0;

		for (int i = 1; i <= num; i++) {

			if (i % 2 == 0) {
				System.out.print(i + "\n");
				evenSum = evenSum + i;
			} else {
				System.out.print(i + " ");
				oddSum = oddSum + i;
			}
		}
		System.out.println("\nEven Sum : " + evenSum);
		System.out.println("Odd Sum : " + oddSum);
	}

	static void prime(int num) {
		int primeSum = 0, count = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					count = count + 1;
				}
			}
			if (count == 0) {
				System.out.print(i + " ");
				primeSum = primeSum + i;
			} else {
				count = 0;
			}

		}
		System.out.println("\nPrime sum : " + primeSum);

	}

}
