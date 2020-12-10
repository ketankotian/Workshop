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
//		int[] eve = new int[num];
//		int[] odd = new int[num];
		int evenSum = 0, oddSum = 0;

		for (int i = 1; i <= num; i++) {

			if (i % 2 == 0) {
				System.out.print(i + "\n");
				evenSum = evenSum + i;
//				eve[i] = i;
			} else {
				System.out.print(i + " ");
				oddSum = oddSum + i;
//				odd[i] = i;
			}
		}
		System.out.println("\nEven Sum : " + evenSum);
//		System.out.println("Even Array : " + eve);
		System.out.println("Odd Sum : " + oddSum);
//		System.out.println("Odd Array : " + odd);
	}

	static void prime(int num) {
		int primeSum = 0, count = 0;
//		int[] prime = new int[num];
		for (int i = 1; i <= num; i++) {
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					count = count + 1;
				}
			}
			if (count == 0) {
				System.out.print(i + " ");
				primeSum = primeSum + i;
//				prime[i] = i;
			} else {
				count = 0;
			}

		}
		System.out.println("\nPrime sum : " + primeSum);
//		System.out.println("Prime Array : " + prime);

	}

}

/*
Enter limit : 
7
1 2 3 4 5 6 7 
Sum : 28
1 2
3 4
5 6
7 
Even Sum : 12
Odd Sum : 16
1 2 3 5 7 
Prime sum : 18
*/