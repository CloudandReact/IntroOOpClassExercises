package ass4;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a line of text");
		String lineText = keyboard.nextLine().toLowerCase();
		System.out.println(lineText.toUpperCase());
		System.out.println(lineText.toLowerCase());
		keyboard.close();

	}

}
