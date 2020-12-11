package logic;

/*
 * To find Longest sub sequence of string 
 * Author : Ketan Kotian
 */
import java.util.Scanner;

public class SubSequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two string : ");
		String first = sc.next();
		String second = sc.next();

		char[] one = first.toCharArray();
		char[] two = second.toCharArray();
		int count = 0;

		seq(one, two, count);
	}

	static void seq(char one[], char two[], int count) {
		for (int i = 0; i < one.length; i++) {

			for (int j = 0; j < two.length; j++) {

				if (one[i] == two[j]) {
					System.out.println(one[i] + " ");
					count++;
				}
			}
		}

		System.out.println("Sub-sequence : " + count);
	}
}
