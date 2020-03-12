package FizzBuzz;

import java.util.Scanner;

public class FizzBuzzTest {
	public static void main(String args[]) {
		
		FizzBuzz a = new FizzBuzz();
		
		try (Scanner input = new Scanner(System.in)) {
			int inputnumber = input.nextInt();
			System.out.println(a.fizzBuzz(inputnumber));
		}
	}
}
