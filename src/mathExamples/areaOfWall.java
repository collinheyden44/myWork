package mathExamples;

import java.util.Scanner;

public class areaOfWall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double wallArea = -999.9;
		Scanner input = new Scanner(System.in);
		System.out.println("The wall is 8 feet tall?");
		System.out.println("What is the width of thw wall (In feet)?");
		wallArea = input.nextInt() * 8.0;
		System.out.println("The area of the wall is " + wallArea + " square feet");

	}

}
