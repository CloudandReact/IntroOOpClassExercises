package lectureApril5th;

public class PrePostIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		n++;
		System.out.println("n == " + n);
		n--; // n=n-1;
		System.out.println("n == " + n);
		System.out.println("n == " + n++); // post increment
		System.out.println("n == " + ++n); // preincrement
		System.out.println("n == " + n++); // post increment
		System.out.println("n == " + ++n);
		System.out.println("n == " + n--); // post increment
		System.out.println("n == " + --n);

	}

}
