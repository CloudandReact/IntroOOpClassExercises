package ass3;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// initiazlie the Scanner object variable named keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.print("enter your first name :");
		String firstName = keyboard.next().toLowerCase();
		System.out.println();
		System.out.print("enter your last name :");
		String lastName = keyboard.next().toLowerCase();
		String newFirstName = firstName.substring(1, 2).toUpperCase() + firstName.substring(2)
				+ firstName.substring(0, 1) + "ay";
		String newLastName = lastName.substring(1, 2).toUpperCase() + lastName.substring(2) 
		+ lastName.substring(0, 1)
				+ "ay";
		System.out.printf("\n Old name was %s %s \n", firstName, lastName);
		System.out.printf(" New name is %s %s", newFirstName, newLastName);
		keyboard.close();

	}

}
