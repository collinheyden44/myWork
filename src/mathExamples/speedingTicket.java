package mathExamples;

import java.util.Scanner;

public class speedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speedLimit = -999;
		int speedingSpeed = -999;
		int speedDifference = -999;
		int ticketPrice = -999;
		int extraMoney = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What was the speed limit?");
		speedLimit = input.nextInt();
		System.out.println("How fast were you going?");
		speedingSpeed = input.nextInt();
		speedDifference = speedingSpeed - speedLimit;
		extraMoney = speedDifference * 40 - 40;
		ticketPrice = 55 + extraMoney;
		System.out.println("Your ticket will cost you $" + ticketPrice);
	}

}
