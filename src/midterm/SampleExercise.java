package midterm;

import java.util.Scanner;

public class SampleExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a double for loop using scanner to print out the pattern
		/* Pattern
		 ***
		 ***
		 *** 
		 */
		Scanner keyboard= new Scanner(System.in);
		System.out.println("enter number of lines to print");
		int n=keyboard.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("***");
		}

	}

}
