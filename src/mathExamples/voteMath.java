package mathExamples;

import java.util.Scanner;

public class voteMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		age = 21 - input.nextInt();
		if (age <= 0)
			System.out.println("You can vote now!");
		else if (age >= 21)
			System.out.println("You aren't born yet!");
		else
			System.out.println("You will be able to vote in the United States in about " + age + " years");
		
		input.close();
	}

}
