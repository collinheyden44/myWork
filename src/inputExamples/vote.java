package inputExamples;

import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean vote = false;
		Scanner input = new Scanner(System.in);
		System.out.println("You voted... Type true or false");
		vote = input.nextBoolean();
		System.out.println("You Voted... " + vote);
	}

}
