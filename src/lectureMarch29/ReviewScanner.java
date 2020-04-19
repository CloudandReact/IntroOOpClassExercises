package lectureMarch29;

import java.util.Scanner;

public class ReviewScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter first name and last name");
		String firstName = keyboard.next();
		String lastName = keyboard.next();
		String city = keyboard.next();

		System.out.printf(" first name %s last name %s", firstName, lastName);
		
		System.out.println("enter first name and last name");
		// Elliot Gimple
		firstName=keyboard.nextLine(); //delimeter is new line \n when we press enter
		lastName= keyboard.nextLine();
		
		System.out.printf(" first name %s last name %s", firstName, lastName);

	}

}
