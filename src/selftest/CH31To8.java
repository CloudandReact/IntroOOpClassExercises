package selftest;

public class CH31To8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q1
		/*
		 * Write an if-else statement that outputs the word "High" if the value of the
		 * variable score is greater than 100 and outputs "Low" if the value of score is
		 * at most 100. The variable score is of type int .
		 */
		int score = 96;
		if (score > 100) {
			System.out.println("High");
		} else {
			System.out.println("Low");
		}

		// Q2
		/*
		 * Suppose savings and expenses are variables of type double that have been
		 * given values. Write an if-else statement that outputs the word "Solvent",
		 * decreases the value of savings by the value of expenses , and sets the value
		 * of expenses to zero, provided that savings is larger than expenses . If,
		 * however, savings is less than or equal to expenses, the if-else statement
		 * should simply output the word "Bankrupt" without changing the value of any
		 * variables.
		 */

		double expenses = 450;
		double savings = 650;
		if (savings > expenses) {
			savings = savings - expenses;
			expenses = 0;
		} else {
			System.out.println("Bankrupt");
		}

		// Q8
		/*
		 * Write a multiway if-else statement that classifies the value of an int
		 * variable n into one of the following categories and writes out an appropriate
		 * message: n < 0 or 0 ≤ n < 100 or n ≥ 100
		 */

		int n = -5;
		if (n < 0) {
			System.out.println("n is less than 0");
		} else if (n < 100) {
			System.out.println("0 ≤ n < 100");
		} else {
			System.out.println("n ≥ 100");
		}

		// changing the code to show you difference
		// what is wrong with this code?
		n = -6;
		if (n < 0) {
			System.out.println("n is less than 0");
		}
		else if (n < 100) {
			System.out.println("0 ≤ n < 100");
		}
		else if (n > 100) {
			System.out.println("n ≥ 100");
		}

	}

}
