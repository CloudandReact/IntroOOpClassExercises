package lectureApril5th;

import java.util.Scanner;

public class ScannerPitfalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initializing Scanner object called keyboard
		Scanner keyboard = new Scanner(System.in);
		// asking for input
		System.out.println("Enter your age.");
		// reading integer input from the command line or console
		int age = keyboard.nextInt();
		String empty=keyboard.nextLine();
		// Asking for second String input
		System.out.println("Enter your name.");
		// getting string input
		String name = keyboard.nextLine();
		// printing both out
		System.out.println(name + ",you are " + age + " years old.");

	}

}
