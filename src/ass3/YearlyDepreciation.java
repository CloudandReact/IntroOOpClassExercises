package ass3;

import java.util.Scanner;

public class YearlyDepreciation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("enter initial price");
		double p = keyboard.nextDouble();
		System.out.println("Salvage price");
		double s = keyboard.nextDouble();
		System.out.println("Number of years");
		double y = keyboard.nextDouble();
		double yearlyDepreciation = (p - s) / y;
		System.out.printf(" For an initial price of $%.2f and a salvage price $%.2f for %.2f years the annual depreciation is $%.2f",
				p,s,y,yearlyDepreciation);
		keyboard.close();

	}

}
