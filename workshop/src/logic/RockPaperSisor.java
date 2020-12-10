package logic;

/*
 
 Write a program that plays Rock, Paper, Scissors better than random against a human. 
 Try to exploit that humans are very bad at generating random numbers.
 
 Author : Ketan Kotian
 */
import java.util.Random;
import java.util.Scanner;

public class RockPaperSisor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select 1.Rock , 2.Paper , 3.Sissor ");
		int userChoice = sc.nextInt();

		Random r = new Random();
		int computerChoice = r.nextInt(3) + 1;

		if (userChoice == computerChoice)
			System.out.println("Its a tie !");

		else if (userChoice == 1 && computerChoice == 3)
			System.out.println("User wins ! rock beats sissor ");
		else if (userChoice == 2 && computerChoice == 1)
			System.out.println("User wins ! paper covers rock ");
		else if (userChoice == 3 && computerChoice == 2)
			System.out.println("User wins ! sissor cuts paper ");

		else if (userChoice == 3 && computerChoice == 1)
			System.out.println("Computer wins ! rock beats sissor ");
		else if (userChoice == 1 && computerChoice == 2)
			System.out.println("Computer wins ! paper covers rock ");
		else if (userChoice == 2 && computerChoice == 3)
			System.out.println("Computer wins ! sissor cuts paper ");
		else
			System.out.println("invalid input ");

	}

}
