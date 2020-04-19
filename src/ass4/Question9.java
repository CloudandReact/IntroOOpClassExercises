package ass4;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a line of text");
		String text = keyboard.nextLine();
		text = text.replaceFirst("hate", "love");
		System.out.println("I have rephrased the line to read");
		System.out.println(text);
	}

}
