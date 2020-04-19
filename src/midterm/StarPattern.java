package midterm;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number of lines to print for * pattern");
		int n = keyboard.nextInt();
		// need to draw the pattern
		/*
		 * 
		 * * * *
		 */
		// need to have a for loop go n times
		/// for(;;)
		for (int i = 0; i < n; i++) {
			// hint we need another for loop to run number times based on line we are
			for (int j = 0; j <= i; j++) {
				// what print statement do we put in here
				System.out.print("*");

			}
			// what print statement do we need to put over here as well?
			System.out.println();

		}
		keyboard.close();

	}

}
