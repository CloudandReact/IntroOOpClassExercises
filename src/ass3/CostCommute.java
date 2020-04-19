package ass3;

import java.util.Scanner;

public class CostCommute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the miles travelled");
		double milesTravelled=keyboard.nextDouble();
		System.out.print("Please enter MPH");
		double mph=keyboard.nextDouble();
		System.out.print("Pleas enter price of a gallon of gas ");
		double costGallonGas=keyboard.nextDouble();
		double totalCost=milesTravelled*costGallonGas/mph;
		System.out.printf("total cost is $%.2f for travelling %.2f miles  at an mph of %.2f where a gallon of gas cost $%.2f", totalCost,milesTravelled,mph,costGallonGas);
		keyboard.close();
	}

}
