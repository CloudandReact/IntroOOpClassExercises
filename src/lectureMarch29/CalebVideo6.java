package lectureMarch29;

import java.util.Scanner;

/*
 * Input and Output 
 * link https://www.youtube.com/watch?v=JceW6zvmA_Q&list=PL_c9BZzLwBRKIMP_xNTJxi9lIgQhE51rF&index=6
 */
public class CalebVideo6 {

	public static void main(String[] args) {
		System.out.println("What is your name");
		// Type identifier = Creation of Object/type and specifying we want to do input
		// What is the difference between Scanner and scanner in this example
		// what import do we need to make this work and where is the import?
		Scanner scanner = new Scanner(System.in);
		// alot more verbose full qualified dont need the import
		// java.util.Scanner scanner = new java.util.Scanner(System.in);
		String name = scanner.nextLine(); // difference next and next line()
		
		System.out.println("Hello " + name);

		// static vs non static what is the difference talk more when we get to oop

	}

}
