package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHand {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to imaginnovate");

		System.out.println("Enter The First Number:- ");

		try {
			int firstNum = in.nextInt();

			System.out.println("Enter The Second Number:- ");
			int secondNumber = in.nextInt();

			int result = firstNum / secondNumber;
			System.out.println("Result:- " + result);
			System.exit(0);
		} catch (InputMismatchException e) {
			System.out.println("Error:- " + e);
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("error :- " + e);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		} finally {
			System.out.println("Thank You...");
		}

		System.out.println("Done...");

		in.close();
	}

}
