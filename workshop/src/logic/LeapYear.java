package logic;

import java.util.Scanner;

/*
 Write a program that prints the next 20 leap years
 Author : Ketan Kotian
 */

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year : ");
		int year = sc.nextInt();
		int next = 20;

		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("Its Leap year ");
			System.out.println("Next " +next+ " leap year : ");
			
			for (int i = 0; i < next; i++) {
				year = year + 4;
				System.out.print(year+" ; ");
			}
			
		}
		else 
		{
			System.out.println("Not a Laep Year");
		}

	}

}
