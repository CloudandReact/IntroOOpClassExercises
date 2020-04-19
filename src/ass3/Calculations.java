package ass3;

import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter two integers");
		int x=keyboard.nextInt();
		int y = keyboard.nextInt();
		int sum=x+y;
		int difference = x-y;
		int product=x*y;
		System.out.printf("\n The two numbers you entered are %d %d, their sum %d, their difference %d, their product %d .",
				x,y,sum,difference,product);
		keyboard.close();

	}

}
