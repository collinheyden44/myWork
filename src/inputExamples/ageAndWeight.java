package inputExamples;

import java.util.Scanner;

public class ageAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -999;
		int weight = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		age = input.nextInt();
		System.out.println("How much do you weigh?");
		weight = input.nextInt();
		System.out.println("Your are " + age + " years old and weigh " + weight + " lbs");
		input.close();
	}

}
