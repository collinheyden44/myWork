package mathExamples;

import java.util.Scanner;

public class sevenYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		age = input.nextInt() + 7;
		System.out.println("In seven years, you will be " + age + " years old");
		input.close();
	}

}
