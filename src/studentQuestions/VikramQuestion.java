package studentQuestions;

import java.util.Scanner;

public class VikramQuestion {

	private static final double TAX = 0.0625;

	public static void main(String[] args) {

		Scanner userinput = new Scanner(System.in);

		String item[] = new String[3];

		int quantity[] = new int[3];

		double price[] = new double[3];

		double total[] = new double[3];

		for (int i = 0; i < 3; i++)

		{
			
			System.out.println("Input name of item " + (i + 1) + " :");

			item[i] = userinput.nextLine();

			System.out.println("Input quantity of item " + (i + 1) + " :");

			quantity[i] = userinput.nextInt();

			System.out.println("Input price of item " + (i + 1) + " :");

			price[i] = userinput.nextDouble();

			total[i] = quantity[i] * price[i];
			userinput.nextLine();

		}
		userinput.close();

	}
}