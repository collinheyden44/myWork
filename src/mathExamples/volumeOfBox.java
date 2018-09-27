package mathExamples;

import java.util.Scanner;

public class volumeOfBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double boxLength = -999.9;
		double boxHeight = -999.9;
		double boxWidth = -999.9;
		double boxVolume = -999.9;
		System.out.println("Volume of a Box Calculator\n");
		Scanner input = new Scanner(System.in);
		System.out.println("What is the lenght of the box (In inches)?");
		boxLength = input.nextInt();
		System.out.println("What is the width of the box (In inches)?");
		boxWidth = input.nextInt();
		System.out.println("What is the height of the box (In inchest)?");
		boxHeight = input.nextInt();
		boxVolume = boxLength * boxWidth * boxHeight;
		System.out.println("\nThe volume of the box is " + boxVolume + " inches");

	}

}
