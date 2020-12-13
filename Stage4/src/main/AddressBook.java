package main;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select option :  1.Add ; 2.Edit ; 3.Delete ");
		int option = sc.nextInt();

		ArrayList addr = new ArrayList<>();

		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Eter City : ");
		String city = sc.next();
		System.out.println("Enter zip : ");
		int zip = sc.nextInt();
		System.out.println("Enter Mobile : ");
		int mobile = sc.nextInt();

		switch (option) {
		case 1: {

			addr.add(name);
			addr.add(city);
			addr.add(zip);
			addr.add(mobile);

		}
		case 2: {
			
			String nam = " ";
			addr.add(name = nam);

		}
		case 3: {
			addr.remove(0);
		}

		}
	}
}
