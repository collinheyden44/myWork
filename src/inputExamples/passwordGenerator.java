package inputExamples;

import java.util.Scanner;

public class passwordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Password Generator 1.0\n");
		int num1 = -999;
		int num2 = -999;
		int num3 = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first one digit number?");
		num1 = input.nextInt();
		System.out.println("Please enter your second one digit number?");
		num2 = input.nextInt();
		System.out.println("Please enter your third one digit number");
		num3 = input.nextInt();
		System.out.println("\n");
		System.out.println("Possible Passwords:\n");
		System.out.println(num1 + "" + num2 + "" + num3);
		System.out.println(num3 + "" + num1 + "" + num2);
		System.out.println(num2 + "" + num3 + "" + num1);
		input.close();
	}

}
