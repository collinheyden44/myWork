package inputExamples;

import java.util.Scanner;

public class monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("Your age is " + age);
		input.close();
	}

}
