package logic;

/*
Write a function that concatenates two lists. [a,b,c]; [1,2,3] → [a,b,c,1,2,3]

Author : Ketan Kotian
*/
import java.util.ArrayList;

public class ListConcat {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();
		str.add("a");
		str.add("b");
		str.add("c");
		System.out.println("List 1 : " + str);

		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		System.out.println("List 2 : " + num);

		ArrayList join = new ArrayList();
		join.addAll(str);
		join.addAll(num);
		System.out.println("Joined list : " + join);

	}

}
