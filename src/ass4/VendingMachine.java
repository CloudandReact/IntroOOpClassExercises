package ass4;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the price of an item");
		System.out.println("From 25 cents to a dollar in 5 cent increments");
		int cost = keyboard.nextInt();
		int change = 100 - cost;
		int quarters = change / 25;
		int dimes = change % 25 / 10;
		int nickels = change % 10 / 5;
		System.out.printf(
				"You bought an item for %d and gave me a dollar %nyour change is %n%d quarters %n%d dimes %n%d nickels",
				cost, quarters, dimes, nickels);
		keyboard.close();

	}

}
