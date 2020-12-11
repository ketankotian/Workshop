package logic;

/*
 * Write three functions that compute the sum of the numbers in a list: using a for-loop, a while-loop and recursion
 * Author : Ketan Kotian
 */
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter number of values to add : ");
		int num = s.nextInt();
		int arr[] = new int[num];
		System.out.println("enter the numbers");
		for (int i = 0; i < num; i++) {
			arr[i] = s.nextInt();
		}

		forLoop(arr);
		whileLoop(arr);
		int sum = recuse(arr, 0, num);
		System.out.println("sum using recursion : " + sum);

	}

	static void forLoop(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum using for loop : " + sum);
	}

	static void whileLoop(int arr[]) {
		int sum = 0;
		int i = 0;
		while (i < arr.length) {
			sum = sum + arr[i];
			i++;
		}
		System.out.println("sum using while loop : " + sum);
	}

	static int recuse(int arr[], int first, int len) {
		if (first >= len) {
			return 0;
		} else {
			return (arr[first] + recuse(arr, first + 1, len));
		}

	}
}
