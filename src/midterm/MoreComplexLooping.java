package midterm;

import java.util.Scanner;

public class MoreComplexLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * *
		 * * *
		 */
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter number of lines to print");
		int n = keyboard.nextInt();

		for (int i = 0; i < n; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
