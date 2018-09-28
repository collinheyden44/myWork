package mathExamples;

import java.util.Scanner;

public class longDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = -999;
		int divisor = -999;
		int whole = -999;
		int remainder = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("what is the Dividend?");
		dividend = input.nextInt();
		System.out.println("what is the Divisor?");
		divisor = input.nextInt();
		whole = dividend / divisor;
		remainder = dividend % divisor;
		System.out.println(whole + "r" + remainder);
	}

}
