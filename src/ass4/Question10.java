package ass4;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input name of item 1");
		// if you use keyboard.next you wont be able to handle diet soda
		String nameItem1 = keyboard.nextLine();
		System.out.println("input quantity of item 1");
		double quantityItem1 = keyboard.nextDouble();
		// sample handling correct quantity
		//can apply same logic for price and other variables
		if (quantityItem1 < 0) {
			System.out.println("entered invalid quantity exiting");
			System.exit(1);
		}
		System.out.println("Input price of item 1");
		double priceItem1 = keyboard.nextDouble();
		double total1 = quantityItem1 * priceItem1;
		keyboard.nextLine();
		System.out.println("Input name item 2");
		String nameItem2 = keyboard.nextLine();
		System.out.println("Input quantity of item 2");
		double quantityItem2 = keyboard.nextDouble();
		System.out.println("Input price of item 2");
		double priceItem2 = keyboard.nextDouble();
		double total2 = quantityItem2 * priceItem2;
		keyboard.nextLine();
		System.out.println("Input name item 3");
		String nameItem3 = keyboard.nextLine();
		System.out.println("Input quantity of item 3");
		double quantityItem3 = keyboard.nextDouble();
		System.out.println("Input price of item 3");
		double priceItem3 = keyboard.nextDouble();
		double total3 = priceItem3 * quantityItem3;
		double subtotal = total1 + total2 + total3;
		double tax = subtotal * 0.0625;
		double total = subtotal + tax;
		// close the scanner object
		keyboard.close();
		System.out.println("Your bill");
		System.out.println();
		System.out.printf("%-15s %-10s %-10s %-10s", "Item", "Quantity", "Price", "Total");
		System.out.println("");
		System.out.printf("%-15s %-10.2f %-10.2f %-10.2f", nameItem1, quantityItem1, priceItem1, total1);
		System.out.println();
		System.out.printf("%-15s %-10.2f %-10.2f %-10.2f", nameItem2, quantityItem2, priceItem2, total2);
		System.out.println();
		System.out.printf("%-15s %-10.2f %-10.2f %-10.2f", nameItem3, quantityItem3, priceItem3, total3);
		System.out.println();
		System.out.println();
		System.out.printf("%-37s %-10.2f ", "subtotal", subtotal);
		System.out.println();
		System.out.printf("%-37s %-10.2f ", "6.25% sales tax", tax);
		System.out.println();
		System.out.printf("%-37s %-10.2f  ", "Total", total);

	}

}
