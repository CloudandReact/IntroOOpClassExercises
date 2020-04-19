package lectureMarch29;

/*
 * Debugging exercise
 */
public class PrintfDemo {
	public static void main(String[] args) {
		String aString = "abc";
		String bString="bcd";

		System.out.println("String output:");
		System.out.println("START1234567890");
		System.out.printf("START%sEND %s %n", aString,bString);
		System.out.println("START"+aString);
		System.out.printf("START%4sEND %n", aString);
		System.out.printf("START%2sEND %n", aString);
		System.out.println();

		char oneChracter = 'Z';

		System.out.println("Character output:");
		System.out.println("START1234567890");
		System.out.printf("START%cEND %n", oneChracter);
		System.out.printf("START%4cEND %n", oneChracter);
		System.out.println();

		double d = 12345.123456789;

		System.out.println("Floating-point output:");
		System.out.println("START1234567890");
		System.out.printf("START%fEND %n", d);
		System.out.printf("START%.4fEND %n", d);
		System.out.printf("START%.2fEND %n", d);
		System.out.printf("START%12.4fEND %n", d);
		System.out.printf("START%eEND %n", d);
		System.out.printf("START%12.5eEND %n", d);
	}
}
