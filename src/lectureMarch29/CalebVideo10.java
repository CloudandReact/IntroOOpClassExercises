package lectureMarch29;

import java.math.BigDecimal;
import java.util.Scanner;

/*Scanner Input and Output
 * https://www.youtube.com/watch?v=rqZ0Cp9Omp8&list=PL_c9BZzLwBRKIMP_xNTJxi9lIgQhE51rF&index=12&t=0s
 */
public class CalebVideo10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// difference nextLine vs next vs .nextInt() ...
		String x = scanner.nextLine();
		System.out.println(x);
		// typed we need this to be an int or else what will happen
		int y = scanner.nextInt();
		System.out.println(y);
		int a = y + 10;
		System.out.println(a);
		// bigInteger and bigDecimal large numbers and precision
		// scanner.nextDouble()
		BigDecimal money = scanner.nextBigDecimal();
		boolean b = scanner.nextBoolean();

		// will this work
		// int i =scanner.nextDouble()?
		// double d = scanner.nextInt()?
		
		//close the scanner
		scanner.close();

	}

}
